package o0OO0O0;

import com.orion.notein.data.p602db.entity.AudioFileEntity;
import com.orion.notein.domain.models.note.AudioFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO0O0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26705OooOo0o implements InterfaceC33721OooO0o<List<? extends AudioFile>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f92259OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33734OooOOoo f92260OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Map f92261OooOoO0;

    /* JADX INFO: renamed from: o0OO0O0.OooOo0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f92262OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f92263OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Map f92264OooOoO0;

        /* JADX INFO: renamed from: o0OO0O0.OooOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioRepoImpl$getAudioFileByIds$$inlined$map$1$2", m80623f = "AudioRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19808OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f92265OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f92266OooOo0o;

            public C19808OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f92266OooOo0o = obj;
                this.f92265OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Oooo000 oooo000, Map map) {
            this.f92263OooOo0o = interfaceC33723OooO0oO;
            this.f92262OooOo = oooo000;
            this.f92264OooOoO0 = map;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19808OooO00o c19808OooO00o;
            if (continuation instanceof C19808OooO00o) {
                c19808OooO00o = (C19808OooO00o) continuation;
                int i = c19808OooO00o.f92265OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19808OooO00o.f92265OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19808OooO00o = new C19808OooO00o(continuation);
                }
            }
            Object obj2 = c19808OooO00o.f92266OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19808OooO00o.f92265OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f92262OooOo.f92298OooO0O0.toModel((AudioFileEntity) it.next()));
                }
                List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList, new OooOo(this.f92264OooOoO0));
                c19808OooO00o.f92265OooOo = 1;
                if (this.f92263OooOo0o.emit(listO00O0O, c19808OooO00o) == enumC32485OooO00o) {
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

    public C26705OooOo0o(C33734OooOOoo c33734OooOOoo, Oooo000 oooo000, Map map) {
        this.f92260OooOo0o = c33734OooOOoo;
        this.f92259OooOo = oooo000;
        this.f92261OooOoO0 = map;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends AudioFile>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f92260OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f92259OooOo, this.f92261OooOoO0), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
