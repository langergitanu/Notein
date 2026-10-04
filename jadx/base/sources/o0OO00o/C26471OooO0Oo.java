package o0OO00o;

import com.orion.notein.data.p602db.entity.p603ai.NoteAiContentEntity;
import com.orion.notein.data.p602db.entity.p603ai.NoteSummaryEntity;
import com.orion.notein.domain.mapper.NoteAiContentMapper;
import com.orion.notein.domain.models.p605ai.NoteAiContent;
import com.orion.notein.domain.models.p605ai.NoteSummary;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0Oo.InterfaceC27287OooO0O0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33722OooO0o0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;
import oo0oO0.InterfaceC34808o000ooO;

/* JADX INFO: renamed from: o0OO00o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26471OooO0Oo implements InterfaceC27287OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26470OooO00o f90950OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NoteAiContentMapper f90951OooO0O0;

    /* JADX INFO: renamed from: o0OO00o.OooO0Oo$OooO00o */
    public static final class OooO00o implements InterfaceC33721OooO0o<NoteAiContent> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26471OooO0Oo f90952OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f90953OooOo0o;

        /* JADX INFO: renamed from: o0OO00o.OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19755OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C26471OooO0Oo f90954OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f90955OooOo0o;

            /* JADX INFO: renamed from: o0OO00o.OooO0Oo$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ai.AiAssistantRepoImpl$getNoteAiContent$$inlined$map$1$2", m80623f = "AiAssistantRepoImpl.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19756OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f90956OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f90957OooOo0o;

                public C19756OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f90957OooOo0o = obj;
                    this.f90956OooOo |= Integer.MIN_VALUE;
                    return C19755OooO00o.this.emit(null, this);
                }
            }

            public C19755OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26471OooO0Oo c26471OooO0Oo) {
                this.f90955OooOo0o = interfaceC33723OooO0oO;
                this.f90954OooOo = c26471OooO0Oo;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19756OooO00o c19756OooO00o;
                if (continuation instanceof C19756OooO00o) {
                    c19756OooO00o = (C19756OooO00o) continuation;
                    int i = c19756OooO00o.f90956OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19756OooO00o.f90956OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19756OooO00o = new C19756OooO00o(continuation);
                    }
                }
                Object obj2 = c19756OooO00o.f90957OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19756OooO00o.f90956OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    NoteAiContent model = this.f90954OooOo.f90951OooO0O0.toModel((NoteAiContentEntity) obj);
                    c19756OooO00o.f90956OooOo = 1;
                    if (this.f90955OooOo0o.emit(model, c19756OooO00o) == enumC32485OooO00o) {
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

        public OooO00o(InterfaceC33721OooO0o interfaceC33721OooO0o, C26471OooO0Oo c26471OooO0Oo) {
            this.f90953OooOo0o = interfaceC33721OooO0o;
            this.f90952OooOo = c26471OooO0Oo;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super NoteAiContent> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f90953OooOo0o.collect(new C19755OooO00o(interfaceC33723OooO0oO, this.f90952OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public C26471OooO0Oo(C26474OooO0oo c26474OooO0oo, C26470OooO00o c26470OooO00o, NoteAiContentMapper mapper) {
        OooOOO0.OooO0oO(mapper, "mapper");
        this.f90950OooO00o = c26470OooO00o;
        this.f90951OooO0O0 = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27287OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26472OooO0o0 c26472OooO0o0;
        C26471OooO0Oo c26471OooO0Oo;
        if (abstractC32479OooO0OO instanceof C26472OooO0o0) {
            c26472OooO0o0 = (C26472OooO0o0) abstractC32479OooO0OO;
            int i = c26472OooO0o0.f90964OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26472OooO0o0.f90964OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26472OooO0o0 = new C26472OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c26472OooO0o0.f90962OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26472OooO0o0.f90964OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                C26470OooO00o c26470OooO00o = this.f90950OooO00o;
                c26472OooO0o0.f90963OooOo0o = this;
                c26472OooO0o0.f90964OooOoO = 1;
                objOooO0OO = ((InterfaceC34808o000ooO) c26470OooO00o.f90943OooO00o).OooO0OO(str, c26472OooO0o0);
                if (objOooO0OO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26471OooO0Oo = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c26471OooO0Oo = c26472OooO0o0.f90963OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
            }
            NoteAiContentEntity noteAiContentEntity = (NoteAiContentEntity) objOooO0OO;
            if (noteAiContentEntity != null) {
                return c26471OooO0Oo.f90951OooO0O0.toModel(noteAiContentEntity);
            }
            return null;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiAssistantRepo");
            c20358OooO00o.OooO0OO("Unable to get content, e: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            return null;
        }
    }

    @Override // o0OOo0Oo.InterfaceC27287OooO0O0
    public final InterfaceC33721OooO0o<NoteAiContent> OooO0O0(String id) {
        OooOOO0.OooO0oO(id, "id");
        try {
            return new OooO00o(((InterfaceC34808o000ooO) this.f90950OooO00o.f90943OooO00o).OooO0Oo(id), this);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiAssistantRepo");
            c20358OooO00o.OooO0OO("Unable to get content, e: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            return C33722OooO0o0.f121519OooOo0o;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27287OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0OO oooO0OO;
        if (abstractC32479OooO0OO instanceof OooO0OO) {
            oooO0OO = (OooO0OO) abstractC32479OooO0OO;
            int i = oooO0OO.f90949OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f90949OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO0OO.f90948OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0OO.f90949OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26470OooO00o c26470OooO00o = this.f90950OooO00o;
                NoteSummaryEntity noteSummaryEntity = new NoteSummaryEntity(str, str2);
                oooO0OO.f90949OooOoO0 = 1;
                Object objOooO0O0 = ((InterfaceC34808o000ooO) c26470OooO00o.f90943OooO00o).OooO0O0(new NoteSummaryEntity[]{noteSummaryEntity}, oooO0OO);
                if (objOooO0O0 != enumC32485OooO00o) {
                    objOooO0O0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiAssistantRepo");
            c20358OooO00o.OooO0OO("Unable to save summary, e: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27287OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(NoteAiContent noteAiContent, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26473OooO0oO c26473OooO0oO;
        if (abstractC32479OooO0OO instanceof C26473OooO0oO) {
            c26473OooO0oO = (C26473OooO0oO) abstractC32479OooO0OO;
            int i = c26473OooO0oO.f90968OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26473OooO0oO.f90968OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26473OooO0oO = new C26473OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26473OooO0oO.f90967OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26473OooO0oO.f90968OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteAiContentEntity entity = this.f90951OooO0O0.toEntity(noteAiContent);
                C26470OooO00o c26470OooO00o = this.f90950OooO00o;
                OooOOO0.OooO0Oo(entity);
                c26473OooO0oO.f90968OooOoO0 = 1;
                Object objOooO0o0 = ((InterfaceC34808o000ooO) c26470OooO00o.f90943OooO00o).OooO0o0(entity, c26473OooO0oO);
                if (objOooO0o0 != enumC32485OooO00o) {
                    objOooO0o0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiAssistantRepo");
            c20358OooO00o.OooO0OO("Unable to save summary, e: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27287OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(NoteAiContent noteAiContent, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0O0 oooO0O0;
        if (abstractC32479OooO0OO instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) abstractC32479OooO0OO;
            int i = oooO0O0.f90946OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f90946OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO0O0.f90945OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f90946OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteAiContentEntity entity = this.f90951OooO0O0.toEntity(noteAiContent);
                C26470OooO00o c26470OooO00o = this.f90950OooO00o;
                OooOOO0.OooO0Oo(entity);
                oooO0O0.f90946OooOoO0 = 1;
                Object objOooO0o = ((InterfaceC34808o000ooO) c26470OooO00o.f90943OooO00o).OooO0o(new NoteAiContentEntity[]{entity}, oooO0O0);
                if (objOooO0o != enumC32485OooO00o) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiAssistantRepo");
            c20358OooO00o.OooO0OO("Unable to save summary, e: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27287OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0o oooO0o;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f90961OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f90961OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oooO0o.f90960OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f90961OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                C26470OooO00o c26470OooO00o = this.f90950OooO00o;
                oooO0o.f90961OooOoO0 = 1;
                objOooO00o = ((InterfaceC34808o000ooO) c26470OooO00o.f90943OooO00o).OooO00o(str, oooO0o);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            NoteSummaryEntity noteSummaryEntity = (NoteSummaryEntity) objOooO00o;
            if (noteSummaryEntity != null) {
                return new NoteSummary(noteSummaryEntity.getId(), noteSummaryEntity.getSummary());
            }
            return null;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiAssistantRepo");
            c20358OooO00o.OooO0OO("Unable to get summary, e: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            return null;
        }
    }
}
