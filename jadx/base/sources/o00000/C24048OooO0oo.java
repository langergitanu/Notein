package o00000;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.List;
import o00o00Oo.C25256OooO00o;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: o00000.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24048OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Oooo0 f81040OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO f81041OooO0O0;

    public final Oooo0 OooO00o(List<? extends OooO0o> editCommands) {
        OooO0o oooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(editCommands, "editCommands");
        OooO0o oooO0o2 = null;
        try {
            int size = editCommands.size();
            int i = 0;
            OooO0o oooO0o3 = null;
            while (i < size) {
                try {
                    oooO0o = editCommands.get(i);
                } catch (Exception e) {
                    e = e;
                    oooO0o2 = oooO0o3;
                }
                try {
                    oooO0o.OooO00o(this.f81041OooO0O0);
                    i++;
                    oooO0o3 = oooO0o;
                } catch (Exception e2) {
                    e = e2;
                    oooO0o2 = oooO0o;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(this.f81041OooO0O0.f81024OooO00o.OooO00o());
                    sb2.append(", composition=");
                    sb2.append(this.f81041OooO0O0.OooO0OO());
                    sb2.append(", selection=");
                    OooO oooO = this.f81041OooO0O0;
                    sb2.append((Object) C34696OooOOoo.OooO0o(C25256OooO00o.OooO0OO(oooO.f81025OooO0O0, oooO.f81026OooO0OO)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    oOo000Oo.OooOo.OoooOO0(editCommands, sb, IOUtils.LINE_SEPARATOR_UNIX, null, null, new C24047OooO0oO(oooO0o2, this), 60);
                    String string = sb.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(string, e);
                }
            }
            C34680OooO0O0 c34680OooO0O0 = new C34680OooO0O0(6, this.f81041OooO0O0.f81024OooO00o.toString(), null);
            OooO oooO2 = this.f81041OooO0O0;
            Oooo0 oooo0 = new Oooo0(c34680OooO0O0, C25256OooO00o.OooO0OO(oooO2.f81025OooO0O0, oooO2.f81026OooO0OO), this.f81041OooO0O0.OooO0OO());
            this.f81040OooO00o = oooo0;
            return oooo0;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
