package oO0OOOO;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import o0oOOoOO.C30847OooO0Oo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0OOOo.C32982OooO;
import oO0OooO0.C33478OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34446Oooo0o;

/* JADX INFO: loaded from: classes10.dex */
public interface OooO0O0 {

    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f118958OooO00o = new OooO00o();

        @Override // oO0OOOO.OooO0O0
        public final String OooO00o(InterfaceC32598OooO0oo interfaceC32598OooO0oo, C32944OooO0Oo c32944OooO0Oo) {
            if (interfaceC32598OooO0oo instanceof InterfaceC32637OoooOoo) {
                C33479OooO0o name = ((InterfaceC32637OoooOoo) interfaceC32598OooO0oo).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "classifier.name");
                return c32944OooO0Oo.Oooo0oO(name, false);
            }
            C33478OooO0Oo c33478OooO0OoOooO0oO = C32982OooO.OooO0oO(interfaceC32598OooO0oo);
            kotlin.jvm.internal.OooOOO0.OooO0o(c33478OooO0OoOooO0oO, "getFqName(classifier)");
            return c32944OooO0Oo.OooOOOO(C30847OooO0Oo.OooO0OO(c33478OooO0OoOooO0oO.OooO0o0()));
        }
    }

    /* JADX INFO: renamed from: oO0OOOO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20284OooO0O0 implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20284OooO0O0 f118959OooO00o = new C20284OooO0O0();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [oO0O0OO.OooO0oo] */
        /* JADX WARN: Type inference failed for: r2v1, types: [oO0O0OO.OooOO0O] */
        /* JADX WARN: Type inference failed for: r2v2, types: [oO0O0OO.OooOO0O] */
        @Override // oO0OOOO.OooO0O0
        public final String OooO00o(InterfaceC32598OooO0oo interfaceC32598OooO0oo, C32944OooO0Oo c32944OooO0Oo) {
            if (interfaceC32598OooO0oo instanceof InterfaceC32637OoooOoo) {
                C33479OooO0o name = ((InterfaceC32637OoooOoo) interfaceC32598OooO0oo).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "classifier.name");
                return c32944OooO0Oo.Oooo0oO(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(interfaceC32598OooO0oo.getName());
                interfaceC32598OooO0oo = interfaceC32598OooO0oo.OooO0Oo();
            } while (interfaceC32598OooO0oo instanceof InterfaceC32596OooO0o0);
            return C30847OooO0Oo.OooO0OO(new C34446Oooo0o(arrayList));
        }
    }

    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f118960OooO00o = new OooO0OO();

        public static String OooO0O0(InterfaceC32598OooO0oo interfaceC32598OooO0oo) {
            String strOooO0OO;
            C33479OooO0o name = interfaceC32598OooO0oo.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name, "descriptor.name");
            String strOooO0O0 = C30847OooO0Oo.OooO0O0(name);
            if (!(interfaceC32598OooO0oo instanceof InterfaceC32637OoooOoo)) {
                oO0O0OO.OooOO0O oooOO0OOooO0Oo = interfaceC32598OooO0oo.OooO0Oo();
                kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OOooO0Oo, "descriptor.containingDeclaration");
                if (oooOO0OOooO0Oo instanceof InterfaceC32596OooO0o0) {
                    strOooO0OO = OooO0O0((InterfaceC32598OooO0oo) oooOO0OOooO0Oo);
                } else if (oooOO0OOooO0Oo instanceof InterfaceC32620Oooo00O) {
                    C33478OooO0Oo c33478OooO0OoOooO = ((InterfaceC32620Oooo00O) oooOO0OOooO0Oo).OooO0OO().OooO();
                    kotlin.jvm.internal.OooOOO0.OooO0o(c33478OooO0OoOooO, "descriptor.fqName.toUnsafe()");
                    strOooO0OO = C30847OooO0Oo.OooO0OO(c33478OooO0OoOooO.OooO0o0());
                } else {
                    strOooO0OO = null;
                }
                if (strOooO0OO != null && !strOooO0OO.equals("")) {
                    return strOooO0OO + FilenameUtils.EXTENSION_SEPARATOR + strOooO0O0;
                }
            }
            return strOooO0O0;
        }

        @Override // oO0OOOO.OooO0O0
        public final String OooO00o(InterfaceC32598OooO0oo interfaceC32598OooO0oo, C32944OooO0Oo c32944OooO0Oo) {
            return OooO0O0(interfaceC32598OooO0oo);
        }
    }

    String OooO00o(InterfaceC32598OooO0oo interfaceC32598OooO0oo, C32944OooO0Oo c32944OooO0Oo);
}
