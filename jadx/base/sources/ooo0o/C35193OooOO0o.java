package ooo0o;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import oO0O.OooO00o;
import oO0OO0Oo.C32921OooO0o0;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OoOO.EnumC33259OooO;
import oO0OoOO.InterfaceC33271OooOO0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: ooo0o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35193OooOO0o implements InterfaceC33271OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0Oo0.OooO0OO f126367OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0Oo0.OooO0OO f126368OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC35196OooOOo0 f126369OooO0Oo;

    public C35193OooOO0o() {
        throw null;
    }

    public C35193OooOO0o(InterfaceC35196OooOOo0 kotlinClass, oO0OO00.OooOO0O packageProto, oO0OOO.OooO0o nameResolver, EnumC33259OooO enumC33259OooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinClass, "kotlinClass");
        kotlin.jvm.internal.OooOOO0.OooO0oO(packageProto, "packageProto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        oO0Oo0.OooO0OO oooO0OOOooO0O0 = oO0Oo0.OooO0OO.OooO0O0(kotlinClass.getClassId());
        oO0O.OooO00o oooO00oOooO0O0 = kotlinClass.OooO0O0();
        oooO00oOooO0O0.getClass();
        oO0Oo0.OooO0OO OooO0Oo2 = null;
        String str = oooO00oOooO0O0.f116740OooO00o == OooO00o.EnumC20235OooO00o.MULTIFILE_CLASS_PART ? oooO00oOooO0O0.f116744OooO0o : null;
        if (str != null && str.length() > 0) {
            OooO0Oo2 = oO0Oo0.OooO0OO.OooO0Oo(str);
        }
        this.f126367OooO0O0 = oooO0OOOooO0O0;
        this.f126368OooO0OO = OooO0Oo2;
        this.f126369OooO0Oo = kotlinClass;
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooOO0O, Integer> packageModuleName = oO0OOO0.OooO00o.f118841OooOOO0;
        kotlin.jvm.internal.OooOOO0.OooO0o(packageModuleName, "packageModuleName");
        Integer num = (Integer) C32921OooO0o0.OooO00o(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    public final C33476OooO0O0 OooO0O0() {
        C33477OooO0OO c33477OooO0OO;
        oO0Oo0.OooO0OO oooO0OO = this.f126367OooO0O0;
        String str = oooO0OO.f120108OooO00o;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            c33477OooO0OO = C33477OooO0OO.f120970OooO0OO;
            if (c33477OooO0OO == null) {
                oO0Oo0.OooO0OO.OooO00o(7);
                throw null;
            }
        } else {
            c33477OooO0OO = new C33477OooO0OO(str.substring(0, iLastIndexOf).replace(IOUtils.DIR_SEPARATOR_UNIX, FilenameUtils.EXTENSION_SEPARATOR));
        }
        String strOooO0o0 = oooO0OO.OooO0o0();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0o0, "className.internalName");
        return new C33476OooO0O0(c33477OooO0OO, C33479OooO0o.OooO0o0(C33599OooOo0O.OoooOoo(IOUtils.DIR_SEPARATOR_UNIX, strOooO0o0, strOooO0o0)));
    }

    public final String toString() {
        return C35193OooOO0o.class.getSimpleName() + ": " + this.f126367OooO0O0;
    }
}
