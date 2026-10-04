package oO0oO00;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33917OooOO0;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34597OooO0o0;
import oOoo0.InterfaceC34606OooOOOo;
import oOoo0.InterfaceC34608OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class o00oO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InterfaceC33531OooO0o0[] f122272OooO00o = new InterfaceC33531OooO0o0[0];

    public static final Set<String> OooO00o(InterfaceC33531OooO0o0 interfaceC33531OooO0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33531OooO0o0, "<this>");
        if (interfaceC33531OooO0o0 instanceof InterfaceC33945OooOOO0) {
            return ((InterfaceC33945OooOOO0) interfaceC33531OooO0o0).OooO00o();
        }
        HashSet hashSet = new HashSet(interfaceC33531OooO0o0.OooO0o0());
        int iOooO0o0 = interfaceC33531OooO0o0.OooO0o0();
        for (int i = 0; i < iOooO0o0; i++) {
            hashSet.add(interfaceC33531OooO0o0.OooO0o(i));
        }
        return hashSet;
    }

    public static final InterfaceC33531OooO0o0[] OooO0O0(List<? extends InterfaceC33531OooO0o0> list) {
        InterfaceC33531OooO0o0[] interfaceC33531OooO0o0Arr;
        List<? extends InterfaceC33531OooO0o0> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC33531OooO0o0Arr = (InterfaceC33531OooO0o0[]) list.toArray(new InterfaceC33531OooO0o0[0])) == null) ? f122272OooO00o : interfaceC33531OooO0o0Arr;
    }

    public static final InterfaceC34595OooO0Oo<Object> OooO0OO(InterfaceC34606OooOOOo interfaceC34606OooOOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34606OooOOOo, "<this>");
        InterfaceC34597OooO0o0 interfaceC34597OooO0o0OooO0O0 = interfaceC34606OooOOOo.OooO0O0();
        if (interfaceC34597OooO0o0OooO0O0 instanceof InterfaceC34595OooO0Oo) {
            return (InterfaceC34595OooO0Oo) interfaceC34597OooO0o0OooO0O0;
        }
        if (!(interfaceC34597OooO0o0OooO0O0 instanceof InterfaceC34608OooOOo0)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + interfaceC34597OooO0o0OooO0O0);
        }
        throw new IllegalArgumentException("Captured type parameter " + interfaceC34597OooO0o0OooO0O0 + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC34597OooO0o0OooO0O0 + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC34597OooO0o0OooO0O0 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static final void OooO0Oo(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        String strOooOO0 = interfaceC34595OooO0Oo.OooOO0();
        if (strOooOO0 == null) {
            strOooOO0 = "<local class name not available>";
        }
        throw new C33917OooOO0(C20593OooO0Oo.OooO0O0("Serializer for class '", strOooOO0, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
