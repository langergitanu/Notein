package oO0Ooo;

import com.huawei.hms.network.embedded.C18437z2;
import oO0OooO.AbstractC33457OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33351Oooooo0 extends AbstractC33349OooooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f120622OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC33320OooOoo f120623OooO0O0;

    public C33351Oooooo0(int i, AbstractC33320OooOoo abstractC33320OooOoo) {
        if (i == 0) {
            OooO0Oo(0);
            throw null;
        }
        if (abstractC33320OooOoo == null) {
            OooO0Oo(1);
            throw null;
        }
        this.f120622OooO00o = i;
        this.f120623OooO0O0 = abstractC33320OooOoo;
    }

    public static /* synthetic */ void OooO0Oo(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = C18437z2.f56754h;
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // oO0Ooo.InterfaceC33348OooooOO
    public final boolean OooO00o() {
        return false;
    }

    @Override // oO0Ooo.InterfaceC33348OooooOO
    public final InterfaceC33348OooooOO OooO0O0(AbstractC33457OooO0oO abstractC33457OooO0oO) {
        if (abstractC33457OooO0oO != null) {
            return new C33351Oooooo0(this.f120622OooO00o, abstractC33457OooO0oO.Oooo0o0(this.f120623OooO0O0));
        }
        OooO0Oo(6);
        throw null;
    }

    @Override // oO0Ooo.InterfaceC33348OooooOO
    public final int OooO0OO() {
        int i = this.f120622OooO00o;
        if (i != 0) {
            return i;
        }
        OooO0Oo(4);
        throw null;
    }

    @Override // oO0Ooo.InterfaceC33348OooooOO
    public final AbstractC33320OooOoo getType() {
        AbstractC33320OooOoo abstractC33320OooOoo = this.f120623OooO0O0;
        if (abstractC33320OooOoo != null) {
            return abstractC33320OooOoo;
        }
        OooO0Oo(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33351Oooooo0(AbstractC33320OooOoo abstractC33320OooOoo) {
        this(1, abstractC33320OooOoo);
        if (abstractC33320OooOoo != null) {
        } else {
            OooO0Oo(2);
            throw null;
        }
    }
}
