package o0OOO0;

import com.orion.notein.data.p602db.entity.AiOcrTextPageEntity;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26985OooO0o0 implements InterfaceC33721OooO0o<List<? extends AiOcrTextPage>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f93763OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f93764OooOo0o;

    /* JADX INFO: renamed from: o0OOO0.OooO0o0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f93765OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f93766OooOo0o;

        /* JADX INFO: renamed from: o0OOO0.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ocr.AiOcrTextPageRepoImpl$getPagesByIdList$$inlined$map$1$2", m80623f = "AiOcrTextPageRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19830OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f93767OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f93768OooOo0o;

            public C19830OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f93768OooOo0o = obj;
                this.f93767OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, OooO0o oooO0o) {
            this.f93766OooOo0o = interfaceC33723OooO0oO;
            this.f93765OooOo = oooO0o;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19830OooO00o c19830OooO00o;
            if (continuation instanceof C19830OooO00o) {
                c19830OooO00o = (C19830OooO00o) continuation;
                int i = c19830OooO00o.f93767OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19830OooO00o.f93767OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19830OooO00o = new C19830OooO00o(continuation);
                }
            }
            Object obj2 = c19830OooO00o.f93768OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19830OooO00o.f93767OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f93765OooOo.f93762OooO0O0.fromEntity((AiOcrTextPageEntity) it.next()));
                }
                c19830OooO00o.f93767OooOo = 1;
                if (this.f93766OooOo0o.emit(arrayList, c19830OooO00o) == enumC32485OooO00o) {
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

    public C26985OooO0o0(InterfaceC33721OooO0o interfaceC33721OooO0o, OooO0o oooO0o) {
        this.f93764OooOo0o = interfaceC33721OooO0o;
        this.f93763OooOo = oooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends AiOcrTextPage>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f93764OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f93763OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
