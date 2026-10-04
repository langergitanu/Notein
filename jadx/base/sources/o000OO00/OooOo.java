package o000OO00;

import OooOo.C20481OooOOoo;
import OooOoO.C20509OooO0oo;
import OooOoOO.C20519OooO0Oo;
import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import OooooO0.C21292OooO0oo;
import OoooooO.C21445Oooo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.BrushPaintNative;
import androidx.ink.brush.ColorFunctionNative;
import androidx.ink.brush.StampingTextureNative;
import androidx.ink.brush.TextureLayerNative;
import androidx.ink.brush.TilingTextureNative;
import com.google.firebase.sessions.C22798OooO0o0;
import com.orion.penkit.tools.DrawToolFactory;
import io.ktor.utils.p616io.C23968Oooo00o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import o000OO00.OooOo;
import o000OO0o.C24495OooO00o;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O00oo.C32520OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f82685OooO0o = {new C24028OooOoO0(OooOo.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0O0 f82686OooO0o0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f82687OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<AbstractC24463OooO0Oo> f82688OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<OooO00o> f82689OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Oooo0 f82690OooO0Oo;

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOoO.OooO0O0 f82693OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f82692OooO0OO = {new C24028OooOoO0(OooO00o.class, "nativePointer", "getNativePointer$ink_brush()J", 0)};

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C19616OooO00o f82691OooO0O0 = new C19616OooO00o();

        /* JADX INFO: renamed from: o000OO00.OooOo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19616OooO00o {
        }

        public static final class OooO0O0 extends OooO00o {
            public OooO0O0() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (obj == null || !(obj instanceof OooO0O0)) {
                    return false;
                }
                ColorFunctionNative colorFunctionNative = ColorFunctionNative.f65351OooO00o;
                return colorFunctionNative.getHueOffsetDegrees(OooO00o()) == colorFunctionNative.getHueOffsetDegrees(((OooO0O0) obj).OooO00o());
            }

            public final int hashCode() {
                return Float.hashCode(ColorFunctionNative.f65351OooO00o.getHueOffsetDegrees(OooO00o()));
            }

            public final String toString() {
                return "ColorFunction.HueOffset(" + ColorFunctionNative.f65351OooO00o.getHueOffsetDegrees(OooO00o()) + ")";
            }
        }

        public static final class OooO0OO extends OooO00o {
            public OooO0OO() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (obj == null || !(obj instanceof OooO0OO)) {
                    return false;
                }
                ColorFunctionNative colorFunctionNative = ColorFunctionNative.f65351OooO00o;
                return colorFunctionNative.getLuminosityOffset(OooO00o()) == colorFunctionNative.getLuminosityOffset(((OooO0OO) obj).OooO00o());
            }

            public final int hashCode() {
                return Float.hashCode(ColorFunctionNative.f65351OooO00o.getLuminosityOffset(OooO00o()));
            }

            public final String toString() {
                return "ColorFunction.LuminosityOffset(" + ColorFunctionNative.f65351OooO00o.getLuminosityOffset(OooO00o()) + ")";
            }
        }

        /* JADX INFO: renamed from: o000OO00.OooOo$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        public static final class C24461OooO0Oo extends OooO00o {
            public C24461OooO0Oo() {
                throw null;
            }

            @Override // o000OO00.OooOo.OooO00o
            public final long OooO0O0(long j) {
                return C21292OooO0oo.OooO00o(C24495OooO00o.OooO0o(j), C24495OooO00o.OooO0o0(j), C24495OooO00o.OooO0OO(j), ColorFunctionNative.f65351OooO00o.getOpacityMultiplier(OooO00o()) * C24495OooO00o.OooO0O0(j), C24495OooO00o.OooO0Oo(j));
            }

            public final boolean equals(Object obj) {
                if (obj == null || !(obj instanceof C24461OooO0Oo)) {
                    return false;
                }
                ColorFunctionNative colorFunctionNative = ColorFunctionNative.f65351OooO00o;
                return colorFunctionNative.getOpacityMultiplier(OooO00o()) == colorFunctionNative.getOpacityMultiplier(((C24461OooO0Oo) obj).OooO00o());
            }

            public final int hashCode() {
                return Float.hashCode(ColorFunctionNative.f65351OooO00o.getOpacityMultiplier(OooO00o()));
            }

            public final String toString() {
                return "ColorFunction.OpacityMultiplier(" + ColorFunctionNative.f65351OooO00o.getOpacityMultiplier(OooO00o()) + ")";
            }
        }

        public static final class OooO0o extends OooO00o {
            public OooO0o() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (obj == null || !(obj instanceof OooO0o)) {
                    return false;
                }
                ColorFunctionNative colorFunctionNative = ColorFunctionNative.f65351OooO00o;
                return colorFunctionNative.getSaturationMultiplier(OooO00o()) == colorFunctionNative.getSaturationMultiplier(((OooO0o) obj).OooO00o());
            }

            public final int hashCode() {
                return Float.hashCode(ColorFunctionNative.f65351OooO00o.getSaturationMultiplier(OooO00o()));
            }

            public final String toString() {
                return "ColorFunction.SaturationMultiplier(" + ColorFunctionNative.f65351OooO00o.getSaturationMultiplier(OooO00o()) + ")";
            }
        }

        /* JADX INFO: renamed from: o000OO00.OooOo$OooO00o$OooO0o0, reason: case insensitive filesystem */
        public static final class C24462OooO0o0 extends OooO00o {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final long f82694OooO0Oo;

            public C24462OooO0o0(C24468OooOo0o c24468OooOo0o) {
                super(c24468OooOo0o);
                long jComputeReplaceColorLong = ColorFunctionNative.f65351OooO00o.computeReplaceColorLong(OooO00o());
                int i = C24495OooO00o.f82815OooO0Oo;
                this.f82694OooO0Oo = jComputeReplaceColorLong;
            }

            @Override // o000OO00.OooOo.OooO00o
            public final long OooO0O0(long j) {
                return this.f82694OooO0Oo;
            }

            public final boolean equals(Object obj) {
                if (obj != null && (obj instanceof C24462OooO0o0)) {
                    int i = C24495OooO00o.f82815OooO0Oo;
                    if (this.f82694OooO0Oo == ((C24462OooO0o0) obj).f82694OooO0Oo) {
                        return true;
                    }
                }
                return false;
            }

            public final int hashCode() {
                int i = C24495OooO00o.f82815OooO0Oo;
                return Long.hashCode(this.f82694OooO0Oo);
            }

            public final String toString() {
                return C20593OooO0Oo.OooO0O0("ColorFunction.ReplaceColor(", C24495OooO00o.OooO0oO(this.f82694OooO0Oo), ")");
            }
        }

        public OooO00o() {
            throw null;
        }

        public OooO00o(C24468OooOo0o c24468OooOo0o) {
            this.f82693OooO00o = new o000OOoO.OooO0O0(c24468OooOo0o, new C24470OooOoO0(1, ColorFunctionNative.f65351OooO00o, ColorFunctionNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        }

        public final long OooO00o() {
            return this.f82693OooO00o.OooO00o(this, f82692OooO0OO[0]);
        }

        public long OooO0O0(long j) {
            return ColorFunctionNative.f65351OooO00o.computeTransformedColorLong(OooO00o(), C24495OooO00o.OooO0o(j), C24495OooO00o.OooO0o0(j), C24495OooO00o.OooO0OO(j), C24495OooO00o.OooO0O0(j), C23968Oooo00o.OooO0o(C24495OooO00o.OooO0Oo(j)));
        }
    }

    public static final class OooO0O0 {
    }

    public static final class OooO0OO extends AbstractC24463OooO0Oo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final C32447OooOOo f82695OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f82696OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final C32447OooOOo f82697OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final C32447OooOOo f82698OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final C32447OooOOo f82699OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final C32447OooOOo f82700OooOO0O;

        public OooO0OO() {
            throw null;
        }

        public OooO0OO(C24467OooOo0O c24467OooOo0O) {
            super(c24467OooOo0O);
            this.f82696OooO0o = StampingTextureNative.f65353OooO00o.getClientTextureId(OooO00o());
            this.f82697OooO0oO = C20519OooO0Oo.OooO0OO(new C24469OooOoO(this, 0));
            this.f82698OooO0oo = C20519OooO0Oo.OooO0OO(new C24471OooOoOO(this, 0));
            this.f82695OooO = C20519OooO0Oo.OooO0OO(new com.google.firebase.sessions.OooO0OO(this, 1));
            this.f82699OooOO0 = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o000OO00.OooOoo0
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    return Long.valueOf(StampingTextureNative.f65353OooO00o.getAnimationDurationMillis(this.f82757OooOo0o.OooO00o()));
                }
            });
            this.f82700OooOO0O = C20519OooO0Oo.OooO0OO(new C22798OooO0o0(this, 1));
            if (OooO0Oo() <= OooO0O0() * OooO0o0()) {
                return;
            }
            throw new IllegalArgumentException((OooO0Oo() + " frames cannot fit into a grid with " + OooO0o0() + " and " + OooO0O0() + " (up to " + (OooO0O0() * OooO0o0()) + " frames)").toString());
        }

        public final int OooO0O0() {
            return ((Number) this.f82695OooO.getValue()).intValue();
        }

        public final long OooO0OO() {
            return ((Number) this.f82699OooOO0.getValue()).longValue();
        }

        public final int OooO0Oo() {
            return ((Number) this.f82697OooO0oO.getValue()).intValue();
        }

        public final int OooO0o0() {
            return ((Number) this.f82698OooO0oo.getValue()).intValue();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82696OooO0o, oooO0OO.f82696OooO0o) && OooO0Oo() == oooO0OO.OooO0Oo() && OooO0o0() == oooO0OO.OooO0o0() && OooO0O0() == oooO0OO.OooO0O0() && OooO0OO() == oooO0OO.OooO0OO() && kotlin.jvm.internal.OooOOO0.OooO0O0((AbstractC24463OooO0Oo.OooO00o) this.f82700OooOO0O.getValue(), (AbstractC24463OooO0Oo.OooO00o) oooO0OO.f82700OooOO0O.getValue()) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82705OooO0O0, oooO0OO.f82705OooO0O0);
        }

        public final int hashCode() {
            return this.f82705OooO0O0.hashCode() + ((((AbstractC24463OooO0Oo.OooO00o) this.f82700OooOO0O.getValue()).hashCode() + ((Long.hashCode(OooO0OO()) + ((Integer.hashCode(OooO0O0()) + ((Integer.hashCode(OooO0o0()) + ((Integer.hashCode(OooO0Oo()) + (this.f82696OooO0o.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            int iOooO0Oo = OooO0Oo();
            int iOooO0o0 = OooO0o0();
            int iOooO0O0 = OooO0O0();
            long jOooO0OO = OooO0OO();
            AbstractC24463OooO0Oo.OooO00o oooO00o = (AbstractC24463OooO0Oo.OooO00o) this.f82700OooOO0O.getValue();
            StringBuilder sb = new StringBuilder("BrushPaint.StampingTexture(clientTextureId=");
            OooOO0.OooO0O0.OooO0Oo(iOooO0Oo, this.f82696OooO0o, ", animationFrames=", ", animationRows=", sb);
            C24472OooOoo.OooO0O0(sb, ", animationColumns=", ", animationDurationMillis=", iOooO0o0, iOooO0O0);
            sb.append(jOooO0OO);
            sb.append(", animationRepeatMode=");
            sb.append(oooO00o);
            sb.append(", blendMode=");
            sb.append(this.f82705OooO0O0);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o000OO00.OooOo$OooO0Oo, reason: case insensitive filesystem */
    public static abstract class AbstractC24463OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOoO.OooO0O0 f82704OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0O0 f82705OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f82702OooO0Oo = {new C24028OooOoO0(AbstractC24463OooO0Oo.class, "nativePointer", "getNativePointer$ink_brush()J", 0)};

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0OO f82701OooO0OO = new OooO0OO();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final int f82703OooO0o0 = 1;

        /* JADX INFO: renamed from: o000OO00.OooOo$OooO0Oo$OooO00o */
        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static final C20481OooOOoo<OooO00o> f82706OooO0O0 = new C20481OooOOoo<>((Object) null);

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f82707OooO00o;

            static {
                new OooO00o(0, "RESTART");
                new OooO00o(1, "REVERSE");
            }

            public OooO00o(int i, String str) {
                this.f82707OooO00o = str;
                C20481OooOOoo<OooO00o> c20481OooOOoo = f82706OooO0O0;
                if (c20481OooOOoo.OooO00o(i)) {
                    throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate AnimationRepeatMode value: ", ".").toString());
                }
                c20481OooOOoo.OooO0oO(i, this);
            }

            public final String toString() {
                return "TextureLayer.AnimationRepeatMode." + this.f82707OooO00o;
            }
        }

        /* JADX INFO: renamed from: o000OO00.OooOo$OooO0Oo$OooO0O0 */
        public static final class OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f82721OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static final C20481OooOOoo<OooO0O0> f82709OooO0O0 = new C20481OooOOoo<>((Object) null);

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public static final OooO0O0 f82710OooO0OO = new OooO0O0(0, "MODULATE");

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO0O0 f82711OooO0Oo = new OooO0O0(1, "DST_IN");

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public static final OooO0O0 f82713OooO0o0 = new OooO0O0(2, "DST_OUT");

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public static final OooO0O0 f82712OooO0o = new OooO0O0(3, "SRC_ATOP");

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public static final OooO0O0 f82714OooO0oO = new OooO0O0(4, "SRC_IN");

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public static final OooO0O0 f82715OooO0oo = new OooO0O0(5, "SRC_OVER");

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public static final OooO0O0 f82708OooO = new OooO0O0(6, "DST_OVER");

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public static final OooO0O0 f82716OooOO0 = new OooO0O0(7, "SRC");

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public static final OooO0O0 f82717OooOO0O = new OooO0O0(8, "DST");

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public static final OooO0O0 f82718OooOO0o = new OooO0O0(9, "SRC_OUT");

            /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
            public static final OooO0O0 f82720OooOOO0 = new OooO0O0(10, "DST_ATOP");

            /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
            public static final OooO0O0 f82719OooOOO = new OooO0O0(11, "XOR");

            public OooO0O0(int i, String str) {
                this.f82721OooO00o = str;
                C20481OooOOoo<OooO0O0> c20481OooOOoo = f82709OooO0O0;
                if (c20481OooOOoo.OooO00o(i)) {
                    throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate BlendMode value: ", ".").toString());
                }
                c20481OooOOoo.OooO0oO(i, this);
            }

            public final String toString() {
                return "TextureLayer.BlendMode." + this.f82721OooO00o;
            }
        }

        /* JADX INFO: renamed from: o000OO00.OooOo$OooO0Oo$OooO0OO */
        public static final class OooO0OO {
        }

        /* JADX INFO: renamed from: o000OO00.OooOo$OooO0Oo$OooO0Oo, reason: collision with other inner class name */
        public static final class C19617OooO0Oo {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static final C20481OooOOoo<C19617OooO0Oo> f82722OooO0O0 = new C20481OooOOoo<>((Object) null);

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public static final C19617OooO0Oo f82723OooO0OO = new C19617OooO0Oo(0, "BRUSH_SIZE");

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C19617OooO0Oo f82724OooO0Oo = new C19617OooO0Oo(1, "STROKE_COORDINATES");

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f82725OooO00o;

            public C19617OooO0Oo(int i, String str) {
                this.f82725OooO00o = str;
                C20481OooOOoo<C19617OooO0Oo> c20481OooOOoo = f82722OooO0O0;
                if (c20481OooOOoo.OooO00o(i)) {
                    throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate SizeUnit value: ", ".").toString());
                }
                c20481OooOOoo.OooO0oO(i, this);
            }

            public final String toString() {
                return "TextureLayer.SizeUnit." + this.f82725OooO00o;
            }
        }

        /* JADX INFO: renamed from: o000OO00.OooOo$OooO0Oo$OooO0o0, reason: case insensitive filesystem */
        public static final class C24464OooO0o0 {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static final C20481OooOOoo<C24464OooO0o0> f82726OooO0O0 = new C20481OooOOoo<>((Object) null);

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public static final C24464OooO0o0 f82727OooO0OO = new C24464OooO0o0(0, "REPEAT");

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C24464OooO0o0 f82728OooO0Oo = new C24464OooO0o0(1, "MIRROR");

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public static final C24464OooO0o0 f82729OooO0o0 = new C24464OooO0o0(2, "CLAMP");

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f82730OooO00o;

            /* JADX INFO: renamed from: o000OO00.OooOo$OooO0Oo$OooO0o0$OooO00o */
            public static final class OooO00o {
                public static C24464OooO0o0 OooO00o(int i) {
                    C24464OooO0o0 c24464OooO0o0OooO0O0 = C24464OooO0o0.f82726OooO0O0.OooO0O0(i);
                    if (c24464OooO0o0OooO0O0 != null) {
                        return c24464OooO0o0OooO0O0;
                    }
                    throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "Invalid Wrap value: ").toString());
                }
            }

            public C24464OooO0o0(int i, String str) {
                this.f82730OooO00o = str;
                C20481OooOOoo<C24464OooO0o0> c20481OooOOoo = f82726OooO0O0;
                if (c20481OooOOoo.OooO00o(i)) {
                    throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate Wrap value: ", ".").toString());
                }
                c20481OooOOoo.OooO0oO(i, this);
            }

            public final String toString() {
                return "TextureLayer.Wrap." + this.f82730OooO00o;
            }
        }

        public AbstractC24463OooO0Oo(C24467OooOo0O c24467OooOo0O) {
            TextureLayerNative textureLayerNative = TextureLayerNative.f65355OooO00o;
            this.f82704OooO00o = new o000OOoO.OooO0O0(c24467OooOo0O, new C24474OooOooO(1, textureLayerNative, TextureLayerNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
            C20481OooOOoo<OooO0O0> c20481OooOOoo = OooO0O0.f82709OooO0O0;
            int blendModeInt = textureLayerNative.getBlendModeInt(OooO00o());
            OooO0O0 OooO0O02 = OooO0O0.f82709OooO0O0.OooO0O0(blendModeInt);
            if (OooO0O02 == null) {
                throw new IllegalStateException(C21532OooOOo.OooO0OO(blendModeInt, "Invalid BlendMode value: ").toString());
            }
            this.f82705OooO0O0 = OooO0O02;
        }

        public final long OooO00o() {
            return this.f82704OooO00o.OooO00o(this, f82702OooO0Oo[0]);
        }
    }

    public static final /* synthetic */ class OooO0o extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((BrushPaintNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o000OO00.OooOo$OooO0o0, reason: case insensitive filesystem */
    public static final class C24465OooO0o0 extends AbstractC24463OooO0Oo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float f82731OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f82732OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f82733OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f82734OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final float f82735OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final float f82736OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final AbstractC24463OooO0Oo.C19617OooO0Oo f82737OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final AbstractC24463OooO0Oo.C24464OooO0o0 f82738OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final OooO00o f82739OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final AbstractC24463OooO0Oo.C24464OooO0o0 f82740OooOOOO;

        /* JADX INFO: renamed from: o000OO00.OooOo$OooO0o0$OooO00o */
        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static final C20481OooOOoo<OooO00o> f82741OooO0O0 = new C20481OooOOoo<>((Object) null);

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public static final OooO00o f82742OooO0OO = new OooO00o(0, "STROKE_SPACE_ORIGIN");

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO00o f82743OooO0Oo = new OooO00o(1, "FIRST_STROKE_INPUT");

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public static final OooO00o f82744OooO0o0 = new OooO00o(2, "LAST_STROKE_INPUT");

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f82745OooO00o;

            public OooO00o(int i, String str) {
                this.f82745OooO00o = str;
                C20481OooOOoo<OooO00o> c20481OooOOoo = f82741OooO0O0;
                if (c20481OooOOoo.OooO00o(i)) {
                    throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate Origin value: ", ".").toString());
                }
                c20481OooOOoo.OooO0oO(i, this);
            }

            public final String toString() {
                return "TilingTexture.Origin." + this.f82745OooO00o;
            }
        }

        public C24465OooO0o0() {
            throw null;
        }

        public C24465OooO0o0(C24467OooOo0O c24467OooOo0O) {
            super(c24467OooOo0O);
            TilingTextureNative tilingTextureNative = TilingTextureNative.f65356OooO00o;
            this.f82732OooO0o = tilingTextureNative.getClientTextureId(OooO00o());
            this.f82733OooO0oO = tilingTextureNative.getSizeX(OooO00o());
            this.f82734OooO0oo = tilingTextureNative.getSizeY(OooO00o());
            this.f82731OooO = tilingTextureNative.getOffsetX(OooO00o());
            this.f82735OooOO0 = tilingTextureNative.getOffsetY(OooO00o());
            this.f82736OooOO0O = tilingTextureNative.getRotationDegrees(OooO00o());
            C20481OooOOoo<AbstractC24463OooO0Oo.C19617OooO0Oo> c20481OooOOoo = AbstractC24463OooO0Oo.C19617OooO0Oo.f82722OooO0O0;
            int sizeUnitInt = tilingTextureNative.getSizeUnitInt(OooO00o());
            AbstractC24463OooO0Oo.C19617OooO0Oo c19617OooO0OoOooO0O0 = AbstractC24463OooO0Oo.C19617OooO0Oo.f82722OooO0O0.OooO0O0(sizeUnitInt);
            if (c19617OooO0OoOooO0O0 == null) {
                throw new IllegalStateException(C21532OooOOo.OooO0OO(sizeUnitInt, "Invalid SizeUnit value: ").toString());
            }
            this.f82737OooOO0o = c19617OooO0OoOooO0O0;
            C20481OooOOoo<OooO00o> c20481OooOOoo2 = OooO00o.f82741OooO0O0;
            int originInt = tilingTextureNative.getOriginInt(OooO00o());
            OooO00o oooO00oOooO0O0 = OooO00o.f82741OooO0O0.OooO0O0(originInt);
            if (oooO00oOooO0O0 == null) {
                throw new IllegalStateException(C21532OooOOo.OooO0OO(originInt, "Invalid Origin value: ").toString());
            }
            this.f82739OooOOO0 = oooO00oOooO0O0;
            C20481OooOOoo<AbstractC24463OooO0Oo.C24464OooO0o0> c20481OooOOoo3 = AbstractC24463OooO0Oo.C24464OooO0o0.f82726OooO0O0;
            this.f82738OooOOO = AbstractC24463OooO0Oo.C24464OooO0o0.OooO00o.OooO00o(tilingTextureNative.getWrapXInt(OooO00o()));
            this.f82740OooOOOO = AbstractC24463OooO0Oo.C24464OooO0o0.OooO00o.OooO00o(tilingTextureNative.getWrapYInt(OooO00o()));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C24465OooO0o0)) {
                return false;
            }
            C24465OooO0o0 c24465OooO0o0 = (C24465OooO0o0) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82732OooO0o, c24465OooO0o0.f82732OooO0o) && this.f82733OooO0oO == c24465OooO0o0.f82733OooO0oO && this.f82734OooO0oo == c24465OooO0o0.f82734OooO0oo && this.f82731OooO == c24465OooO0o0.f82731OooO && this.f82735OooOO0 == c24465OooO0o0.f82735OooOO0 && this.f82736OooOO0O == c24465OooO0o0.f82736OooOO0O && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82737OooOO0o, c24465OooO0o0.f82737OooOO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82739OooOOO0, c24465OooO0o0.f82739OooOOO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82738OooOOO, c24465OooO0o0.f82738OooOOO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82740OooOOOO, c24465OooO0o0.f82740OooOOOO)) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82705OooO0O0, c24465OooO0o0.f82705OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f82705OooO0O0.hashCode() + ((this.f82740OooOOOO.hashCode() + ((this.f82738OooOOO.hashCode() + ((this.f82739OooOOO0.hashCode() + ((this.f82737OooOO0o.hashCode() + C20509OooO0oo.OooO0OO(this.f82736OooOO0O, C20509OooO0oo.OooO0OO(this.f82735OooOO0, C20509OooO0oo.OooO0OO(this.f82731OooO, C20509OooO0oo.OooO0OO(this.f82734OooO0oo, C20509OooO0oo.OooO0OO(this.f82733OooO0oO, this.f82732OooO0o.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "BrushPaint.TilingTexture(clientTextureId=" + this.f82732OooO0o + ", sizeX=" + this.f82733OooO0oO + ", sizeY=" + this.f82734OooO0oo + ", offset=[" + this.f82731OooO + ", " + this.f82735OooOO0 + "], rotationDegrees=" + this.f82736OooOO0O + ", sizeUnit=" + this.f82737OooOO0o + ", origin=" + this.f82739OooOOO0 + ", wrapX=" + this.f82738OooOOO + ", wrapY=" + this.f82740OooOOOO + ", blendMode=" + this.f82705OooO0O0 + ")";
        }
    }

    public OooOo() {
        this(null);
    }

    public final long OooO00o(long j) {
        Iterator<OooO00o> it = this.f82689OooO0OO.iterator();
        while (it.hasNext()) {
            j = it.next().OooO0O0(j);
        }
        return j;
    }

    public final long OooO0O0() {
        return this.f82687OooO00o.OooO00o(this, f82685OooO0o[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82688OooO0O0, oooOo.f82688OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82689OooO0OO, oooOo.f82689OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82690OooO0Oo, oooOo.f82690OooO0Oo);
    }

    public final int hashCode() {
        return this.f82690OooO0Oo.hashCode() + C21445Oooo.OooO00o(this.f82689OooO0OO, this.f82688OooO0O0.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BrushPaint(textureLayers=" + this.f82688OooO0O0 + ", colorFunctions=" + this.f82689OooO0OO + ", selfOverlap=" + this.f82690OooO0Oo + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List<? extends o000OO00.OooOo$OooO00o>] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [o000OO00.OooOo0o] */
    /* JADX WARN: Type inference failed for: r5v2, types: [o000OO00.OooOo0O] */
    public OooOo(oO0O000o.OooO00o<Long> oooO00o, List<? extends AbstractC24463OooO0Oo> list, List<? extends OooO00o> list2) {
        Object c24461OooO0Oo;
        Object oooO0OO;
        BrushPaintNative brushPaintNative = BrushPaintNative.f65349OooO00o;
        this.f82687OooO00o = new o000OOoO.OooO0O0(oooO00o, new OooO0o(1, brushPaintNative, BrushPaintNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        if (list == null) {
            oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, brushPaintNative.getTextureLayerCount(OooO0O0()));
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
            Iterator<Integer> it = OooO2.iterator();
            while (((C32520OooO0oo) it).f116817OooOoO0) {
                final int iNextInt = ((oOo000Oo.Oooo000) it).nextInt();
                AbstractC24463OooO0Oo.OooO0OO oooO0OO2 = AbstractC24463OooO0Oo.f82701OooO0OO;
                int textureLayerMappingInt = BrushPaintNative.f65349OooO00o.getTextureLayerMappingInt(OooO0O0(), iNextInt);
                ?? r5 = new oO0O000o.OooO00o() { // from class: o000OO00.OooOo0O
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        return Long.valueOf(BrushPaintNative.f65349OooO00o.newCopyOfTextureLayer(this.f82750OooOo0o.OooO0O0(), iNextInt));
                    }
                };
                oooO0OO2.getClass();
                if (textureLayerMappingInt == 0) {
                    oooO0OO = new C24465OooO0o0(r5);
                } else {
                    if (textureLayerMappingInt != AbstractC24463OooO0Oo.f82703OooO0o0) {
                        throw new IllegalArgumentException("Invalid texture mapping mode");
                    }
                    oooO0OO = new OooO0OO(r5);
                }
                arrayList.add(oooO0OO);
            }
            list = arrayList;
        }
        List<AbstractC24463OooO0Oo> listUnmodifiableList = Collections.unmodifiableList(oOo000Oo.OooOo.o0ooOO0(list));
        kotlin.jvm.internal.OooOOO0.OooO0o(listUnmodifiableList, "unmodifiableList(...)");
        this.f82688OooO0O0 = listUnmodifiableList;
        if (list2 == 0) {
            oO0O00oo.OooO OooO3 = oO0O00oo.OooOO0.OooO(0, BrushPaintNative.f65349OooO00o.getColorFunctionCount(OooO0O0()));
            list2 = new ArrayList<>(C34428OooOOo.OooOOoo(OooO3, 10));
            Iterator<Integer> it2 = OooO3.iterator();
            while (((C32520OooO0oo) it2).f116817OooOoO0) {
                final int iNextInt2 = ((oOo000Oo.Oooo000) it2).nextInt();
                OooO00o.C19616OooO00o c19616OooO00o = OooO00o.f82691OooO0O0;
                int colorFunctionParametersTypeInt = BrushPaintNative.f65349OooO00o.getColorFunctionParametersTypeInt(OooO0O0(), iNextInt2);
                ?? r3 = new oO0O000o.OooO00o() { // from class: o000OO00.OooOo0o
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        return Long.valueOf(BrushPaintNative.f65349OooO00o.newCopyOfColorFunction(this.f82752OooOo0o.OooO0O0(), iNextInt2));
                    }
                };
                c19616OooO00o.getClass();
                if (colorFunctionParametersTypeInt == 0) {
                    c24461OooO0Oo = new OooO00o.C24461OooO0Oo(r3);
                } else if (colorFunctionParametersTypeInt == 1) {
                    c24461OooO0Oo = new OooO00o.OooO0O0(r3);
                } else if (colorFunctionParametersTypeInt == 2) {
                    c24461OooO0Oo = new OooO00o.OooO0o(r3);
                } else if (colorFunctionParametersTypeInt == 3) {
                    c24461OooO0Oo = new OooO00o.OooO0OO(r3);
                } else {
                    if (colorFunctionParametersTypeInt != 4) {
                        throw new IllegalArgumentException("Invalid color function type");
                    }
                    c24461OooO0Oo = new OooO00o.C24462OooO0o0(r3);
                }
                list2.add(c24461OooO0Oo);
            }
        }
        List<OooO00o> listUnmodifiableList2 = Collections.unmodifiableList(oOo000Oo.OooOo.o0ooOO0((Iterable) list2));
        kotlin.jvm.internal.OooOOO0.OooO0o(listUnmodifiableList2, "unmodifiableList(...)");
        this.f82689OooO0OO = listUnmodifiableList2;
        C20481OooOOoo<Oooo0> c20481OooOOoo = Oooo0.f82759OooO0OO;
        int selfOverlapInt = BrushPaintNative.f65349OooO00o.getSelfOverlapInt(OooO0O0());
        Oooo0 oooo0OooO0O0 = Oooo0.f82759OooO0OO.OooO0O0(selfOverlapInt);
        if (oooo0OooO0O0 == null) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(selfOverlapInt, "Invalid SelfOverlap value: ").toString());
        }
        this.f82690OooO0Oo = oooo0OooO0O0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOo(Object obj) {
        final C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        final Oooo0 selfOverlap = Oooo0.f82760OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(selfOverlap, "selfOverlap");
        this(new oO0O000o.OooO00o() { // from class: o000OO00.OooOo0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                BrushPaintNative brushPaintNative = BrushPaintNative.f65349OooO00o;
                List list = c34434OooOoO;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((OooOo.AbstractC24463OooO0Oo) it.next()).OooO00o()));
                }
                long[] jArrO0ooOOo = oOo000Oo.OooOo.o0ooOOo(arrayList);
                List list2 = c34434OooOoO;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((OooOo.OooO00o) it2.next()).OooO00o()));
                }
                return Long.valueOf(brushPaintNative.create(jArrO0ooOOo, oOo000Oo.OooOo.o0ooOOo(arrayList2), selfOverlap.f82763OooO00o));
            }
        }, c34434OooOoO, c34434OooOoO);
    }
}
