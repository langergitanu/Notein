package oO0Oooo;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22220Oooo00o;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.OooO0O0;
import oO0O0OO.OooOO0O;
import oO0O0OO.o000oOoO;
import oO0Oo0o0.C33216OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0Oooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33515OooO0o0 implements oO0Oo0o0.OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f121051OooO0O0;

    public C33515OooO0o0(int i, String... formatParams) {
        String str;
        C22220Oooo00o.OooO0OO(i, "kind");
        OooOOO0.OooO0oO(formatParams, "formatParams");
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
        switch (i) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        this.f121051OooO0O0 = String.format(str, objArrCopyOf2);
    }

    @Override // oO0Oo0o0.OooOO0
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public Set OooO0O0(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        OooOOO0.OooO0oO(name, "name");
        return C33509OooO.f121036OooO0o;
    }

    @Override // oO0Oo0o0.OooOO0
    public Set<C33479OooO0o> OooO00o() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    @Override // oO0Oo0o0.OooOO0
    public Set<C33479OooO0o> OooO0OO() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    @Override // oO0Oo0o0.OooOO0
    public Set<C33479OooO0o> OooO0Oo() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    @Override // oO0Oo0o0.OooOOO0
    public Collection<OooOO0O> OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        OooOOO0.OooO0oO(kindFilter, "kindFilter");
        OooOOO0.OooO0oO(nameFilter, "nameFilter");
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0Oo0o0.OooOOO0
    public InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(location, "location");
        return new C33510OooO00o(C33479OooO0o.OooO0oO(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1))));
    }

    @Override // oO0Oo0o0.OooOO0
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public Set OooO0o(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        OooOOO0.OooO0oO(name, "name");
        C33510OooO00o containingDeclaration = C33509OooO.f121034OooO0OO;
        OooOOO0.OooO0oO(containingDeclaration, "containingDeclaration");
        C33511OooO0O0 c33511OooO0O0 = new C33511OooO0O0(containingDeclaration, null, InterfaceC34588OooO0oO.OooO00o.f123919OooO00o, C33479OooO0o.OooO0oO("<Error function>"), OooO0O0.OooO00o.f117222OooOo0o, o000oOoO.f117308OooO00o);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        c33511OooO0O0.o00000O(null, null, c34434OooOoO, c34434OooOoO, c34434OooOoO, C33509OooO.OooO0OO(EnumC33517OooO0oo.RETURN_TYPE_FOR_FUNCTION, new String[0]), EnumC32614OooOoOO.f117263OooOoO0, C32602OooOOo0.f117243OooO0o0);
        return C34449Oooo0oo.OooOO0(c33511OooO0O0);
    }

    public String toString() {
        return C21111o0ooOoO.OooO0OO(this.f121051OooO0O0, '}', new StringBuilder("ErrorScope{"));
    }
}
