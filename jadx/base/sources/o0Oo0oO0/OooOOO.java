package o0Oo0oO0;

import android.content.Context;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0oOoOo.C31038OooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0Oo0oO0/OooOOO;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooOOO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final List<C31038OooOO0> f100372OooOOOO = C34429OooOOo0.OooOO0o(new C31038OooOO0(0, false), new C31038OooOO0(1, false), new C31038OooOO0(2, false), new C31038OooOO0(3, false), new C31038OooOO0(4, false));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33772OooooOo f100373OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0OO0.OooOO0O f100374OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33781o00o0O f100375OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33781o00o0O f100376OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33781o00o0O f100377OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33781o00o0O f100378OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33772OooooOo f100379OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33781o00o0O f100380OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f100381OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33769Ooooo0o f100382OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33769Ooooo0o f100383OooOOO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackViewModel$commitBtnEnabled$1", m80623f = "FeedbackViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends C31038OooOO0>, String, String, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ String f100384OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f100385OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ String f100386OooOoO0;

        @Override // oO0O000o.InterfaceC32509OooOOo
        public final Object invoke(List<? extends C31038OooOO0> list, String str, String str2, Continuation<? super Boolean> continuation) {
            OooO00o oooO00o = new OooO00o(4, continuation);
            oooO00o.f100385OooOo0o = list;
            oooO00o.f100384OooOo = str;
            oooO00o.f100386OooOoO0 = str2;
            return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            boolean z;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = this.f100385OooOo0o;
            String str = this.f100384OooOo;
            String str2 = this.f100386OooOoO0;
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z = false;
            } else {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((C31038OooOO0) it.next()).f110815OooO0O0) {
                        if (str.length() <= 0 || str2.length() <= 0) {
                            break;
                        }
                        z = true;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class OooO0O0 implements InterfaceC33721OooO0o<Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f100387OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f100388OooOo0o;

            /* JADX INFO: renamed from: o0Oo0oO0.OooOOO$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.feedback.FeedbackViewModel$special$$inlined$map$1$2", m80623f = "FeedbackViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19910OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f100389OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f100390OooOo0o;

                public C19910OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f100390OooOo0o = obj;
                    this.f100389OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f100388OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19910OooO00o c19910OooO00o;
                if (continuation instanceof C19910OooO00o) {
                    c19910OooO00o = (C19910OooO00o) continuation;
                    int i = c19910OooO00o.f100389OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19910OooO00o.f100389OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19910OooO00o = new C19910OooO00o(continuation);
                    }
                }
                Object obj2 = c19910OooO00o.f100390OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19910OooO00o.f100389OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Integer num = new Integer(((String) obj).length());
                    c19910OooO00o.f100389OooOo = 1;
                    if (this.f100388OooOo0o.emit(num, c19910OooO00o) == enumC32485OooO00o) {
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

        public OooO0O0(C33781o00o0O c33781o00o0O) {
            this.f100387OooOo0o = c33781o00o0O;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
            this.f100387OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    public OooOOO(Context context) {
        o00O0OO0.OooOO0O oooOO0OOoooooO = o00O0OO0.OooOO0O.OoooooO(context);
        kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OOoooooO, "getInstance(...)");
        this.f100374OooO0Oo = oooOO0OOoooooO;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(f100372OooOOOO);
        this.f100376OooO0o0 = c33781o00o0OOooO00o;
        this.f100375OooO0o = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(C34434OooOoO.f123453OooOo0o);
        this.f100377OooO0oO = c33781o00o0OOooO00o2;
        this.f100378OooO0oo = c33781o00o0OOooO00o2;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f100373OooO = c33772OooooOoOooO0O0;
        this.f100379OooOO0 = c33772OooooOoOooO0O0;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o("");
        this.f100380OooOO0O = c33781o00o0OOooO00o3;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o("");
        this.f100381OooOO0o = c33781o00o0OOooO00o4;
        this.f100383OooOOO0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33781o00o0OOooO00o, c33781o00o0OOooO00o3, c33781o00o0OOooO00o4, new OooO00o(4, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), Boolean.FALSE);
        this.f100382OooOOO = C25252OooO0Oo.OooOoO0(new OooO0O0(c33781o00o0OOooO00o3), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), Integer.valueOf(((String) c33781o00o0OOooO00o3.getValue()).length()));
    }
}
