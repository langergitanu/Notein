package o0OoOOO0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31089Ooooooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOOO0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29069OooOoO0 implements InterfaceC33721OooO0o<List<? extends C31089Ooooooo>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f103019OooOo0o;

    /* JADX INFO: renamed from: o0OoOOO0.OooOoO0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f103020OooOo0o;

        /* JADX INFO: renamed from: o0OoOOO0.OooOoO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$special$$inlined$map$2$2", m80623f = "TextBoxViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19954OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f103021OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f103022OooOo0o;

            public C19954OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f103022OooOo0o = obj;
                this.f103021OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f103020OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19954OooO00o c19954OooO00o;
            if (continuation instanceof C19954OooO00o) {
                c19954OooO00o = (C19954OooO00o) continuation;
                int i = c19954OooO00o.f103021OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19954OooO00o.f103021OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19954OooO00o = new C19954OooO00o(continuation);
                }
            }
            Object obj2 = c19954OooO00o.f103022OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19954OooO00o.f103021OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Map map = (Map) obj;
                List<C31089Ooooooo> list = C29051OooOO0o.f102893OoooO0O;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i3 = ((C31089Ooooooo) it.next()).f110962OooO00o;
                    Object obj3 = map.get(new Integer(i3));
                    Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                    arrayList.add(new C31089Ooooooo(i3, bool != null ? bool.booleanValue() : false));
                }
                c19954OooO00o.f103021OooOo = 1;
                if (this.f103020OooOo0o.emit(arrayList, c19954OooO00o) == enumC32485OooO00o) {
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

    public C29069OooOoO0(C33769Ooooo0o c33769Ooooo0o) {
        this.f103019OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends C31089Ooooooo>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f103019OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
