package org.wheatgenetics.sharedpreferences;

/**
 * Uses:
 * android.content.SharedPreferences
 * android.content.SharedPreferences.Editor
 * android.support.annotation.CallSuper
 * android.support.annotation.NonNull
 * android.support.annotation.RestrictTo
 * android.support.annotation.RestrictTo.Scope
 *
 * org.wheatgenetics.javalib.Utils
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
public abstract class BaseSharedPreferences extends java.lang.Object
{
    private final android.content.SharedPreferences sharedPreferences;

    private void setBoolean(@android.support.annotation.NonNull final java.lang.String key,
    final boolean value)
    {
        if (this.getBoolean(key) != value)
        {
            final android.content.SharedPreferences.Editor editor = this.sharedPreferences.edit();
            assert null != editor; editor.putBoolean(key, value); editor.apply();
        }
    }

    @android.support.annotation.RestrictTo(android.support.annotation.RestrictTo.Scope.SUBCLASSES)
    @android.support.annotation.CallSuper
    protected void validateStringKey(@android.support.annotation.NonNull final java.lang.String key)
    { throw new java.lang.AssertionError(key + " is not a valid key."); }

    public BaseSharedPreferences(@android.support.annotation.NonNull
    final android.content.SharedPreferences sharedPreferences)
    { super(); this.sharedPreferences = sharedPreferences; }

    // region Public Methods
    // region String Public Methods
    public java.lang.String getString(
    @android.support.annotation.NonNull final java.lang.String key, final boolean validateKey)
    {
        if (validateKey) this.validateStringKey(key);
        return this.sharedPreferences.getString(key, "");
    }

    public java.lang.String getString(
    @android.support.annotation.NonNull final java.lang.String key)
    { return this.getString(key, /* validateKey => */ false); }

    public void setString(
    @android.support.annotation.NonNull final java.lang.String key        ,
    @android.support.annotation.NonNull final java.lang.String oldValue   ,
                                              java.lang.String newValue   ,
                                        final boolean          validateKey)
    {
        newValue = org.wheatgenetics.javalib.Utils.makeEmptyIfNull(newValue);
        if (!oldValue.equals(newValue))
        {
            if (validateKey) this.validateStringKey(key);

            final android.content.SharedPreferences.Editor editor = this.sharedPreferences.edit();
            assert null != editor; editor.putString(key, newValue); editor.apply();
        }
    }

    public void setString(@android.support.annotation.NonNull final java.lang.String key     ,
                          @android.support.annotation.NonNull final java.lang.String oldValue,
                                                              final java.lang.String newValue)
    { this.setString(key, oldValue, newValue, /* validateKey => */ false); }
    // endregion

    // region Integer Public Methods
    public int getInt(@android.support.annotation.NonNull final java.lang.String key)
    { return this.sharedPreferences.getInt(key, -1); }

    public void setInt(@android.support.annotation.NonNull final java.lang.String key,
    final int newInt)
    {
        if (this.getInt(key) != newInt)
        {
            final android.content.SharedPreferences.Editor editor = this.sharedPreferences.edit();
            assert null != editor; editor.putInt(key, newInt); editor.apply();
        }
    }
    // endregion

    // region Long Public Methods
    public long getLong(@android.support.annotation.NonNull final java.lang.String key)
    { return this.sharedPreferences.getLong(key, -1); }

    public void setLong(@android.support.annotation.NonNull final java.lang.String key,
    final long newLong)
    {
        if (this.getLong(key) != newLong)
        {
            final android.content.SharedPreferences.Editor editor = this.sharedPreferences.edit();
            assert null != editor; editor.putLong(key, newLong); editor.apply();
        }
    }
    // endregion

    // region Boolean Public Methods
    public java.lang.Boolean getBoolean(
    @android.support.annotation.NonNull final java.lang.String key)
    { return this.sharedPreferences.getBoolean(key, false); }

    public void setBooleanToTrue(@android.support.annotation.NonNull final java.lang.String key)
    { this.setBoolean(key, true); }

    public void setBooleanToFalse(@android.support.annotation.NonNull final java.lang.String key)
    { this.setBoolean(key, false); }
    // endregion
    // endregion
}