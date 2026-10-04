package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.note.NoteHistoryVersion;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OoO0oo.oo0o0O0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0oo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.ManageNoteHistoryVersionUseCase$setHistoryVersion$2", m80623f = "ManageNoteHistoryVersionUseCase.kt", m80624l = {36, 42, 55, 67, 68}, m80625m = "invokeSuspend")
public final class C27668Oooooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f97314OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f97315OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public InterfaceC27660OoooOo0 f97316OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f97317OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97318OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27670OoooooO f97319OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f97320OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f97321OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ NoteHistoryVersion f97322OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ oo0o0O0 f97323Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27668Oooooo(C27670OoooooO c27670OoooooO, String str, NoteHistoryVersion noteHistoryVersion, oo0o0O0 oo0o0o0, Continuation continuation) {
        super(2, continuation);
        this.f97319OooOoo = c27670OoooooO;
        this.f97321OooOooO = str;
        this.f97322OooOooo = noteHistoryVersion;
        this.f97323Oooo000 = oo0o0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27668Oooooo c27668Oooooo = new C27668Oooooo(this.f97319OooOoo, this.f97321OooOooO, this.f97322OooOooo, this.f97323Oooo000, continuation);
        c27668Oooooo.f97320OooOoo0 = obj;
        return c27668Oooooo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>> continuation) {
        return ((C27668Oooooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0164, code lost:
    
        if (r1.OoooOo0(r0, r21) != r8) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:9:0x0018, B:51:0x0167, B:16:0x002e, B:48:0x0154, B:19:0x0049, B:44:0x0118, B:22:0x0067, B:38:0x00f0, B:40:0x00f4, B:52:0x016a, B:53:0x0171, B:25:0x0085, B:32:0x00b2, B:34:0x00ba, B:54:0x0172, B:55:0x0177, B:28:0x009c), top: B:59:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:9:0x0018, B:51:0x0167, B:16:0x002e, B:48:0x0154, B:19:0x0049, B:44:0x0118, B:22:0x0067, B:38:0x00f0, B:40:0x00f4, B:52:0x016a, B:53:0x0171, B:25:0x0085, B:32:0x00b2, B:34:0x00ba, B:54:0x0172, B:55:0x0177, B:28:0x009c), top: B:59:0x000c }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        String str;
        NoteHistoryVersion noteHistoryVersion;
        Object objOooO00o2;
        C27670OoooooO c27670OoooooO;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o;
        Object objOooOoo0;
        String str2;
        String str3;
        C27670OoooooO c27670OoooooO2;
        File file;
        Object objOooO00o3;
        File file2;
        C27670OoooooO c27670OoooooO3;
        String str4;
        InterfaceC27660OoooOo0 interfaceC27660OoooOo0;
        Object objOooO0O0;
        Object obj2;
        String str5;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97318OooOoOO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27670OoooooO c27670OoooooO4 = this.f97319OooOoo;
            str = this.f97321OooOooO;
            noteHistoryVersion = this.f97322OooOooo;
            oo0o0O0 oo0o0o0 = this.f97323Oooo000;
            C27635OooOoO c27635OooOoO = c27670OoooooO4.f97328OooO0O0;
            this.f97320OooOoo0 = c27670OoooooO4;
            this.f97315OooOo0o = str;
            this.f97314OooOo = noteHistoryVersion;
            this.f97317OooOoO0 = oo0o0o0;
            this.f97318OooOoOO = 1;
            objOooO00o2 = c27635OooOoO.OooO00o(this);
            if (objOooO00o2 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27670OoooooO = c27670OoooooO4;
            interfaceC32507OooOO0o = oo0o0o0;
        } else if (i == 1) {
            InterfaceC32507OooOO0o interfaceC32507OooOO0o2 = (InterfaceC32507OooOO0o) this.f97317OooOoO0;
            noteHistoryVersion = (NoteHistoryVersion) this.f97314OooOo;
            str = this.f97315OooOo0o;
            C27670OoooooO c27670OoooooO5 = (C27670OoooooO) this.f97320OooOoo0;
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o2 = obj;
            interfaceC32507OooOO0o = interfaceC32507OooOO0o2;
            c27670OoooooO = c27670OoooooO5;
        } else if (i == 2) {
            File file3 = (File) this.f97317OooOoO0;
            String str6 = (String) this.f97314OooOo;
            str3 = this.f97315OooOo0o;
            c27670OoooooO2 = (C27670OoooooO) this.f97320OooOoo0;
            C32446OooOOOo.OooO0O0(obj);
            objOooOoo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
            file = file3;
            str2 = str6;
            if (!(objOooOoo0 instanceof C32445OooOOOO.OooO00o)) {
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOoo0);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
                throw thOooO00o;
            }
            InterfaceC27660OoooOo0 interfaceC27660OoooOo02 = c27670OoooooO2.f97330OooO0Oo.get(CloudMetaType.NOTE);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC27660OoooOo02);
            InterfaceC27660OoooOo0 interfaceC27660OoooOo03 = interfaceC27660OoooOo02;
            this.f97320OooOoo0 = c27670OoooooO2;
            this.f97315OooOo0o = str3;
            this.f97314OooOo = str2;
            this.f97317OooOoO0 = file;
            this.f97316OooOoO = interfaceC27660OoooOo03;
            this.f97318OooOoOO = 3;
            objOooO00o3 = interfaceC27660OoooOo03.OooO00o(str3, this);
            if (objOooO00o3 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file2 = file;
            c27670OoooooO3 = c27670OoooooO2;
            str4 = str2;
            interfaceC27660OoooOo0 = interfaceC27660OoooOo03;
            C32446OooOOOo.OooO0O0(objOooO00o3);
            CloudBundle cloudBundle = (CloudBundle) objOooO00o3;
            CloudContentTag.Companion companion = CloudContentTag.INSTANCE;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(file2);
            CloudBundle cloudBundle2 = new CloudBundle(file2, companion.from(file2, System.currentTimeMillis()), cloudBundle.getExtra(), cloudBundle.getMetaHash(), cloudBundle.getMimeType());
            this.f97320OooOoo0 = c27670OoooooO3;
            this.f97315OooOo0o = str3;
            this.f97314OooOo = null;
            this.f97317OooOoO0 = null;
            this.f97316OooOoO = null;
            this.f97318OooOoOO = 4;
            objOooO0O0 = interfaceC27660OoooOo0.OooO0O0(str4, cloudBundle2, true, this);
            if (objOooO0O0 != enumC32485OooO00o) {
            }
        } else if (i == 3) {
            interfaceC27660OoooOo0 = this.f97316OooOoO;
            File file4 = (File) this.f97317OooOoO0;
            String str7 = (String) this.f97314OooOo;
            String str8 = this.f97315OooOo0o;
            C27670OoooooO c27670OoooooO6 = (C27670OoooooO) this.f97320OooOoo0;
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o3 = ((C32445OooOOOO) obj).f116639OooOo0o;
            str4 = str7;
            str3 = str8;
            file2 = file4;
            c27670OoooooO3 = c27670OoooooO6;
            C32446OooOOOo.OooO0O0(objOooO00o3);
            CloudBundle cloudBundle3 = (CloudBundle) objOooO00o3;
            CloudContentTag.Companion companion2 = CloudContentTag.INSTANCE;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(file2);
            CloudBundle cloudBundle22 = new CloudBundle(file2, companion2.from(file2, System.currentTimeMillis()), cloudBundle3.getExtra(), cloudBundle3.getMetaHash(), cloudBundle3.getMimeType());
            this.f97320OooOoo0 = c27670OoooooO3;
            this.f97315OooOo0o = str3;
            this.f97314OooOo = null;
            this.f97317OooOoO0 = null;
            this.f97316OooOoO = null;
            this.f97318OooOoOO = 4;
            objOooO0O0 = interfaceC27660OoooOo0.OooO0O0(str4, cloudBundle22, true, this);
            if (objOooO0O0 != enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            String str9 = str3;
            obj2 = objOooO0O0;
            str5 = str9;
            C32446OooOOOo.OooO0O0(obj2);
            C27449o00O0OoO c27449o00O0OoO = c27670OoooooO3.f97327OooO00o;
            this.f97320OooOoo0 = null;
            this.f97315OooOo0o = null;
            this.f97318OooOoOO = 5;
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = C32460OooOooO.f116667OooO00o;
                return new C32445OooOOOO(objOooO00o);
            }
            str5 = this.f97315OooOo0o;
            c27670OoooooO3 = (C27670OoooooO) this.f97320OooOoo0;
            C32446OooOOOo.OooO0O0(obj);
            obj2 = ((C32445OooOOOO) obj).f116639OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            C27449o00O0OoO c27449o00O0OoO2 = c27670OoooooO3.f97327OooO00o;
            this.f97320OooOoo0 = null;
            this.f97315OooOo0o = null;
            this.f97318OooOoOO = 5;
        }
        if (!((Boolean) objOooO00o2).booleanValue()) {
            throw new CloudSyncError.DisallowToUseCellular(null, 1, null);
        }
        File fileCreateTempFile = File.createTempFile("history_bundle_", ".zip");
        InterfaceC27605OooO00o interfaceC27605OooO00o = c27670OoooooO.f97329OooO0OO;
        NoteHistoryVersion noteHistoryVersion2 = noteHistoryVersion;
        String absolutePath = fileCreateTempFile.getAbsolutePath();
        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
        String id = noteHistoryVersion2.getId();
        long size = noteHistoryVersion2.getSize();
        this.f97320OooOoo0 = c27670OoooooO;
        this.f97315OooOo0o = str;
        this.f97314OooOo = str;
        this.f97317OooOoO0 = fileCreateTempFile;
        this.f97318OooOoOO = 2;
        String str10 = str;
        objOooOoo0 = interfaceC27605OooO00o.OooOoo0(str10, absolutePath, id, size, interfaceC32507OooOO0o, this);
        if (objOooOoo0 == enumC32485OooO00o) {
            return enumC32485OooO00o;
        }
        str2 = str10;
        str3 = str2;
        c27670OoooooO2 = c27670OoooooO;
        file = fileCreateTempFile;
        if (!(objOooOoo0 instanceof C32445OooOOOO.OooO00o)) {
        }
    }
}
