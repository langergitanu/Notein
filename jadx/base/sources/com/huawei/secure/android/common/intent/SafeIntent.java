package com.huawei.secure.android.common.intent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import o0O00OoO.C25841OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class SafeIntent extends Intent {
    public SafeIntent(Intent intent) {
        super(intent == null ? new Intent() : intent);
    }

    public final String OooO00o() {
        try {
            String action = super.getAction();
            return action == null ? "" : action;
        } catch (Exception unused) {
            return "";
        }
    }

    public final boolean OooO0O0() {
        boolean z;
        try {
            super.getStringExtra("ANYTHING");
            z = false;
        } catch (Exception unused) {
            z = true;
        }
        if (z) {
            C25841OooO00o.OooO0OO("SafeIntent", "hasIntentBomb");
        }
        return z;
    }

    @Override // android.content.Intent
    public final String getAction() {
        try {
            return super.getAction();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public final boolean[] getBooleanArrayExtra(String str) {
        try {
            return super.getBooleanArrayExtra(str);
        } catch (Exception unused) {
            return new boolean[0];
        }
    }

    @Override // android.content.Intent
    public final boolean getBooleanExtra(String str, boolean z) {
        try {
            return super.getBooleanExtra(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // android.content.Intent
    public final Bundle getBundleExtra(String str) {
        try {
            return super.getBundleExtra(str);
        } catch (Exception unused) {
            return new Bundle();
        }
    }

    @Override // android.content.Intent
    public final byte[] getByteArrayExtra(String str) {
        try {
            return super.getByteArrayExtra(str);
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // android.content.Intent
    public final byte getByteExtra(String str, byte b) {
        try {
            return super.getByteExtra(str, b);
        } catch (Exception unused) {
            return b;
        }
    }

    @Override // android.content.Intent
    public final char[] getCharArrayExtra(String str) {
        try {
            return super.getCharArrayExtra(str);
        } catch (Exception unused) {
            return new char[0];
        }
    }

    @Override // android.content.Intent
    public final char getCharExtra(String str, char c) {
        try {
            return super.getCharExtra(str, c);
        } catch (Exception unused) {
            return c;
        }
    }

    @Override // android.content.Intent
    public final CharSequence[] getCharSequenceArrayExtra(String str) {
        try {
            return super.getCharSequenceArrayExtra(str);
        } catch (Exception unused) {
            return new CharSequence[0];
        }
    }

    @Override // android.content.Intent
    public final ArrayList<CharSequence> getCharSequenceArrayListExtra(String str) {
        try {
            return super.getCharSequenceArrayListExtra(str);
        } catch (Exception unused) {
            return new ArrayList<>();
        }
    }

    @Override // android.content.Intent
    public final CharSequence getCharSequenceExtra(String str) {
        try {
            return super.getCharSequenceExtra(str);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public final double[] getDoubleArrayExtra(String str) {
        try {
            return super.getDoubleArrayExtra(str);
        } catch (Exception unused) {
            return new double[0];
        }
    }

    @Override // android.content.Intent
    public final double getDoubleExtra(String str, double d) {
        try {
            return super.getDoubleExtra(str, d);
        } catch (Exception unused) {
            return d;
        }
    }

    @Override // android.content.Intent
    public final Bundle getExtras() {
        try {
            return super.getExtras();
        } catch (Exception unused) {
            return new Bundle();
        }
    }

    @Override // android.content.Intent
    public final float[] getFloatArrayExtra(String str) {
        try {
            return super.getFloatArrayExtra(str);
        } catch (Exception unused) {
            return new float[0];
        }
    }

    @Override // android.content.Intent
    public final float getFloatExtra(String str, float f) {
        try {
            return super.getFloatExtra(str, f);
        } catch (Exception unused) {
            return f;
        }
    }

    @Override // android.content.Intent
    public final int[] getIntArrayExtra(String str) {
        try {
            return super.getIntArrayExtra(str);
        } catch (Exception unused) {
            return new int[0];
        }
    }

    @Override // android.content.Intent
    public final int getIntExtra(String str, int i) {
        try {
            return super.getIntExtra(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    @Override // android.content.Intent
    public final ArrayList<Integer> getIntegerArrayListExtra(String str) {
        try {
            return super.getIntegerArrayListExtra(str);
        } catch (Exception unused) {
            return new ArrayList<>();
        }
    }

    @Override // android.content.Intent
    public final long[] getLongArrayExtra(String str) {
        try {
            return super.getLongArrayExtra(str);
        } catch (Exception unused) {
            return new long[0];
        }
    }

    @Override // android.content.Intent
    public final long getLongExtra(String str, long j) {
        try {
            return super.getLongExtra(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    @Override // android.content.Intent
    public final Parcelable[] getParcelableArrayExtra(String str) {
        try {
            return super.getParcelableArrayExtra(str);
        } catch (Exception unused) {
            return new Parcelable[0];
        }
    }

    @Override // android.content.Intent
    public final <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(String str) {
        try {
            return super.getParcelableArrayListExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final <T extends Parcelable> T getParcelableExtra(String str) {
        try {
            return (T) super.getParcelableExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final Serializable getSerializableExtra(String str) {
        try {
            return super.getSerializableExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final short[] getShortArrayExtra(String str) {
        try {
            return super.getShortArrayExtra(str);
        } catch (Exception unused) {
            return new short[0];
        }
    }

    @Override // android.content.Intent
    public final short getShortExtra(String str, short s) {
        try {
            return super.getShortExtra(str, s);
        } catch (Exception unused) {
            return s;
        }
    }

    @Override // android.content.Intent
    public final String[] getStringArrayExtra(String str) {
        try {
            return super.getStringArrayExtra(str);
        } catch (Exception unused) {
            return new String[0];
        }
    }

    @Override // android.content.Intent
    public final ArrayList<String> getStringArrayListExtra(String str) {
        try {
            return super.getStringArrayListExtra(str);
        } catch (Exception unused) {
            return new ArrayList<>();
        }
    }

    @Override // android.content.Intent
    public final String getStringExtra(String str) {
        try {
            return super.getStringExtra(str);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public final boolean hasExtra(String str) {
        try {
            return super.hasExtra(str);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Parcelable parcelable) {
        try {
            return super.putExtra(str, parcelable);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtras(Intent intent) {
        try {
            return super.putExtras(intent);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putParcelableArrayListExtra(String str, ArrayList<? extends Parcelable> arrayList) {
        try {
            return super.putParcelableArrayListExtra(str, arrayList);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent setAction(String str) {
        try {
            return super.setAction(str);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent setPackage(String str) {
        try {
            return super.setPackage(str);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final void setSelector(Intent intent) {
        try {
            super.setSelector(intent);
        } catch (Exception e) {
            C25841OooO00o.OooO0O0("setSelector: " + e.getMessage());
        }
    }

    @Override // android.content.Intent
    @Deprecated
    public final String toURI() {
        try {
            return super.toURI();
        } catch (Exception e) {
            C25841OooO00o.OooO0O0("toURI: exception " + e.getMessage());
            return "";
        }
    }

    @Override // android.content.Intent
    public final String toUri(int i) {
        try {
            return super.toUri(i);
        } catch (Exception e) {
            C25841OooO00o.OooO0O0("toUri: " + e.getMessage());
            return "";
        }
    }

    @Override // android.content.Intent
    public final <T extends Serializable> T getSerializableExtra(String str, Class<T> cls) {
        try {
            Serializable serializableExtra = super.getSerializableExtra(str);
            if (cls.isInstance(serializableExtra)) {
                return cls.cast(serializableExtra);
            }
            return null;
        } catch (Exception e) {
            C25841OooO00o.OooO0O0("getSerializable exception: " + e.getMessage());
            return null;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Parcelable[] parcelableArr) {
        try {
            return super.putExtra(str, parcelableArr);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Serializable serializable) {
        try {
            return super.putExtra(str, serializable);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, String str2) {
        try {
            return super.putExtra(str, str2);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, String[] strArr) {
        try {
            return super.putExtra(str, strArr);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, CharSequence charSequence) {
        try {
            return super.putExtra(str, charSequence);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, CharSequence[] charSequenceArr) {
        try {
            return super.putExtra(str, charSequenceArr);
        } catch (Exception unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Bundle bundle) {
        try {
            return super.putExtra(str, bundle);
        } catch (Exception unused) {
            return this;
        }
    }
}
