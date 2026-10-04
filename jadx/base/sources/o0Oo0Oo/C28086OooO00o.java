package o0Oo0Oo;

import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOOooO.EnumC27267OooO00o;
import o0OOo0Oo.InterfaceC27293OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;

/* JADX INFO: renamed from: o0Oo0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0Oo0Oo/OooO00o;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C28086OooO00o extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27293OooO0oo f99550OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33772OooooOo f99551OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33772OooooOo f99552OooO0o0;

    /* JADX INFO: renamed from: o0Oo0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.netdisk.auth.BaiduAuthorizationViewModel$1", m80623f = "BaiduAuthorizationViewModel.kt", m80624l = {25}, m80625m = "invokeSuspend")
    public static final class C19889OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f99554OooOo0o;

        public C19889OooO00o(Continuation<? super C19889OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C28086OooO00o.this.new C19889OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19889OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f99554OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = C28086OooO00o.this.f99552OooO0o0;
                EnumC27267OooO00o enumC27267OooO00o = EnumC27267OooO00o.f95064OooOo0o;
                this.f99554OooOo0o = 1;
                if (c33772OooooOo.emit(enumC27267OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C28086OooO00o(InterfaceC27293OooO0oo backupRepo) {
        OooOOO0.OooO0oO(backupRepo, "backupRepo");
        this.f99550OooO0Oo = backupRepo;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f99552OooO0o0 = c33772OooooOoOooO0O0;
        this.f99551OooO0o = c33772OooooOoOooO0O0;
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C19889OooO00o(null), 3);
    }
}
