package o0OOo0oO;

import com.orion.notein.domain.models.note.AudioFile;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o000o0Oo.C24610OooO0O0;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27292OooO0oO;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27610OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27292OooO0oO f97084OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f97085OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27309OooOoO f97086OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27129OoooOOO f97087OooO0Oo;

    public C27610OooO0o0(InterfaceC27292OooO0oO audioRepo, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27309OooOoO noteContentRepo, C27129OoooOOO c27129OoooOOO) {
        OooOOO0.OooO0oO(audioRepo, "audioRepo");
        OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        this.f97084OooO00o = audioRepo;
        this.f97085OooO0O0 = noteMetaRepo;
        this.f97086OooO0OO = noteContentRepo;
        this.f97087OooO0Oo = c27129OoooOOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.OooO0Oo(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AudioFile audioFile, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27606OooO00o c27606OooO00o;
        C27610OooO0o0 c27610OooO0o0;
        if (abstractC32479OooO0OO instanceof C27606OooO00o) {
            c27606OooO00o = (C27606OooO00o) abstractC32479OooO0OO;
            int i = c27606OooO00o.f97070OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27606OooO00o.f97070OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27606OooO00o = new C27606OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27606OooO00o.f97069OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27606OooO00o.f97070OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27606OooO00o.f97067OooOo0o = this;
            c27606OooO00o.f97066OooOo = str;
            c27606OooO00o.f97070OooOoOO = 1;
            if (this.f97084OooO00o.OooO0o(audioFile, str, c27606OooO00o) != enumC32485OooO00o) {
                c27610OooO0o0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c27606OooO00o.f97066OooOo;
        c27610OooO0o0 = c27606OooO00o.f97067OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c27606OooO00o.f97067OooOo0o = null;
        c27606OooO00o.f97066OooOo = null;
        c27606OooO00o.f97070OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r7.OooO0Oo(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27607OooO0O0 c27607OooO0O0;
        C27610OooO0o0 c27610OooO0o0;
        if (abstractC32479OooO0OO instanceof C27607OooO0O0) {
            c27607OooO0O0 = (C27607OooO0O0) abstractC32479OooO0OO;
            int i = c27607OooO0O0.f97075OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27607OooO0O0.f97075OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27607OooO0O0 = new C27607OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27607OooO0O0.f97074OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27607OooO0O0.f97075OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27607OooO0O0.f97072OooOo0o = this;
            c27607OooO0O0.f97071OooOo = str;
            c27607OooO0O0.f97075OooOoOO = 1;
            if (this.f97084OooO00o.OooOo0(set, str, c27607OooO0O0) != enumC32485OooO00o) {
                c27610OooO0o0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c27607OooO0O0.f97071OooOo;
        c27610OooO0o0 = c27607OooO0O0.f97072OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c27607OooO0O0.f97072OooOo0o = null;
        c27607OooO0O0.f97071OooOo = null;
        c27607OooO0O0.f97075OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.OooO0Oo(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AudioFile audioFile, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27608OooO0OO c27608OooO0OO;
        C27610OooO0o0 c27610OooO0o0;
        if (abstractC32479OooO0OO instanceof C27608OooO0OO) {
            c27608OooO0OO = (C27608OooO0OO) abstractC32479OooO0OO;
            int i = c27608OooO0OO.f97080OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27608OooO0OO.f97080OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27608OooO0OO = new C27608OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27608OooO0OO.f97079OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27608OooO0OO.f97080OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27608OooO0OO.f97077OooOo0o = this;
            c27608OooO0OO.f97076OooOo = str;
            c27608OooO0OO.f97080OooOoOO = 1;
            if (this.f97084OooO00o.OooO0O0(audioFile, str, c27608OooO0OO) != enumC32485OooO00o) {
                c27610OooO0o0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c27608OooO0OO.f97076OooOo;
        c27610OooO0o0 = c27608OooO0OO.f97077OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c27608OooO0OO.f97077OooOo0o = null;
        c27608OooO0OO.f97076OooOo = null;
        c27608OooO0OO.f97080OooOoOO = 2;
    }

    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (!C24610OooO0O0.f83393OooO00o) {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27609OooO0Oo(this, str, null), abstractC32479OooO0OO);
            return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("AudioUseCase");
        c20358OooO00o.OooOO0O("skipNoteMetaWriteInEditor enabled, skip noteId=%s", str);
        return C32460OooOooO.f116667OooO00o;
    }
}
