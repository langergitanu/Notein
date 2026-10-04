package o0OO00o0;

import com.orion.notein.data.p602db.entity.QuoteTextAnnoEntity;
import com.orion.notein.domain.mapper.QuoteMapper;
import com.orion.notein.domain.models.page.QuoteTextAnno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO00o0.o00OoOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26635o00OoOOo implements InterfaceC33721OooO0o<List<? extends QuoteTextAnno>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24378OooOoO0 f91929OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33734OooOOoo f91930OooOo0o;

    /* JADX INFO: renamed from: o0OO00o0.o00OoOOo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24378OooOoO0 f91931OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f91932OooOo0o;

        /* JADX INFO: renamed from: o0OO00o0.o00OoOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.QuoteRepoImpl$getTextAnnoList$$inlined$map$1$2", m80623f = "QuoteRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19799OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f91933OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f91934OooOo0o;

            public C19799OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f91934OooOo0o = obj;
                this.f91933OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C24378OooOoO0 c24378OooOoO0) {
            this.f91932OooOo0o = interfaceC33723OooO0oO;
            this.f91931OooOo = c24378OooOoO0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19799OooO00o c19799OooO00o;
            if (continuation instanceof C19799OooO00o) {
                c19799OooO00o = (C19799OooO00o) continuation;
                int i = c19799OooO00o.f91933OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19799OooO00o.f91933OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19799OooO00o = new C19799OooO00o(continuation);
                }
            }
            Object obj2 = c19799OooO00o.f91934OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19799OooO00o.f91933OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((QuoteMapper) this.f91931OooOo.f82247OooO0O0).toQuoteTextAnno((QuoteTextAnnoEntity) it.next()));
                }
                c19799OooO00o.f91933OooOo = 1;
                if (this.f91932OooOo0o.emit(arrayList, c19799OooO00o) == enumC32485OooO00o) {
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

    public C26635o00OoOOo(C33734OooOOoo c33734OooOOoo, C24378OooOoO0 c24378OooOoO0) {
        this.f91930OooOo0o = c33734OooOOoo;
        this.f91929OooOo = c24378OooOoO0;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends QuoteTextAnno>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f91930OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f91929OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
