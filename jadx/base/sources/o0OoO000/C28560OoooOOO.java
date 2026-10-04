package o0OoO000;

import OooOoOO.C20519OooO0Oo;
import androidx.lifecycle.AbstractC22019Ooooooo;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o00Oo000.C25035OooO0O0;
import o0OOOO0o.C27144o00o0O;
import o0OOOo0.C27174OooO0O0;
import o0OOo0Oo.InterfaceC27293OooO0oo;
import o0OOo0Oo.InterfaceC27315OooOooo;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27538o00o0o0O;
import o0OOo0o.C27600o0ooOO0;
import o0OoO000.C28560OoooOOO.OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0OoO000/OoooOOO;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C28560OoooOOO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27600o0ooOO0 f101222OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27315OooOooo f101223OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27293OooO0oo f101224OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27538o00o0o0O f101225OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25035OooO0O0 f101226OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27449o00O0OoO f101227OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final FirebaseAuth f101228OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33772OooooOo f101229OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33772OooooOo f101230OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C32447OooOOo f101231OooOOO0;

    /* JADX INFO: renamed from: o0OoO000.OoooOOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginViewModel$signUp$1$1", m80623f = "FirebaseLoginViewModel.kt", m80624l = {62}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101233OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C28560OoooOOO.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101233OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = C28560OoooOOO.this.f101229OooOO0O;
                Integer num = new Integer(1001);
                this.f101233OooOo0o = 1;
                if (c33772OooooOo.emit(num, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoO000.OoooOOO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginViewModel$signUp$2$1", m80623f = "FirebaseLoginViewModel.kt", m80624l = {69}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101235OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C28560OoooOOO.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101235OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = C28560OoooOOO.this.f101229OooOO0O;
                Integer num = new Integer(1001);
                this.f101235OooOo0o = 1;
                if (c33772OooooOo.emit(num, this) == enumC32485OooO00o) {
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

    public C28560OoooOOO(InterfaceC27315OooOooo noteinFirebaseUserRepo, C27538o00o0o0O stickerUseCase, InterfaceC27293OooO0oo backupRepo, C25035OooO0O0 c25035OooO0O0, C27449o00O0OoO c27449o00O0OoO, C27600o0ooOO0 c27600o0ooOO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteinFirebaseUserRepo, "noteinFirebaseUserRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stickerUseCase, "stickerUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(backupRepo, "backupRepo");
        this.f101223OooO0Oo = noteinFirebaseUserRepo;
        this.f101225OooO0o0 = stickerUseCase;
        this.f101224OooO0o = backupRepo;
        this.f101226OooO0oO = c25035OooO0O0;
        this.f101227OooO0oo = c27449o00O0OoO;
        this.f101222OooO = c27600o0ooOO0;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        kotlin.jvm.internal.OooOOO0.OooO0o(firebaseAuth, "getInstance(...)");
        this.f101228OooOO0 = firebaseAuth;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f101229OooOO0O = c33772OooooOoOooO0O0;
        this.f101230OooOO0o = c33772OooooOoOooO0O0;
        this.f101231OooOOO0 = C20519OooO0Oo.OooO0OO(new C27144o00o0O(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r11.emit(r9, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r11.emit(r9, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0111, code lost:
    
        if (r11.emit(r9, r0) == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(C28560OoooOOO c28560OoooOOO, C27174OooO0O0 c27174OooO0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000oOoO o000oooo2;
        c28560OoooOOO.getClass();
        if (abstractC32479OooO0OO instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) abstractC32479OooO0OO;
            int i = o000oooo2.f101344OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oooo2.f101344OooOoO = i - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(c28560OoooOOO, abstractC32479OooO0OO);
            }
        }
        Object obj = o000oooo2.f101342OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000oooo2.f101344OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "FirebaseLoginViewModel", "handleSignUpResult: response=", c27174OooO0O0), new Object[0]);
            String errorCode = c27174OooO0O0.getErrorCode();
            C33772OooooOo c33772OooooOo = c28560OoooOOO.f101229OooOO0O;
            if (errorCode != null) {
                int iHashCode = errorCode.hashCode();
                if (iHashCode != 48) {
                    if (iHashCode == 1457223784) {
                        if (errorCode.equals("199999")) {
                            Integer num = new Integer(1002);
                            o000oooo2.f101344OooOoO = 3;
                        }
                        return enumC32485OooO00o;
                    }
                    if (iHashCode == 1477264191 && errorCode.equals("200001")) {
                        Integer num2 = new Integer(1005);
                        o000oooo2.f101344OooOoO = 4;
                    }
                    return enumC32485OooO00o;
                }
                if (errorCode.equals("0")) {
                    Integer num3 = new Integer(1000);
                    o000oooo2.f101343OooOo0o = c28560OoooOOO;
                    o000oooo2.f101344OooOoO = 1;
                    if (c33772OooooOo.emit(num3, o000oooo2) != enumC32485OooO00o) {
                        c28560OoooOOO.getClass();
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O0), null, null, new C28557OoooO00(c28560OoooOOO, null), 3);
                        o000oooo2.f101343OooOo0o = null;
                        o000oooo2.f101344OooOoO = 2;
                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O0), null, null, new C28558OoooO0O(c28560OoooOOO, null), 3);
                    }
                }
                return enumC32485OooO00o;
            }
            Integer num4 = new Integer(1999);
            o000oooo2.f101344OooOoO = 5;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i2 == 3) {
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i2 == 4) {
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c28560OoooOOO = o000oooo2.f101343OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c28560OoooOOO.getClass();
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O02 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O02), null, null, new C28557OoooO00(c28560OoooOOO, null), 3);
            o000oooo2.f101343OooOo0o = null;
            o000oooo2.f101344OooOoO = 2;
            C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O02), null, null, new C28558OoooO0O(c28560OoooOOO, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28555OoooO c28555OoooO;
        if (abstractC32479OooO0OO instanceof C28555OoooO) {
            c28555OoooO = (C28555OoooO) abstractC32479OooO0OO;
            int i = c28555OoooO.f101208OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28555OoooO.f101208OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28555OoooO = new C28555OoooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28555OoooO.f101207OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28555OoooO.f101208OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C28559OoooOO0 c28559OoooOO0 = new C28559OoooOO0(this, str2, str, null);
            c28555OoooO.f101208OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c28559OoooOO0, c28555OoooO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    public final void OooO0oO(final FirebaseUser firebaseUser, String str) {
        Task<GetTokenResult> idToken = firebaseUser.getIdToken(true);
        final C28553Oooo0oO c28553Oooo0oO = new C28553Oooo0oO(this, firebaseUser, str);
        idToken.addOnSuccessListener(new OnSuccessListener() { // from class: o0OoO000.Oooo0oo
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                c28553Oooo0oO.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o0OoO000.Oooo
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FirebaseLoginViewModel");
                c20358OooO00o.OooO0Oo(it, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("signUp: failed to get idToken. user=", firebaseUser.getUid()), new Object[0]);
                C28560OoooOOO c28560OoooOOO = this;
                C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c28560OoooOOO), null, null, c28560OoooOOO.new OooO0O0(null), 3);
            }
        });
    }
}
