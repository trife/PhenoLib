package org.wheatgenetics.androidlibrarybuilder.mstrdtl;

/**
 * Uses:
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.androidlibrary.mstrdtl.OnePaneAdapter
 *
 * org.wheatgenetics.androidlibrarybuilder.mstrdtl.ItemActivity
 */
class OnePaneAdapter extends org.wheatgenetics.androidlibrary.mstrdtl.OnePaneAdapter
{
    OnePaneAdapter(final org.wheatgenetics.javalib.mstrdtl.Items items) { super(items); }

    @java.lang.Override protected java.lang.Class concreteItemActivityClass()
    { return org.wheatgenetics.androidlibrarybuilder.mstrdtl.ItemActivity.class; }
}