package org.wheatgenetics.androidlibrarybuilder;

/**
 * Uses:
 * android.content.Intent
 * android.os.Bundle
 * android.support.v7.app.AppCompatActivity
 * android.view.Menu
 * android.view.MenuInflater
 * android.view.MenuItem
 * android.view.View
 * android.widget.Button
 * android.widget.TextView
 *
 * org.wheatgenetics.about.OtherApps
 * org.wheatgenetics.about.OtherApps.Index
 * org.wheatgenetics.about.OtherAppsAlertDialog
 * org.wheatgenetics.androidlibrary.R
 * org.wheatgenetics.androidlibrarybuilder.R
 * org.wheatgenetics.changelog.ChangeLogAlertDialog
 * org.wheatgenetics.javalib.Utils
 * org.wheatgenetics.usb.DeviceListTester
 * org.wheatgenetics.usb.DeviceReaderTester
 * org.wheatgenetics.usb.DeviceReaderTester.Publisher
 * org.wheatgenetics.usb.ExtraDeviceTester
 * org.wheatgenetics.usb.ScaleTester
 * org.wheatgenetics.usb.ScaleReaderTester
 * org.wheatgenetics.usb.ScaleReaderTester.Publisher
 * org.wheatgenetics.zxing.BarcodeScanner
 */

public class MainActivity extends android.support.v7.app.AppCompatActivity
{
    // region Fields
    private android.widget.TextView textView = null;
    private android.widget.Button   deviceListButton = null,
        scaleButton = null, scaleReaderButton = null;

    private org.wheatgenetics.zxing.BarcodeScanner           barcodeScanner       = null;
    private org.wheatgenetics.changelog.ChangeLogAlertDialog changeLogAlertDialog = null;
    private org.wheatgenetics.about.OtherAppsAlertDialog     otherAppsAlertDialog = null;
    private org.wheatgenetics.usb.DeviceListTester           deviceListTester     = null;
    private org.wheatgenetics.usb.ExtraDeviceTester          extraDeviceTester    = null;
    private org.wheatgenetics.usb.ScaleTester                scaleTester          = null;
    private org.wheatgenetics.usb.DeviceReaderTester         deviceReaderTester   = null;
    private org.wheatgenetics.usb.ScaleReaderTester          scaleReaderTester    = null;

    private int deviceListButtonClickCount = 0,
        scaleButtonClickCount = 0, scaleReaderButtonClickCount = 0;
    // endregion

    // region Private Methods
    // region textView Private Methods
    private void setTextViewText(final java.lang.String text)
    {
        assert null != this.textView;
        this.textView.setText(text);
    }

    private void setAndInvalidateTextViewText(final java.lang.String text)
    {
        this.setTextViewText(text);

        assert null != this.textView;
        this.textView.invalidate() ;
    }
    // endregion

    // region Button Private Methods
    private static void setButtonText(final android.widget.Button button,
    final java.lang.String text)
    {
        assert null != button;
        button.setText(text);
    }


    private void setDeviceListButtonText(final java.lang.String text)
    {
        org.wheatgenetics.androidlibrarybuilder.MainActivity.setButtonText(
            this.deviceListButton, text);
    }

    private void setScaleButtonText(final java.lang.String text)
    {
        org.wheatgenetics.androidlibrarybuilder.MainActivity.setButtonText(
            this.scaleButton, text);
    }

    private void setScaleReaderButtonText(final java.lang.String text)
    {
        org.wheatgenetics.androidlibrarybuilder.MainActivity.setButtonText(
            this.scaleReaderButton, text);
    }


    private void resetDeviceListButtonText() { this.setDeviceListButtonText("DeviceList.size()"); }

    private void resetScaleButtonText()
    { this.setScaleButtonText("ExtraDevice.information()"); }

    private void resetScaleReaderButtonText()
    { this.setScaleReaderButtonText("DeviceReader.execute()"); }
    // endregion
    // endregion

    // region Overridden Methods
    @java.lang.Override
    protected void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(org.wheatgenetics.androidlibrarybuilder.R.layout.activity_main);


        this.textView = (android.widget.TextView)
            this.findViewById(org.wheatgenetics.androidlibrarybuilder.R.id.textView);


        this.deviceListButton = (android.widget.Button)
            this.findViewById(org.wheatgenetics.androidlibrarybuilder.R.id.deviceListButton);
        this.resetDeviceListButtonText();

        this.scaleButton = (android.widget.Button)
            this.findViewById(org.wheatgenetics.androidlibrarybuilder.R.id.scaleButton);
        this.resetScaleButtonText();

