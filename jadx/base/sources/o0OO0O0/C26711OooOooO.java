package o0OO0O0;

import com.orion.notein.data.p602db.entity.NoteAudioFileIdsFieldEntity;
import com.orion.notein.domain.models.note.NoteAudioFileIdsField;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0O0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26711OooOooO implements InterfaceC33721OooO0o<NoteAudioFileIdsField> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f92286OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33734OooOOoo f92287OooOo0o;

    /* JADX INFO: renamed from: o0OO0O0.OooOooO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f92288OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f92289OooOo0o;

        /* JADX INFO: renamed from: o0OO0O0.OooOooO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioRepoImpl$getNoteAudioFileIds$$inlined$map$1$2", m80623f = "AudioRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19809OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f92290OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f92291OooOo0o;

            public C19809OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f92291OooOo0o = obj;
                this.f92290OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Oooo000 oooo000) {
            this.f92289OooOo0o = interfaceC33723OooO0oO;
            this.f92288OooOo = oooo000;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19809OooO00o c19809OooO00o;
            if (continuation instanceof C19809OooO00o) {
                c19809OooO00o = (C19809OooO00o) continuation;
                int i = c19809OooO00o.f92290OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19809OooO00o.f92290OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19809OooO00o = new C19809OooO00o(continuation);
                }
            }
            Object obj2 = c19809OooO00o.f92291OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19809OooO00o.f92290OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                NoteAudioFileIdsFieldEntity noteAudioFileIdsFieldEntity = (NoteAudioFileIdsFieldEntity) obj;
                NoteAudioFileIdsField model = noteAudioFileIdsFieldEntity != null ? this.f92288OooOo.f92298OooO0O0.toModel(noteAudioFileIdsFieldEntity) : null;
                c19809OooO00o.f92290OooOo = 1;
                if (this.f92289OooOo0o.emit(model, c19809OooO00o) == enumC32485OooO00o) {
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

    public C26711OooOooO(C33734OooOOoo c33734OooOOoo, Oooo000 oooo000) {
        this.f92287OooOo0o = c33734OooOOoo;
        this.f92286OooOo = oooo000;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super NoteAudioFileIdsField> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f92287OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f92286OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
