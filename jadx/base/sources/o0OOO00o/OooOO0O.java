package o0OOO00o;

import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import com.orion.notein.domain.models.note.NoteMeta;
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
public final class OooOO0O implements InterfaceC33721OooO0o<List<? extends NoteMeta>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26990OooO0o0 f93855OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f93856OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26990OooO0o0 f93857OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f93858OooOo0o;

        /* JADX INFO: renamed from: o0OOO00o.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.notemeta.NoteMetaRepoImpl$getNoteMetasInTrashBin$$inlined$map$1$2", m80623f = "NoteMetaRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19835OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f93859OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f93860OooOo0o;

            public C19835OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f93860OooOo0o = obj;
                this.f93859OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26990OooO0o0 c26990OooO0o0) {
            this.f93858OooOo0o = interfaceC33723OooO0oO;
            this.f93857OooOo = c26990OooO0o0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19835OooO00o c19835OooO00o;
            if (continuation instanceof C19835OooO00o) {
                c19835OooO00o = (C19835OooO00o) continuation;
                int i = c19835OooO00o.f93859OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19835OooO00o.f93859OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19835OooO00o = new C19835OooO00o(continuation);
                }
            }
            Object obj2 = c19835OooO00o.f93860OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19835OooO00o.f93859OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f93857OooOo.f93825OooO0OO.toModel((NoteMetaEntity) it.next()));
                }
                c19835OooO00o.f93859OooOo = 1;
                if (this.f93858OooOo0o.emit(arrayList, c19835OooO00o) == enumC32485OooO00o) {
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

    public OooOO0O(InterfaceC33721OooO0o interfaceC33721OooO0o, C26990OooO0o0 c26990OooO0o0) {
        this.f93856OooOo0o = interfaceC33721OooO0o;
        this.f93855OooOo = c26990OooO0o0;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteMeta>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f93856OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f93855OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
