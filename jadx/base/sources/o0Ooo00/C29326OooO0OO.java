package o0Ooo00;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Ooo00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29326OooO0OO<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f104014OooOo0o;

    /* JADX INFO: renamed from: o0Ooo00.OooO0OO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.viewmodel.AerialViewPagesViewModel$noteMeta$lambda$1$$inlined$map$1$2", m80623f = "AerialViewPagesViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f104015OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104016OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f104016OooOo0o = obj;
            this.f104015OooOo |= Integer.MIN_VALUE;
            return C29326OooO0OO.this.emit(null, this);
        }
    }

    public C29326OooO0OO(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f104014OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f104015OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f104015OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f104016OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f104015OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            NoteMeta noteMeta = (NoteMeta) obj;
            if (noteMeta == null) {
                noteMeta = new NoteMeta(null, null, null, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524287, null);
            }
            oooO00o.f104015OooOo = 1;
            if (this.f104014OooOo0o.emit(noteMeta, oooO00o) == enumC32485OooO00o) {
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
