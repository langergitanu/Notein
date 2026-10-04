package o0oOo00;

import androidx.lifecycle.AbstractC22019Ooooooo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27538o00o0o0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0oOo00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0oOo00/OooO0o0;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30933OooO0o0 extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33772OooooOo f110518OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27538o00o0o0O f110519OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f110520OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33781o00o0O f110521OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33772OooooOo f110522OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33772OooooOo f110523OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33772OooooOo f110524OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33781o00o0O f110525OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f110526OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o00000OO f110527OooOOO0;

    /* JADX INFO: renamed from: o0oOo00.OooO0o0$OooO00o */
    public static final class OooO00o implements InterfaceC33721OooO0o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f110528OooOo0o;

        /* JADX INFO: renamed from: o0oOo00.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20139OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f110529OooOo0o;

            /* JADX INFO: renamed from: o0oOo00.OooO0o0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.ExportStickerCollectionViewModel$special$$inlined$map$1$2", m80623f = "ExportStickerCollectionViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C20140OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f110530OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f110531OooOo0o;

                public C20140OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f110531OooOo0o = obj;
                    this.f110530OooOo |= Integer.MIN_VALUE;
                    return C20139OooO00o.this.emit(null, this);
                }
            }

            public C20139OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f110529OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20140OooO00o c20140OooO00o;
                if (continuation instanceof C20140OooO00o) {
                    c20140OooO00o = (C20140OooO00o) continuation;
                    int i = c20140OooO00o.f110530OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20140OooO00o.f110530OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20140OooO00o = new C20140OooO00o(continuation);
                    }
                }
                Object obj2 = c20140OooO00o.f110531OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20140OooO00o.f110530OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((String) obj).length() == 0);
                    c20140OooO00o.f110530OooOo = 1;
                    if (this.f110529OooOo0o.emit(boolValueOf, c20140OooO00o) == enumC32485OooO00o) {
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

        public OooO00o(C33781o00o0O c33781o00o0O) {
            this.f110528OooOo0o = c33781o00o0O;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
            this.f110528OooOo0o.collect(new C20139OooO00o(interfaceC33723OooO0oO), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    public C30933OooO0o0(C27538o00o0o0O stickerUseCase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stickerUseCase, "stickerUseCase");
        this.f110519OooO0Oo = stickerUseCase;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o("");
        this.f110521OooO0o0 = c33781o00o0OOooO00o;
        this.f110520OooO0o = new OooO00o(c33781o00o0OOooO00o);
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f110522OooO0oO = c33772OooooOoOooO0O0;
        this.f110523OooO0oo = c33772OooooOoOooO0O0;
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f110518OooO = c33772OooooOoOooO0O02;
        this.f110524OooOO0 = c33772OooooOoOooO0O02;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(Float.valueOf(0.0f));
        this.f110525OooOO0O = c33781o00o0OOooO00o2;
        this.f110526OooOO0o = c33781o00o0OOooO00o2;
    }
}
