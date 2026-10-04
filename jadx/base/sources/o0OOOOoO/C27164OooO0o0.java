package o0OOOOoO;

import java.util.List;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0Oo00o.C28028OooO0o;
import o0oo0OOo.C31236OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOOOoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27164OooO0o0 implements InterfaceC33721OooO0o<List<? extends Integer>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94819OooOo0o;

    /* JADX INFO: renamed from: o0OOOOoO.OooO0o0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f94820OooOo0o;

        /* JADX INFO: renamed from: o0OOOOoO.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.textboxinfo.TextBoxInfoLocalDataSource$getTextColors$$inlined$map$1$2", m80623f = "TextBoxInfoLocalDataSource.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19856OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f94821OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f94822OooOo0o;

            public C19856OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f94822OooOo0o = obj;
                this.f94821OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f94820OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19856OooO00o c19856OooO00o;
            List<Integer> list;
            if (continuation instanceof C19856OooO00o) {
                c19856OooO00o = (C19856OooO00o) continuation;
                int i = c19856OooO00o.f94821OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19856OooO00o.f94821OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19856OooO00o = new C19856OooO00o(continuation);
                }
            }
            Object obj2 = c19856OooO00o.f94822OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19856OooO00o.f94821OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(OooOOO.f94839OooO0o);
                if (str == null || str.length() == 0) {
                    list = C31236OooO00o.f111405OooO0O0;
                } else {
                    try {
                        Object objFromJson = C28028OooO0o.OooO00o().fromJson(str, new OooO0o().getType());
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(objFromJson);
                        list = (List) objFromJson;
                    } catch (Exception unused) {
                        list = C31236OooO00o.f111405OooO0O0;
                    }
                }
                c19856OooO00o.f94821OooOo = 1;
                if (this.f94820OooOo0o.emit(list, c19856OooO00o) == enumC32485OooO00o) {
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

    public C27164OooO0o0(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f94819OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends Integer>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f94819OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
