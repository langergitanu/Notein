package o0ooOO0;

import oO0Ooo.AbstractC33320OooOoo;

/* JADX INFO: renamed from: o0ooOO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC31500OooO00o implements oO0Oo0o.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f112679OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f112680OooO0O0;

    public AbstractC31500OooO00o(AbstractC33320OooOoo abstractC33320OooOoo, oO0Oo0o.OooO0o oooO0o) {
        if (abstractC33320OooOoo == null) {
            OooO0OO(0);
            throw null;
        }
        this.f112679OooO00o = abstractC33320OooOoo;
        this.f112680OooO0O0 = oooO0o == null ? this : oooO0o;
    }

    public static /* synthetic */ void OooO0OO(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public abstract int[] OooO0Oo(int i);

    public String OooO0o() {
        String str = (String) this.f112679OooO00o;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("text");
        throw null;
    }

    public int[] OooO0o0(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f112680OooO0O0;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public abstract int[] OooO0oO(int i);

    @Override // oO0Oo0o.OooO0o
    public AbstractC33320OooOoo getType() {
        AbstractC33320OooOoo abstractC33320OooOoo = (AbstractC33320OooOoo) this.f112679OooO00o;
        if (abstractC33320OooOoo != null) {
            return abstractC33320OooOoo;
        }
        OooO0OO(1);
        throw null;
    }

    public AbstractC31500OooO00o() {
        this.f112680OooO0O0 = new int[2];
    }
}
