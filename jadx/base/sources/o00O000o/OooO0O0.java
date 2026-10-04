package o00O000o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f84079OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseIntArray f84080OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f84081OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Parcel f84082OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f84083OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f84084OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f84085OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f84086OooOO0O;

    public OooO0O0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new OooOo.OooO00o(), new OooOo.OooO00o(), new OooOo.OooO00o());
    }

    @Override // o00O000o.OooO00o
    public final int OooO() {
        return this.f84082OooO0o0.readInt();
    }

    @Override // o00O000o.OooO00o
    public final OooO0O0 OooO00o() {
        Parcel parcel = this.f84082OooO0o0;
        int iDataPosition = parcel.dataPosition();
        int i = this.f84085OooOO0;
        if (i == this.f84081OooO0o) {
            i = this.f84083OooO0oO;
        }
        return new OooO0O0(parcel, iDataPosition, i, androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.f84084OooO0oo, "  "), this.f84076OooO00o, this.f84077OooO0O0, this.f84078OooO0OO);
    }

    @Override // o00O000o.OooO00o
    public final byte[] OooO0o() {
        Parcel parcel = this.f84082OooO0o0;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // o00O000o.OooO00o
    public final boolean OooO0o0() {
        return this.f84082OooO0o0.readInt() != 0;
    }

    @Override // o00O000o.OooO00o
    public final CharSequence OooO0oO() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f84082OooO0o0);
    }

    @Override // o00O000o.OooO00o
    public final boolean OooO0oo(int i) {
        while (this.f84085OooOO0 < this.f84083OooO0oO) {
            int i2 = this.f84086OooOO0O;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f84085OooOO0;
            Parcel parcel = this.f84082OooO0o0;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f84086OooOO0O = parcel.readInt();
            this.f84085OooOO0 += i4;
        }
        return this.f84086OooOO0O == i;
    }

    @Override // o00O000o.OooO00o
    public final <T extends Parcelable> T OooOO0O() {
        return (T) this.f84082OooO0o0.readParcelable(OooO0O0.class.getClassLoader());
    }

    @Override // o00O000o.OooO00o
    public final String OooOO0o() {
        return this.f84082OooO0o0.readString();
    }

    @Override // o00O000o.OooO00o
    public final void OooOOO(int i) {
        OooOo0o();
        this.f84079OooO = i;
        this.f84080OooO0Oo.put(i, this.f84082OooO0o0.dataPosition());
        OooOOo(0);
        OooOOo(i);
    }

    @Override // o00O000o.OooO00o
    public final void OooOOOO(boolean z) {
        this.f84082OooO0o0.writeInt(z ? 1 : 0);
    }

    @Override // o00O000o.OooO00o
    public final void OooOOOo(byte[] bArr) {
        Parcel parcel = this.f84082OooO0o0;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // o00O000o.OooO00o
    public final void OooOOo(int i) {
        this.f84082OooO0o0.writeInt(i);
    }

    @Override // o00O000o.OooO00o
    public final void OooOOo0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f84082OooO0o0, 0);
    }

    @Override // o00O000o.OooO00o
    public final void OooOo0(String str) {
        this.f84082OooO0o0.writeString(str);
    }

    @Override // o00O000o.OooO00o
    public final void OooOo00(Parcelable parcelable) {
        this.f84082OooO0o0.writeParcelable(parcelable, 0);
    }

    public final void OooOo0o() {
        int i = this.f84079OooO;
        if (i >= 0) {
            int i2 = this.f84080OooO0Oo.get(i);
            Parcel parcel = this.f84082OooO0o0;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public OooO0O0(Parcel parcel, int i, int i2, String str, OooOo.OooO00o<String, Method> oooO00o, OooOo.OooO00o<String, Method> oooO00o2, OooOo.OooO00o<String, Class> oooO00o3) {
        super(oooO00o, oooO00o2, oooO00o3);
        this.f84080OooO0Oo = new SparseIntArray();
        this.f84079OooO = -1;
        this.f84086OooOO0O = -1;
        this.f84082OooO0o0 = parcel;
        this.f84081OooO0o = i;
        this.f84083OooO0oO = i2;
        this.f84085OooOO0 = i;
        this.f84084OooO0oo = str;
    }
}
