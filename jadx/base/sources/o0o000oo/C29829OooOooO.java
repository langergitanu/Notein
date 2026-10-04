package o0o000oo;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0O0oooO.C26320o0000OoO;
import o0OoOOo.C29167OoooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o000oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnAudioRecorderButtonClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1620}, m80625m = "invokeSuspend")
public final class C29829OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105822OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105823OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29829OooOooO(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C29829OooOooO> continuation) {
        super(2, continuation);
        this.f105822OooOo = baseToolbarChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29829OooOooO(this.f105822OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29829OooOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ActivityC21897OooOo0 activity;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105823OooOo0o;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105822OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f105823OooOo0o = 1;
            obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 34, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue() && (activity = baseToolbarChildFragment.getActivity()) != null) {
            if (ContextCompat.checkSelfPermission(activity, "android.permission.RECORD_AUDIO") != 0) {
                String string = baseToolbarChildFragment.getString(R.string.request_record_audio_permission_title);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = baseToolbarChildFragment.getString(R.string.request_record_audio_permission_to_record_audio);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                baseToolbarChildFragment.Oooooo(string, string2);
                baseToolbarChildFragment.f76504OooooO0.OooO00o("android.permission.RECORD_AUDIO");
                return C32460OooOooO.f116667OooO00o;
            }
            if (((Set) baseToolbarChildFragment.Oooo0oo().f105934OooOOOO.getValue()).contains(8)) {
                baseToolbarChildFragment.Oooo000().Oooo0();
            } else {
                FirebaseUserMembership firebaseUserMembership = (FirebaseUserMembership) ((C26320o0000OoO) baseToolbarChildFragment.f76477OooOoo.getValue()).f90255o000oOoO.f121747OooOo0o.getValue();
                Long l = (firebaseUserMembership == null || firebaseUserMembership.getMembershipType() == FirebaseUserMembership.MembershipType.FREE) ? new Long(com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74220o000oOoO) : null;
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = baseToolbarChildFragment.Oooo000();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o.OooO0o0("startMediaRecorder.", new Object[0]);
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(oooO0oOooo000);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29167OoooO0(oooO0oOooo000, l, null), 2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
