package o0OoooOo;

import kotlin.coroutines.Continuation;
import o0OO00o0.C26481OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoooOo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29657OooOo0o implements InterfaceC33721OooO0o<com.orion.notein.p607ui.p609vo.OooO00o> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29652OooOOoo f105158OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26481OooOOo f105159OooOo0o;

    /* JADX INFO: renamed from: o0OoooOo.OooOo0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29652OooOOoo f105160OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f105161OooOo0o;

        /* JADX INFO: renamed from: o0OoooOo.OooOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentViewModel$special$$inlined$map$1$2", m80623f = "EditorCommentViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20013OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f105162OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f105163OooOo0o;

            public C20013OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f105163OooOo0o = obj;
                this.f105162OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C29652OooOOoo c29652OooOOoo) {
            this.f105161OooOo0o = interfaceC33723OooO0oO;
            this.f105160OooOo = c29652OooOOoo;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20013OooO00o c20013OooO00o;
            com.orion.notein.p607ui.p609vo.OooO00o oooO00oValueOf;
            if (continuation instanceof C20013OooO00o) {
                c20013OooO00o = (C20013OooO00o) continuation;
                int i = c20013OooO00o.f105162OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20013OooO00o.f105162OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20013OooO00o = new C20013OooO00o(continuation);
                }
            }
            Object obj2 = c20013OooO00o.f105163OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20013OooO00o.f105162OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                try {
                    oooO00oValueOf = com.orion.notein.p607ui.p609vo.OooO00o.valueOf((String) obj);
                } catch (Exception unused) {
                    oooO00oValueOf = com.orion.notein.p607ui.p609vo.OooO00o.f80089OooOoo0;
                    this.f105160OooOo.OooO0o0(oooO00oValueOf);
                }
                c20013OooO00o.f105162OooOo = 1;
                if (this.f105161OooOo0o.emit(oooO00oValueOf, c20013OooO00o) == enumC32485OooO00o) {
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

    public C29657OooOo0o(C26481OooOOo c26481OooOOo, C29652OooOOoo c29652OooOOoo) {
        this.f105159OooOo0o = c26481OooOOo;
        this.f105158OooOo = c29652OooOOoo;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super com.orion.notein.p607ui.p609vo.OooO00o> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f105159OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f105158OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
