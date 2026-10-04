package oO0oOo0;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.C22245OooO0oO;
import java.io.IOException;
import oO0oO0Oo.AbstractC34026OooOOOO;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.InterfaceC34017OooO0o;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.Oooo0;
import oO0oOOoo.C34135OooO0OO;
import oO0oOo00.C34166OooO00o;
import oOO000oO.C34336OooO0o;

/* JADX INFO: renamed from: oO0oOo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34152OooOO0o extends oO0oO0Oo.OooOo00 implements InterfaceC34017OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f122718OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC34019OooO0oO f122719OooOo0o;

    public C34152OooOO0o(int i, oO0oO0Oo.OooOo00 oooOo00) {
        this.f122719OooOo0o = oooOo00;
        this.f122718OooOo = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C34152OooOO0o OooO0oo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        C34032OooOo0O c34032OooOo0OOooOOo;
        if (interfaceC34019OooO0oO == 0 || (interfaceC34019OooO0oO instanceof C34152OooOO0o)) {
            return (C34152OooOO0o) interfaceC34019OooO0oO;
        }
        if (!(interfaceC34019OooO0oO instanceof Oooo0)) {
            if (!(interfaceC34019OooO0oO instanceof byte[])) {
                throw new IllegalArgumentException("unknown object in getInstance: ".concat(interfaceC34019OooO0oO.getClass().getName()));
            }
            try {
                return OooO0oo(AbstractC34036OooOoOO.OooOOO((byte[]) interfaceC34019OooO0oO));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        }
        Oooo0 oooo0 = (Oooo0) interfaceC34019OooO0oO;
        AbstractC34039OooOooO.OooO00o oooO00o = AbstractC34039OooOooO.f122370OooOo;
        int i = oooo0.f122380OooOoO0;
        switch (i) {
            case 0:
            case 3:
            case 5:
                return new C34152OooOO0o(i, (AbstractC34039OooOooO) oooO00o.OooO0o0(oooo0, false));
            case 1:
            case 2:
            case 6:
                return new C34152OooOO0o(i, (AbstractC34026OooOOOO) AbstractC34026OooOOOO.f122341OooOo.OooO0o0(oooo0, false));
            case 4:
                C34166OooO00o c34166OooO00o = C34135OooO0OO.f122669OooOoo0;
                return new C34152OooOO0o(i, C34135OooO0OO.OooO0oo((AbstractC34039OooOooO) oooO00o.OooO0o0(oooo0, true)));
            case 7:
                return new C34152OooOO0o(i, (AbstractC34033OooOo0o) AbstractC34033OooOo0o.f122360OooOo.OooO0o0(oooo0, false));
            case 8:
                C34032OooOo0O.OooO00o oooO00o2 = C34032OooOo0O.f122355OooOoO0;
                int i2 = oooo0.f122378OooOo0o;
                if (i2 == 3 || i2 == 4) {
                    c34032OooOo0OOooOOo = (C34032OooOo0O) C34032OooOo0O.f122355OooOoO0.OooO0o0(oooo0, false);
                } else {
                    AbstractC34036OooOoOO abstractC34036OooOoOOOooOo00 = oooo0.OooOo00();
                    if (!(abstractC34036OooOoOOOooOo00 instanceof C34032OooOo0O)) {
                        c34032OooOo0OOooOOo = C34032OooOo0O.OooOOo(AbstractC34033OooOo0o.OooOOo0(abstractC34036OooOoOOOooOo00).f122362OooOo0o, true);
                    }
                }
                return new C34152OooOO0o(i, c34032OooOo0OOooOOo);
            default:
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "unknown tag: "));
        }
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        int i = this.f122718OooOo;
        return new C34079o0ooOoO(i == 4, i, this.f122719OooOo0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        AbstractC34026OooOOOO abstractC34026OooOOOO;
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.f122718OooOo;
        stringBuffer.append(i);
        stringBuffer.append(": ");
        InterfaceC34019OooO0oO interfaceC34019OooO0oO = this.f122719OooOo0o;
        if (i == 1 || i == 2) {
            if (interfaceC34019OooO0oO != 0 || (interfaceC34019OooO0oO instanceof AbstractC34026OooOOOO)) {
                abstractC34026OooOOOO = (AbstractC34026OooOOOO) interfaceC34019OooO0oO;
            } else {
                AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = interfaceC34019OooO0oO.OooO0o();
                if (abstractC34036OooOoOOOooO0o instanceof AbstractC34026OooOOOO) {
                    abstractC34026OooOOOO = (AbstractC34026OooOOOO) abstractC34036OooOoOOOooO0o;
                } else {
                    if (!(interfaceC34019OooO0oO instanceof byte[])) {
                        throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC34019OooO0oO.getClass().getName()));
                    }
                    try {
                        AbstractC34036OooOoOO abstractC34036OooOoOOOooOOO = AbstractC34036OooOoOO.OooOOO((byte[]) interfaceC34019OooO0oO);
                        if (!AbstractC34026OooOOOO.class.isInstance(abstractC34036OooOoOOOooOOO)) {
                            throw new IllegalStateException("unexpected object: ".concat(abstractC34036OooOoOOOooOOO.getClass().getName()));
                        }
                        abstractC34026OooOOOO = (AbstractC34026OooOOOO) abstractC34036OooOoOOOooOOO;
                    } catch (Exception e) {
                        throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
                    }
                }
            }
            stringBuffer.append(C34336OooO0o.OooO00o(abstractC34026OooOOOO.f122342OooOo0o));
        } else {
            if (i != 4) {
                if (i != 6) {
                    string = interfaceC34019OooO0oO.toString();
                }
                if (interfaceC34019OooO0oO != 0) {
                    abstractC34026OooOOOO = (AbstractC34026OooOOOO) interfaceC34019OooO0oO;
                    stringBuffer.append(C34336OooO0o.OooO00o(abstractC34026OooOOOO.f122342OooOo0o));
                }
            } else {
                string = C34135OooO0OO.OooO0oo(interfaceC34019OooO0oO).toString();
            }
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }
}
