package o0oOo00;

import com.orion.notein.domain.models.sticker.StickerCollection;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO implements InterfaceC33721OooO0o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f110547OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f110548OooOo0o;

        /* JADX INFO: renamed from: o0oOo00.OooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditViewModel$special$$inlined$map$2$2", m80623f = "StickerCollectionEditViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20141OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f110549OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f110550OooOo0o;

            public C20141OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f110550OooOo0o = obj;
                this.f110549OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f110548OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20141OooO00o c20141OooO00o;
            if (continuation instanceof C20141OooO00o) {
                c20141OooO00o = (C20141OooO00o) continuation;
                int i = c20141OooO00o.f110549OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20141OooO00o.f110549OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20141OooO00o = new C20141OooO00o(continuation);
                }
            }
            Object obj2 = c20141OooO00o.f110550OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20141OooO00o.f110549OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Boolean boolValueOf = Boolean.valueOf(!(((StickerCollection) obj) != null ? r5.getBuiltIn() : false));
                c20141OooO00o.f110549OooOo = 1;
                if (this.f110548OooOo0o.emit(boolValueOf, c20141OooO00o) == enumC32485OooO00o) {
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

    public OooOOO(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f110547OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f110547OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
