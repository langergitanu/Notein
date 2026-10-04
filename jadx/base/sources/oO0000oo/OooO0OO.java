package oO0000oo;

import com.aspose.words.ControlChar;
import java.util.BitSet;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.EnumC33776Ooooooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33780o00Ooo;
import oO0o0Oo.InterfaceC33788ooOO;

/* JADX INFO: loaded from: classes10.dex */
public class OooO0OO implements InterfaceC33788ooOO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f113893OooOo0o;

    public /* synthetic */ OooO0OO(int i) {
        this.f113893OooOo0o = i;
    }

    public static boolean OooO0O0(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    public static String OooO0OO(oO000.OooO00o oooO00o, C31934OooO0O0 c31934OooO0O0, BitSet bitSet) {
        StringBuilder sb = new StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (!c31934OooO0O0.OooO00o()) {
                char c = oooO00o.f113730OooOo0o[c31934OooO0O0.f113892OooO0O0];
                if (bitSet.get(c)) {
                    break loop0;
                }
                boolean zOooO0O0 = OooO0O0(c);
                int i = c31934OooO0O0.f113891OooO00o;
                if (zOooO0O0) {
                    int i2 = c31934OooO0O0.f113892OooO0O0;
                    int i3 = i2;
                    while (i2 < i && OooO0O0(oooO00o.f113730OooOo0o[i2])) {
                        i3++;
                        i2++;
                    }
                    c31934OooO0O0.OooO0O0(i3);
                    z = true;
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(ControlChar.SPACE_CHAR);
                    }
                    int i4 = c31934OooO0O0.f113892OooO0O0;
                    int i5 = i4;
                    while (i4 < i) {
                        char c2 = oooO00o.f113730OooOo0o[i4];
                        if (bitSet.get(c2) || OooO0O0(c2)) {
                            break;
                        }
                        i5++;
                        sb.append(c2);
                        i4++;
                    }
                    c31934OooO0O0.OooO0O0(i5);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    @Override // oO0o0Oo.InterfaceC33788ooOO
    public InterfaceC33721OooO0o OooO00o(InterfaceC33780o00Ooo interfaceC33780o00Ooo) {
        return new C33716OooO(EnumC33776Ooooooo.f121772OooOo0o);
    }

    public String toString() {
        switch (this.f113893OooOo0o) {
            case 1:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }
}
