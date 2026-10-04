package o0o000OO;

import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o000OO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29770Oooo00O<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractApplicationC26277OooOoOO f105645OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f105646OooOo0o;

    /* JADX INFO: renamed from: o0o000OO.Oooo00O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$special$$inlined$map$1$2", m80623f = "TextAnnoViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f105647OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f105648OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f105648OooOo0o = obj;
            this.f105647OooOo |= Integer.MIN_VALUE;
            return C29770Oooo00O.this.emit(null, this);
        }
    }

    public C29770Oooo00O(InterfaceC33723OooO0oO interfaceC33723OooO0oO, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        this.f105646OooOo0o = interfaceC33723OooO0oO;
        this.f105645OooOo = abstractApplicationC26277OooOoOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f105647OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f105647OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f105648OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f105647OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            Integer num = (Integer) ((AbstractC24338OooO0o0) obj).OooO0OO(OooOO0O.f105529OooOooo);
            Integer num2 = new Integer(num != null ? num.intValue() : this.f105645OooOo.getColor(R.color.text_anno_default_bg_color));
            oooO00o.f105647OooOo = 1;
            if (this.f105646OooOo0o.emit(num2, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
