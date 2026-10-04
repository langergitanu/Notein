package o0o0OoOo;

import androidx.core.app.FrameMetricsAggregator;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OoOo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$resetUserInfoOfNotes$2", m80623f = "DebugViewModel.kt", m80624l = {509, FrameMetricsAggregator.EVERY_DURATION, 512}, m80625m = "invokeSuspend")
public final class C30740OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f109939OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f109940OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109941OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30740OooOo(C30722OooO00o c30722OooO00o, Continuation<? super C30740OooOo> continuation) {
        super(2, continuation);
        this.f109941OooOoO0 = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30740OooOo(this.f109941OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30740OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r2.f109863OooO0oo.OooOO0o(r1, r6) != r0) goto L28;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String id;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109939OooOo;
        C30722OooO00o c30722OooO00o = this.f109941OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109939OooOo = 1;
            obj = c30722OooO00o.f109870OooOOOo.OooO0OO(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str = this.f109940OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            this.f109940OooOo0o = null;
            this.f109939OooOo = 3;
        }
        NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) obj;
        if (noteinFirebaseUser == null || (id = noteinFirebaseUser.getId()) == null) {
            id = "";
        }
        str = id;
        this.f109940OooOo0o = str;
        this.f109939OooOo = 2;
        if (c30722OooO00o.f109866OooOO0o.Oooo(str, this) != enumC32485OooO00o) {
            this.f109940OooOo0o = null;
            this.f109939OooOo = 3;
        }
        return enumC32485OooO00o;
    }
}
