package o0OO;

import com.orion.notein.data.p602db.entity.NotePlaceholderEntity;
import com.orion.notein.domain.models.note.NotePlaceHolder;
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

/* JADX INFO: loaded from: classes9.dex */
public final class OooOo implements InterfaceC33721OooO0o<List<? extends NotePlaceHolder>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26415OooOo0O f90688OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f90689OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26415OooOo0O f90690OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f90691OooOo0o;

        /* JADX INFO: renamed from: o0OO.OooOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.NotePlaceholderRepoImpl$getNotePlaceholders$$inlined$map$1$2", m80623f = "NotePlaceholderRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19750OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f90692OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f90693OooOo0o;

            public C19750OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f90693OooOo0o = obj;
                this.f90692OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26415OooOo0O c26415OooOo0O) {
            this.f90691OooOo0o = interfaceC33723OooO0oO;
            this.f90690OooOo = c26415OooOo0O;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19750OooO00o c19750OooO00o;
            if (continuation instanceof C19750OooO00o) {
                c19750OooO00o = (C19750OooO00o) continuation;
                int i = c19750OooO00o.f90692OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19750OooO00o.f90692OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19750OooO00o = new C19750OooO00o(continuation);
                }
            }
            Object obj2 = c19750OooO00o.f90693OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19750OooO00o.f90692OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f90690OooOo.f90699OooO0O0.toNotePlaceholder((NotePlaceholderEntity) it.next()));
                }
                c19750OooO00o.f90692OooOo = 1;
                if (this.f90691OooOo0o.emit(arrayList, c19750OooO00o) == enumC32485OooO00o) {
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

    public OooOo(InterfaceC33721OooO0o interfaceC33721OooO0o, C26415OooOo0O c26415OooOo0O) {
        this.f90689OooOo0o = interfaceC33721OooO0o;
        this.f90688OooOo = c26415OooOo0O;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NotePlaceHolder>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f90689OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f90688OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
