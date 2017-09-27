package org.wheatgenetics.androidlibrary;

/**
 * Uses:
 * android.content.Context
 * android.content.DialogInterface
 * android.content.DialogInterface.OnClickListener
 * android.content.Intent
 * android.media.MediaScannerConnection
 * android.net.Uri
 * android.widget.EditText
 * android.widget.Toast
 *
 * org.wheatgenetics.javalib.Utils
 *
 * org.wheatgenetics.androidlibrary.R
 */
public class Utils extends java.lang.Object
{
    private static android.content.DialogInterface.OnClickListener
        dismissingOnClickListenerInstance = null, cancellingOnClickListenerInstance = null;

    // region OnClickListener Methods
    public static android.content.DialogInterface.OnClickListener dismissingOnClickListener()
    {
        if (null == org.wheatgenetics.androidlibrary.Utils.dismissingOnClickListenerInstance)
            org.wheatgenetics.androidlibrary.Utils.dismissingOnClickListenerInstance =
                new android.content.DialogInterface.OnClickListener()
                {
                    @java.lang.Override
                    public void onClick(final android.content.DialogInterface dialog,
                    final int which)
                    {
                        assert null != dialog;
                        dialog.dismiss();
                    }
                };
        return org.wheatgenetics.androidlibrary.Utils.dismissingOnClickListenerInstance;
    }

    public static android.content.DialogInterface.OnClickListener cancellingOnClickListener()
    {
        if (null == org.wheatgenetics.androidlibrary.Utils.cancellingOnClickListenerInstance)
            org.wheatgenetics.androidlibrary.Utils.cancellingOnClickListenerInstance =
                new android.content.DialogInterface.OnClickListener()
                {
                    @java.lang.Override
                    public void onClick(final android.content.DialogInterface dialog,
                    final int which)
                    {
                        assert null != dialog;
                        dialog.cancel();
                    }
                };
        return org.wheatgenetics.androidlibrary.Utils.cancellingOnClickListenerInstance;
    }
    // endregion

    // region Toast Methods
    private static void showToast(final android.content.Context context,
    final java.lang.CharSequence text, final int duration)
    { android.widget.Toast.makeText(context, text, duration).show(); }

    public static void showLongToast(final android.content.Context context,
    final java.lang.CharSequence text)
    {
        org.wheatgenetics.androidlibrary.Utils.showToast(
            context, text, android.widget.Toast.LENGTH_LONG);
    }

    public static void showShortToast(final android.content.Context context,
    final java.lang.CharSequence text)
    {
        org.wheatgenetics.androidlibrary.Utils.showToast(
            context, text, android.widget.Toast.LENGTH_SHORT);
    }
    // endregion

    // region File Methods
    public static java.io.File makeFileDiscoverable(final android.content.Context context,
    final java.io.File file)
    {
        if (null != file)
        {
            android.media.MediaScannerConnection.scanFile(
                /* context   => */ context                                                    ,
                /* paths     => */ org.wheatgenetics.javalib.Utils.stringArray(file.getPath()),
                /* mimeTypes => */ null                                                       ,
                /* callback  => */ null                                                       );
            assert null != context;
            context.sendBroadcast(new android.content.Intent(
                /* action => */ android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,
                /* uri    => */ android.net.Uri.fromFile(file)                       ));
        }
        return file;
    }

    public static void shareFile(final android.content.Context context, final android.net.Uri uri)
    {
        final android.content.Intent intent =
            new android.content.Intent(android.content.Intent.ACTION_SEND)
                .setType ("text/plain")
                .putExtra(android.content.Intent.EXTRA_STREAM, uri);

        assert null != context; context.startActivity(android.content.Intent.createChooser(
            intent, context.getString(org.wheatgenetics.androidlibrary.R.string.sendingFile)));
    }
    // endregion

    public static java.lang.String getText(final android.widget.EditText editText)
    {
        assert null != editText;
        return org.wheatgenetics.javalib.Utils.adjust(editText.getText().toString());
    }
}