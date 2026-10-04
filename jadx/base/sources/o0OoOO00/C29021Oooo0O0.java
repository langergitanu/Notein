package o0OoOO00;

import com.orion.notein.domain.models.papertheme.MyTemplate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOO00.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29021Oooo0O0 implements InterfaceC33721OooO0o<Map<String, ? extends String>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f102823OooOo0o;

    /* JADX INFO: renamed from: o0OoOO00.Oooo0O0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f102824OooOo0o;

        /* JADX INFO: renamed from: o0OoOO00.Oooo0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$special$$inlined$map$3$2", m80623f = "AddPageViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19950OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f102825OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f102826OooOo0o;

            public C19950OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f102826OooOo0o = obj;
                this.f102825OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f102824OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19950OooO00o c19950OooO00o;
            if (continuation instanceof C19950OooO00o) {
                c19950OooO00o = (C19950OooO00o) continuation;
                int i = c19950OooO00o.f102825OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19950OooO00o.f102825OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19950OooO00o = new C19950OooO00o(continuation);
                }
            }
            Object obj2 = c19950OooO00o.f102826OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19950OooO00o.f102825OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List<MyTemplate> list = (List) obj;
                int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                for (MyTemplate myTemplate : list) {
                    linkedHashMap.put(myTemplate.getId(), myTemplate.getTitle());
                }
                c19950OooO00o.f102825OooOo = 1;
                if (this.f102824OooOo0o.emit(linkedHashMap, c19950OooO00o) == enumC32485OooO00o) {
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

    public C29021Oooo0O0(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f102823OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Map<String, ? extends String>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f102823OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
