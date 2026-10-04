package oO0OOo;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import oO00ooO.C32443OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0OOOo.C32982OooO;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33479OooO0o;
import oO0Oooo.C33509OooO;
import oO0Oooo.EnumC33517OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O extends AbstractC33038OooO0oO<C32443OooOOO<? extends C33476OooO0O0, ? extends C33479OooO0o>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33476OooO0O0 f119485OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33479OooO0o f119486OooO0OO;

    public OooOO0O(C33476OooO0O0 c33476OooO0O0, C33479OooO0o c33479OooO0o) {
        super(new C32443OooOOO(c33476OooO0O0, c33479OooO0o));
        this.f119485OooO0O0 = c33476OooO0O0;
        this.f119486OooO0OO = c33479OooO0o;
    }

    @Override // oO0OOo.AbstractC33038OooO0oO
    public final AbstractC33320OooOoo OooO00o(InterfaceC32615OooOoo module) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        C33476OooO0O0 c33476OooO0O0 = this.f119485OooO0O0;
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO00o = oO0O0OO.OooOo00.OooO00o(module, c33476OooO0O0);
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = null;
        if (interfaceC32596OooO0o0OooO00o != null) {
            if (!C32982OooO.OooOOO(interfaceC32596OooO0o0OooO00o, oO0O0OO.OooO0o.f117232OooOoO0)) {
                interfaceC32596OooO0o0OooO00o = null;
            }
            if (interfaceC32596OooO0o0OooO00o != null) {
                abstractC33328Oooo0O0OooOOO = interfaceC32596OooO0o0OooO00o.OooOOO();
            }
        }
        if (abstractC33328Oooo0O0OooOOO != null) {
            return abstractC33328Oooo0O0OooOOO;
        }
        EnumC33517OooO0oo enumC33517OooO0oo = EnumC33517OooO0oo.ERROR_ENUM_TYPE;
        String string = c33476OooO0O0.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "enumClassId.toString()");
        String str = this.f119486OooO0OO.f120981OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o(str, "enumEntryName.toString()");
        return C33509OooO.OooO0OO(enumC33517OooO0oo, string, str);
    }

    @Override // oO0OOo.AbstractC33038OooO0oO
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119485OooO0O0.OooO());
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f119486OooO0OO);
        return sb.toString();
    }
}