        this.scaleReaderButton = (android.widget.Button)
            this.findViewById(org.wheatgenetics.androidlibrarybuilder.R.id.scaleReaderButton);
        this.resetScaleReaderButtonText();
    }

    @java.lang.Override
    public boolean onCreateOptionsMenu(final android.view.Menu menu)
    {
        new android.view.MenuInflater(this).inflate(
            org.wheatgenetics.androidlibrary.R.menu.camera_options_menu, menu);
        return true;
    }

    @java.lang.Override
    public boolean onOptionsItemSelected(final android.view.MenuItem item)
    {
        assert null != item;
        switch (item.getItemId())
        {
            case org.wheatgenetics.androidlibrary.R.id.cameraOptionsMenuItem:
                if (null == this.barcodeScanner)
                    this.barcodeScanner = new org.wheatgenetics.zxing.BarcodeScanner(this);
                this.barcodeScanner.scan();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @java.lang.Override
    protected void onActivityResult(final int requestCode,
    final int resultCode, final android.content.Intent data)
    {
        this.setTextViewText(org.wheatgenetics.javalib.Utils.replaceIfNull(
            org.wheatgenetics.zxing.BarcodeScanner.parseActivityResult(
                requestCode, resultCode, data),
            "null"));
    }
    // endregion

    // region Event Handlers
    public void onChangeLogButtonClick(final android.view.View view) throws java.io.IOException
    {
        if (null == this.changeLogAlertDialog) this.changeLogAlertDialog =
            new org.wheatgenetics.changelog.ChangeLogAlertDialog(
                this, org.wheatgenetics.androidlibrarybuilder.R.raw.changelog);
        this.changeLogAlertDialog.show();
    }

    public void onOtherAppsButtonClick(final android.view.View view)
    {
        if (null == this.otherAppsAlertDialog)
            this.otherAppsAlertDialog = new org.wheatgenetics.about.OtherAppsAlertDialog(
                this, new org.wheatgenetics.about.OtherApps(
                    org.wheatgenetics.about.OtherApps.Index.INVENTORY));
        this.otherAppsAlertDialog.show();
    }

    public void onDeviceListButtonClick(final android.view.View view)
    {
        if (null == this.deviceListTester)
            this.deviceListTester = new org.wheatgenetics.usb.DeviceListTester(this);

        switch (this.deviceListButtonClickCount)
        {
            case 0: this.setTextViewText(this.deviceListTester.size       ()); break;
            case 1: this.setTextViewText(this.deviceListTester.information()); break;
        }

        switch (this.deviceListButtonClickCount)
        {
            case 0:
                this.deviceListButtonClickCount++;
                this.setDeviceListButtonText("DeviceList.information()");
                break;

            default: this.deviceListButtonClickCount = 0; this.resetDeviceListButtonText(); break;
        }
    }

    public void onScaleButtonClick(final android.view.View view)
    {
        switch (this.scaleButtonClickCount)
        {
            case 0: case 1:
                if (null == this.extraDeviceTester)
                    this.extraDeviceTester = new org.wheatgenetics.usb.ExtraDeviceTester(this);
                break;

            case 2: case 3:
                if (null == this.scaleTester)
                    this.scaleTester = new org.wheatgenetics.usb.ScaleTester(this);
                break;
        }

        switch (this.scaleButtonClickCount)
        {
            case 0: this.setTextViewText(this.extraDeviceTester.information          ()); break;
            case 1: this.setTextViewText(this.extraDeviceTester.handlingFormattedRead()); break;
            case 2: this.setTextViewText(this.scaleTester.information                ()); break;
            case 3: this.setTextViewText(this.scaleTester.handlingFormattedRead      ()); break;
        }

        switch (this.scaleButtonClickCount)
        {
            case 0: case 1: case 2: this.scaleButtonClickCount++  ; break;
            default               : this.scaleButtonClickCount = 0; break;
        }

        switch (this.scaleButtonClickCount)
        {
            case 0 : this.resetScaleButtonText()                           ; break;
            case 1 : this.setScaleButtonText("ExtraDevice.formattedRead()"); break;
            case 2 : this.setScaleButtonText("Scale.information()"        ); break;
            case 3 : this.setScaleButtonText("Scale.formattedRead()"      ); break;
            default: this.setScaleButtonText("Error!"                     ); break;
        }
    }

    public void onScaleReaderButtonClick(final android.view.View view)
    {
        switch (this.scaleReaderButtonClickCount)
        {
            case 0: case 1:
                if (null == this.deviceReaderTester)
                    this.deviceReaderTester = new org.wheatgenetics.usb.DeviceReaderTester(this,
                        new org.wheatgenetics.usb.DeviceReaderTester.Publisher()
                        {
                            @java.lang.Override
                            public void publish(String data)
                            {
                                org.wheatgenetics.androidlibrarybuilder.
                                    MainActivity.this.setAndInvalidateTextViewText(data);
                            }
                        });
                break;

            case 2: case 3:
                if (null == this.scaleReaderTester)
                    this.scaleReaderTester = new org.wheatgenetics.usb.ScaleReaderTester(this,
                        new org.wheatgenetics.usb.ScaleReaderTester.Publisher()
                        {
                            @java.lang.Override
                            public void publish(final java.lang.String data)
                            {
                                org.wheatgenetics.androidlibrarybuilder.
                                    MainActivity.this.setAndInvalidateTextViewText(data);
                            }
                        });
                break;
        }

        switch (this.scaleReaderButtonClickCount)
        {
            case 0: this.deviceReaderTester.executeReader(); break;
            case 1: this.deviceReaderTester.cancelReader (); break;
            case 2: this.scaleReaderTester.executeReader (); break;
            case 3: this.scaleReaderTester.cancelReader  (); break;
        }

        switch (this.scaleReaderButtonClickCount)
        {
            case 0: case 1: case 2: this.scaleReaderButtonClickCount++  ; break;
            default               : this.scaleReaderButtonClickCount = 0; break;
        }

        switch (this.scaleReaderButtonClickCount)
        {
            case 0 : this.resetScaleReaderButtonText(); break;
            case 1 : this.setScaleReaderButtonText("DeviceReader.cancel()"); break;
            case 2 : this.setScaleReaderButtonText("ScaleReader.execute()"); break;
            case 3 : this.setScaleReaderButtonText("ScaleReader.cancel()" ); break;
            default: this.setScaleReaderButtonText("Error!"               ); break;
        }
    }
    // endregion
}