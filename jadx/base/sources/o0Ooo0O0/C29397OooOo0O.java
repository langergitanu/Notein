package o0Ooo0O0;

import com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Ooo0O0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29397OooOo0O<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List f104241OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f104242OooOo0o;

    /* JADX INFO: renamed from: o0Ooo0O0.OooOo0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$_sortedPageLayers$lambda$7$$inlined$map$1$2", m80623f = "PageLayerViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f104243OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104244OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f104244OooOo0o = obj;
            this.f104243OooOo |= Integer.MIN_VALUE;
            return C29397OooOo0O.this.emit(null, this);
        }
    }

    public C29397OooOo0O(InterfaceC33723OooO0oO interfaceC33723OooO0oO, List list) {
        this.f104242OooOo0o = interfaceC33723OooO0oO;
        this.f104241OooOo = list;
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
            int i = oooO00o.f104243OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f104243OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f104244OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f104243OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            List listO00O0O = oOo000Oo.OooOo.o00O0O((List) obj, new OooO0OO.OooO0o(this.f104241OooOo));
            oooO00o.f104243OooOo = 1;
            if (this.f104242OooOo0o.emit(listO00O0O, oooO00o) == enumC32485OooO00o) {
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
