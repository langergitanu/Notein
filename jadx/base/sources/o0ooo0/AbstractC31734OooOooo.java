package o0ooo0;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.InputDeviceCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import o0oo0oo.AbstractC31397Oooo0O0;
import o0oo0oo.C31379OooOOo;
import o0oo0oo.C31380OooOOo0;
import o0oo0oo.C31389OooOoOO;
import o0oo0oo.C31401Oooo0oO;
import o0oo0oo.InterfaceC31361OooO0OO;
import o0oo0oo.Oooo000;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31437OooO0o;
import o0ooO0Oo.C31441OooOO0;
import o0ooOO0o.C31611OooO00o;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31676OooO0oo;

/* JADX INFO: renamed from: o0ooo0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31734OooOooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31401Oooo0oO f113358OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31722OooOOo0 f113359OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC31361OooO0OO f113360OooO0OO;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC31734OooOooo(C31611OooO00o c31611OooO00o, C31436OooO0Oo c31436OooO0Oo, C31401Oooo0oO c31401Oooo0oO) throws IOException {
        new HashSet();
        this.f113358OooO00o = c31401Oooo0oO;
        C31722OooOOo0 c31722OooOOo0 = new C31722OooOOo0();
        String name = c31401Oooo0oO.getName();
        C31441OooOO0 c31441OooOO0OooOooo = name != null ? C31441OooOO0.OooOooo(name) : null;
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112335o000OoO;
        C31436OooO0Oo c31436OooO0Oo2 = c31722OooOOo0.f113315OooOo0o;
        c31436OooO0Oo2.o000OoOO(c31441OooOO0, c31441OooOO0OooOooo);
        C31389OooOoOO c31389OooOoOOOoOO = c31401Oooo0oO.ooOO();
        if (c31389OooOoOOOoOO == null) {
            throw new IOException("os2 table is missing in font " + c31401Oooo0oO.getName());
        }
        Oooo000 oooo000O00Oo0 = c31401Oooo0oO.o00Oo0();
        if (oooo000O00Oo0 == null) {
            throw new IOException("post table is missing in font " + c31401Oooo0oO.getName());
        }
        c31722OooOOo0.OooO0o(1, oooo000O00Oo0.f112107OooO0oo > 0 || c31401Oooo0oO.Oooo00o().f112055OooO0oo == 1);
        c31722OooOOo0.OooO0o(64, (c31389OooOoOOOoOO.f112088OooOO0O & InputDeviceCompat.SOURCE_DPAD) != 0);
        int i = c31389OooOoOOOoOO.f112083OooO;
        if (i == 1 || i == 7) {
            c31722OooOOo0.OooO0o(2, true);
        } else if (i == 10) {
            c31722OooOOo0.OooO0o(8, true);
        } else if (i == 3 || i == 4 || i == 5) {
        }
        c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112318o000O0o, c31389OooOoOOOoOO.f112085OooO0oO);
        c31722OooOOo0.OooO0o(4, true);
        c31722OooOOo0.OooO0o(32, false);
        c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112329o000OOoO, oooo000O00Oo0.f112106OooO0oO);
        C31380OooOOo0 c31380OooOOo0Oooo000 = c31401Oooo0oO.Oooo000();
        C31676OooO0oo c31676OooO0oo = new C31676OooO0oo();
        float f = 1000.0f / c31380OooOOo0Oooo000.f112057OooO0o;
        C31437OooO0o c31437OooO0o = new C31437OooO0o(c31380OooOOo0Oooo000.f112058OooO0oO * f);
        C31433OooO00o c31433OooO00o = c31676OooO0oo.f113215OooOo0o;
        c31433OooO00o.o0000O0O(0, c31437OooO0o);
        c31433OooO00o.o0000O0O(1, new C31437OooO0o(c31380OooOOo0Oooo000.f112059OooO0oo * f));
        c31676OooO0oo.OooO0oO(c31380OooOOo0Oooo000.f112056OooO * f);
        c31676OooO0oo.OooO0oo(c31380OooOOo0Oooo000.f112060OooOO0 * f);
        c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112304o0000oO0, c31433OooO00o);
        C31379OooOOo c31379OooOOoOooo00o = c31401Oooo0oO.Oooo00o();
        c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112251Oooo0OO, c31379OooOOoOooo00o.f112053OooO0o * f);
        c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112280o000000O, c31379OooOOoOooo00o.f112054OooO0oO * f);
        if (c31389OooOoOOOoOO.f112084OooO0o >= 1.2d) {
            float f2 = c31389OooOoOOOoOO.f112094OooOOo0 * f;
            c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112265OoooOoo, f2);
            c31722OooOOo0.f113314OooOo = f2;
            c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112427o00OOooo, c31389OooOoOOOoOO.f112093OooOOOo * f);
        } else {
            Path pathOooOOO0 = c31401Oooo0oO.OooOOO0("H");
            if (pathOooOOO0 != null) {
                pathOooOOO0.computeBounds(new RectF(), true);
                float fRound = Math.round(r4.bottom) * f;
                c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112265OoooOoo, fRound);
                c31722OooOOo0.f113314OooOo = fRound;
            } else {
                float f3 = (c31389OooOoOOOoOO.f112089OooOO0o + c31389OooOoOOOoOO.f112091OooOOO0) * f;
                c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112265OoooOoo, f3);
                c31722OooOOo0.f113314OooOo = f3;
            }
            Path pathOooOOO02 = c31401Oooo0oO.OooOOO0("x");
            if (pathOooOOO02 != null) {
                pathOooOOO02.computeBounds(new RectF(), true);
                c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112427o00OOooo, Math.round(r1.bottom) * f);
            } else {
                c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112427o00OOooo, (c31389OooOoOOOoOO.f112089OooOO0o / 2.0f) * f);
            }
        }
        c31436OooO0Oo2.o000Oo0o(C31441OooOO0.f112398o00O0oOO, c31722OooOOo0.OooO00o().OooO0o() * 0.13f);
        this.f113359OooO0O0 = c31722OooOOo0;
        if (c31401Oooo0oO.ooOO() != null) {
            short s = c31401Oooo0oO.ooOO().f112086OooO0oo;
            if ((s & 15) == 2 || (s & 512) == 512) {
                throw new IOException("This font does not permit embedding");
            }
        }
        AbstractC31397Oooo0O0 abstractC31397Oooo0O0 = c31401Oooo0oO.f112125OooOoO;
        InputStream inputStreamOooO0OO = abstractC31397Oooo0O0.OooO0OO();
        byte[] bArr = new byte[4];
        inputStreamOooO0OO.mark(4);
        if (inputStreamOooO0OO.read(bArr) == 4 && new String(bArr).equals("ttcf")) {
            inputStreamOooO0OO.close();
            throw new IOException("Full embedding of TrueType font collections not supported");
        }
        if (inputStreamOooO0OO.markSupported()) {
            inputStreamOooO0OO.reset();
        } else {
            inputStreamOooO0OO.close();
            inputStreamOooO0OO = abstractC31397Oooo0O0.OooO0OO();
        }
        C31668OooO c31668OooO = new C31668OooO(c31611OooO00o, inputStreamOooO0OO, C31441OooOO0.f112301o0000o0O);
        c31668OooO.f113202OooOo0o.o000Ooo0(C31441OooOO0.f112341o000Oooo, abstractC31397Oooo0O0.OooOOO0());
        this.f113359OooO0O0.f113315OooOo0o.o000OoOo(C31441OooOO0.f112309o0000ooO, c31668OooO);
        c31436OooO0Oo.o000OooO(C31441OooOO0.f112259OoooO0O, c31401Oooo0oO.getName());
        c31401Oooo0oO.o00000oO(true);
        this.f113360OooO0OO = c31401Oooo0oO.o0000oO(true);
    }
}
