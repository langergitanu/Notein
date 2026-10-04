package o0OOOoo;

import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import java.util.Map;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import o0OO00o0.C26577o000oo0O;
import o0oo00oO.InterfaceC31213OooO0oO;
import o0oo00oO.InterfaceC31214OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO0 implements InterfaceC31213OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26577o000oo0O f95053OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f95048OooO0O0 = C24340OooO0oo.OooO0OO("pen_first_btn_pressed");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f95049OooO0OO = C24340OooO0oo.OooO0OO("pen_second_btn_pressed");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f95050OooO0Oo = C24340OooO0oo.OooO0o0("xiaomi_slide_gesture_mode");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f95052OooO0o0 = C24340OooO0oo.OooO0o0("lenovo_slide_gesture_mode");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Integer> f95051OooO0o = C24340OooO0oo.OooO0OO("lenovo_pen_touch_button_double_pressed");

    public OooOOO0(C26577o000oo0O c26577o000oo0O) {
        this.f95053OooO00o = c26577o000oo0O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0oo00oO.InterfaceC31213OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(InterfaceC31214OooO0oo.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27206OooO0Oo c27206OooO0Oo;
        InterfaceC31214OooO0oo.OooO00o oooO00o;
        OooOOO0 oooOOO0;
        OooOOO0 oooOOO02;
        if (abstractC32479OooO0OO instanceof C27206OooO0Oo) {
            c27206OooO0Oo = (C27206OooO0Oo) abstractC32479OooO0OO;
            int i = c27206OooO0Oo.f95027OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27206OooO0Oo.f95027OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27206OooO0Oo = new C27206OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27206OooO0Oo.f95026OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27206OooO0Oo.f95027OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            Object obj2 = oooO0o.f111332OooO0OO.get("vendor");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("StylusConfigProvider");
                c20358OooO00o.OooOO0O("Missing vendor in event: " + oooO0o, new Object[0]);
                return null;
            }
            if (str.equals("xiaomi")) {
                c27206OooO0Oo.f95024OooOo0o = this;
                c27206OooO0Oo.f95023OooOo = oooO0o;
                c27206OooO0Oo.f95027OooOoOO = 1;
                objOooO0OO = OooO0Oo(oooO0o, c27206OooO0Oo);
                if (objOooO0OO != obj) {
                    oooOOO02 = this;
                    oooO00o = (InterfaceC31214OooO0oo.OooO00o) objOooO0OO;
                    if (oooO00o == null) {
                    }
                }
            } else if (str.equals("lenovo")) {
                c27206OooO0Oo.f95024OooOo0o = this;
                c27206OooO0Oo.f95023OooOo = oooO0o;
                c27206OooO0Oo.f95027OooOoOO = 3;
                objOooO0OO = OooO0OO(oooO0o, c27206OooO0Oo);
                if (objOooO0OO != obj) {
                    oooOOO0 = this;
                    oooO00o = (InterfaceC31214OooO0oo.OooO00o) objOooO0OO;
                    if (oooO00o == null) {
                    }
                }
            } else {
                oooO00o = null;
            }
            return obj;
        }
        if (i2 == 1) {
            oooO0o = c27206OooO0Oo.f95023OooOo;
            oooOOO02 = c27206OooO0Oo.f95024OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            oooO00o = (InterfaceC31214OooO0oo.OooO00o) objOooO0OO;
            if (oooO00o == null) {
                c27206OooO0Oo.f95024OooOo0o = oooOOO02;
                c27206OooO0Oo.f95023OooOo = oooO0o;
                c27206OooO0Oo.f95027OooOoOO = 2;
                objOooO0OO = oooOOO02.OooO0o0(oooO0o, c27206OooO0Oo);
            }
        } else if (i2 == 2) {
            oooO0o = c27206OooO0Oo.f95023OooOo;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            oooO00o = (InterfaceC31214OooO0oo.OooO00o) objOooO0OO;
        } else if (i2 == 3) {
            oooO0o = c27206OooO0Oo.f95023OooOo;
            oooOOO0 = c27206OooO0Oo.f95024OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            oooO00o = (InterfaceC31214OooO0oo.OooO00o) objOooO0OO;
            if (oooO00o == null) {
                c27206OooO0Oo.f95024OooOo0o = oooOOO0;
                c27206OooO0Oo.f95023OooOo = oooO0o;
                c27206OooO0Oo.f95027OooOoOO = 4;
                objOooO0OO = oooOOO0.OooO0O0(oooO0o, c27206OooO0Oo);
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooO0o = c27206OooO0Oo.f95023OooOo;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            oooO00o = (InterfaceC31214OooO0oo.OooO00o) objOooO0OO;
        }
        if (oooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("StylusConfigProvider");
            c20358OooO00o2.OooOO0O("Unsupported stylus event: " + oooO0o, new Object[0]);
            return null;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("StylusConfigProvider");
        c20358OooO00o3.OooO0o0("Mapped event " + oooO0o + " to action " + oooO00o, new Object[0]);
        return new InterfaceC31214OooO0oo.C31216OooO0o0(oooO00o, System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum OooO0O0(InterfaceC31214OooO0oo.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27208OooO0o0 c27208OooO0o0;
        InterfaceC31214OooO0oo.OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof C27208OooO0o0) {
            c27208OooO0o0 = (C27208OooO0o0) abstractC32479OooO0OO;
            int i = c27208OooO0o0.f95033OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27208OooO0o0.f95033OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27208OooO0o0 = new C27208OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27208OooO0o0.f95032OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27208OooO0o0.f95033OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (oooO0o.f111330OooO00o != InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111324OooOo) {
                return null;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27207OooO0o c27207OooO0o = new C27207OooO0o(this, f95051OooO0o, null);
            c27208OooO0o0.f95033OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27207OooO0o, c27208OooO0o0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        C27204OooO0O0 c27204OooO0O0 = (C27204OooO0O0) objOooO0o;
        switch (c27204OooO0O0.f95000OooO0O0) {
            case 0:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111307OooOo0o;
                break;
            case 1:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111306OooOo;
                break;
            case 2:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111309OooOoO0;
                break;
            case 3:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111308OooOoO;
                break;
            case 4:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111312OooOoo0;
                break;
            case 5:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111311OooOoo;
                break;
            case 6:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111313OooOooO;
                break;
            case 7:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111310OooOoOO;
                break;
            case 8:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111315Oooo0;
                break;
            case 9:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111319Oooo0O0;
                break;
            default:
                oooO00o = InterfaceC31214OooO0oo.OooO00o.f111307OooOo0o;
                break;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "StylusConfigProvider", "Legacy config ");
        sbOooO0O0.append(c27204OooO0O0.f94999OooO00o);
        sbOooO0O0.append(" = ");
        sbOooO0O0.append(c27204OooO0O0.f95000OooO0O0);
        sbOooO0O0.append(" -> ");
        sbOooO0O0.append(oooO00o);
        c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        return oooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum OooO0OO(InterfaceC31214OooO0oo.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27209OooO0oO c27209OooO0oO;
        if (abstractC32479OooO0OO instanceof C27209OooO0oO) {
            c27209OooO0oO = (C27209OooO0oO) abstractC32479OooO0OO;
            int i = c27209OooO0oO.f95036OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27209OooO0oO.f95036OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27209OooO0oO = new C27209OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27209OooO0oO.f95034OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27209OooO0oO.f95036OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            InterfaceC31214OooO0oo.EnumC31215OooO0Oo enumC31215OooO0Oo = oooO0o.f111330OooO00o;
            if (enumC31215OooO0Oo == InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111327OooOoO0 || enumC31215OooO0Oo == InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111326OooOoO) {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                C27210OooO0oo c27210OooO0oo = new C27210OooO0oo(this, null);
                c27209OooO0oO.f95035OooOo0o = oooO0o;
                c27209OooO0oO.f95036OooOoO = 1;
                objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27210OooO0oo, c27209OooO0oO);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oooO0o = c27209OooO0oO.f95035OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        String str = (String) objOooO0o;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "page")) {
            int iOrdinal = oooO0o.f111330OooO00o.ordinal();
            if (iOrdinal == 3) {
                return InterfaceC31214OooO0oo.OooO00o.f111316Oooo000;
            }
            if (iOrdinal == 4) {
                return InterfaceC31214OooO0oo.OooO00o.f111314OooOooo;
            }
        } else {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str, "pen_width")) {
                return InterfaceC31214OooO0oo.OooO00o.f111307OooOo0o;
            }
            int iOrdinal2 = oooO0o.f111330OooO00o.ordinal();
            if (iOrdinal2 == 3) {
                return InterfaceC31214OooO0oo.OooO00o.f111315Oooo0;
            }
            if (iOrdinal2 == 4) {
                return InterfaceC31214OooO0oo.OooO00o.f111319Oooo0O0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum OooO0Oo(InterfaceC31214OooO0oo.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooO oooO;
        if (abstractC32479OooO0OO instanceof OooO) {
            oooO = (OooO) abstractC32479OooO0OO;
            int i = oooO.f94994OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f94994OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooO.f94992OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO.f94994OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            InterfaceC31214OooO0oo.EnumC31215OooO0Oo enumC31215OooO0Oo = oooO0o.f111330OooO00o;
            if (enumC31215OooO0Oo == InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111327OooOoO0 || enumC31215OooO0Oo == InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111326OooOoO) {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                OooOO0 oooOO02 = new OooOO0(this, null);
                oooO.f94993OooOo0o = oooO0o;
                oooO.f94994OooOoO = 1;
                objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooOO02, oooO);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oooO0o = oooO.f94993OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        String str = (String) objOooO0o;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "page")) {
            int iOrdinal = oooO0o.f111330OooO00o.ordinal();
            if (iOrdinal == 3) {
                return InterfaceC31214OooO0oo.OooO00o.f111316Oooo000;
            }
            if (iOrdinal == 4) {
                return InterfaceC31214OooO0oo.OooO00o.f111314OooOooo;
            }
        } else {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str, "pen_width")) {
                return InterfaceC31214OooO0oo.OooO00o.f111307OooOo0o;
            }
            int iOrdinal2 = oooO0o.f111330OooO00o.ordinal();
            if (iOrdinal2 == 3) {
                return InterfaceC31214OooO0oo.OooO00o.f111315Oooo0;
            }
            if (iOrdinal2 == 4) {
                return InterfaceC31214OooO0oo.OooO00o.f111319Oooo0O0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum OooO0o0(InterfaceC31214OooO0oo.OooO0o oooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOO0O oooOO0O;
        AbstractC24338OooO0o0.OooO00o<Integer> oooO00o;
        InterfaceC31214OooO0oo.OooO00o oooO00o2;
        if (abstractC32479OooO0OO instanceof OooOO0O) {
            oooOO0O = (OooOO0O) abstractC32479OooO0OO;
            int i = oooOO0O.f95044OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f95044OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooOO0O.f95043OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO0O.f95044OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            InterfaceC31214OooO0oo.EnumC31215OooO0Oo enumC31215OooO0Oo = oooO0o.f111330OooO00o;
            InterfaceC31214OooO0oo.EnumC31215OooO0Oo enumC31215OooO0Oo2 = InterfaceC31214OooO0oo.EnumC31215OooO0Oo.f111325OooOo0o;
            Map<String, Object> map = oooO0o.f111332OooO0OO;
            if (enumC31215OooO0Oo == enumC31215OooO0Oo2 && map.get("button") == InterfaceC31214OooO0oo.OooO0O0.f111322OooOo0o) {
                oooO00o = f95048OooO0O0;
            } else {
                if (oooO0o.f111330OooO00o != enumC31215OooO0Oo2 || map.get("button") != InterfaceC31214OooO0oo.OooO0O0.f111321OooOo) {
                    return null;
                }
                oooO00o = f95049OooO0OO;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27211OooOO0o c27211OooOO0o = new C27211OooOO0o(this, oooO00o, null);
            oooOO0O.f95044OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27211OooOO0o, oooOO0O);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        C27204OooO0O0 c27204OooO0O0 = (C27204OooO0O0) objOooO0o;
        switch (c27204OooO0O0.f95000OooO0O0) {
            case 0:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111307OooOo0o;
                break;
            case 1:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111306OooOo;
                break;
            case 2:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111309OooOoO0;
                break;
            case 3:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111308OooOoO;
                break;
            case 4:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111312OooOoo0;
                break;
            case 5:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111311OooOoo;
                break;
            case 6:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111313OooOooO;
                break;
            case 7:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111310OooOoOO;
                break;
            case 8:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111315Oooo0;
                break;
            case 9:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111319Oooo0O0;
                break;
            default:
                oooO00o2 = InterfaceC31214OooO0oo.OooO00o.f111307OooOo0o;
                break;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "StylusConfigProvider", "Legacy config ");
        sbOooO0O0.append(c27204OooO0O0.f94999OooO00o);
        sbOooO0O0.append(" = ");
        sbOooO0O0.append(c27204OooO0O0.f95000OooO0O0);
        sbOooO0O0.append(" -> ");
        sbOooO0O0.append(oooO00o2);
        c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        return oooO00o2;
    }
}
