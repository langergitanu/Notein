package o0oOoo00;

import android.net.Uri;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27339OooOo0O;
import o0OOo0o.C27351Oooo0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oOoo00.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupViewModel$recover$1", m80623f = "BackupViewModel.kt", m80624l = {198, 200, 218, 221, 230}, m80625m = "invokeSuspend")
public final class C31125OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f111073OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f111074OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Uri f111075OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C31114OooO f111076OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31125OooOO0O(C31114OooO c31114OooO, Uri uri, Continuation<? super C31125OooOO0O> continuation) {
        super(2, continuation);
        this.f111076OooOoO0 = c31114OooO;
        this.f111075OooOoO = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31125OooOO0O(this.f111076OooOoO0, this.f111075OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31125OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a2, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o != r2) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[Catch: Exception -> 0x002e, TRY_ENTER, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:17:0x0033, B:58:0x0122, B:59:0x0133, B:61:0x0139, B:62:0x0147, B:18:0x0038, B:27:0x006f, B:28:0x007d, B:31:0x0087, B:33:0x009c, B:35:0x00a4, B:37:0x00a9, B:38:0x00b5, B:40:0x00bb, B:42:0x00d0, B:44:0x00d8, B:46:0x00dd, B:47:0x00e3, B:49:0x00e9, B:51:0x00fe, B:55:0x0108, B:24:0x0055), top: B:75:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:17:0x0033, B:58:0x0122, B:59:0x0133, B:61:0x0139, B:62:0x0147, B:18:0x0038, B:27:0x006f, B:28:0x007d, B:31:0x0087, B:33:0x009c, B:35:0x00a4, B:37:0x00a9, B:38:0x00b5, B:40:0x00bb, B:42:0x00d0, B:44:0x00d8, B:46:0x00dd, B:47:0x00e3, B:49:0x00e9, B:51:0x00fe, B:55:0x0108, B:24:0x0055), top: B:75:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:17:0x0033, B:58:0x0122, B:59:0x0133, B:61:0x0139, B:62:0x0147, B:18:0x0038, B:27:0x006f, B:28:0x007d, B:31:0x0087, B:33:0x009c, B:35:0x00a4, B:37:0x00a9, B:38:0x00b5, B:40:0x00bb, B:42:0x00d0, B:44:0x00d8, B:46:0x00dd, B:47:0x00e3, B:49:0x00e9, B:51:0x00fe, B:55:0x0108, B:24:0x0055), top: B:75:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122 A[Catch: Exception -> 0x002e, PHI: r0
      0x0122: PHI (r0v18 java.util.ArrayList) = (r0v17 java.util.ArrayList), (r0v24 java.util.ArrayList) binds: [B:56:0x011e, B:17:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:17:0x0033, B:58:0x0122, B:59:0x0133, B:61:0x0139, B:62:0x0147, B:18:0x0038, B:27:0x006f, B:28:0x007d, B:31:0x0087, B:33:0x009c, B:35:0x00a4, B:37:0x00a9, B:38:0x00b5, B:40:0x00bb, B:42:0x00d0, B:44:0x00d8, B:46:0x00dd, B:47:0x00e3, B:49:0x00e9, B:51:0x00fe, B:55:0x0108, B:24:0x0055), top: B:75:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139 A[Catch: Exception -> 0x002e, LOOP:0: B:59:0x0133->B:61:0x0139, LOOP_END, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:17:0x0033, B:58:0x0122, B:59:0x0133, B:61:0x0139, B:62:0x0147, B:18:0x0038, B:27:0x006f, B:28:0x007d, B:31:0x0087, B:33:0x009c, B:35:0x00a4, B:37:0x00a9, B:38:0x00b5, B:40:0x00bb, B:42:0x00d0, B:44:0x00d8, B:46:0x00dd, B:47:0x00e3, B:49:0x00e9, B:51:0x00fe, B:55:0x0108, B:24:0x0055), top: B:75:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107 A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        Iterator it;
        Object next;
        ArrayList arrayListOooooOO;
        Iterator it2;
        C33772OooooOo c33772OooooOo;
        C32460OooOooO c32460OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111073OooOo;
        C31114OooO c31114OooO = this.f111076OooOoO0;
        C33781o00o0O c33781o00o0O = c31114OooO.f111034OooOOO0;
        try {
        } catch (Exception e) {
            boolean z = e instanceof BackupException;
            C33781o00o0O c33781o00o0O2 = c31114OooO.f111031OooOO0O;
            if (z) {
                Integer num = new Integer(((BackupException) e).getErrorCode());
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, num);
            } else {
                Integer num2 = new Integer(-999);
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, num2);
            }
            Integer num3 = new Integer(2);
            C33781o00o0O c33781o00o0O3 = c31114OooO.f111024OooO;
            c33781o00o0O3.getClass();
            c33781o00o0O3.OooOO0(null, num3);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Boolean bool = Boolean.TRUE;
            this.f111073OooOo = 1;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                List list = (List) objOooO0o;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    BackupFile backupFile = (BackupFile) obj2;
                    String strOoooOoo = C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, backupFile.getName(), "");
                    if (!backupFile.isDir() && strOoooOoo.equals(BackupFile.EXTENSION_NOTEIN_FILE)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    BackupFile backupFile2 = (BackupFile) obj3;
                    String strOoooOoo2 = C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, backupFile2.getName(), "");
                    if (!backupFile2.isDir() && strOoooOoo2.equals("template")) {
                        arrayList2.add(obj3);
                    }
                }
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    BackupFile backupFile3 = (BackupFile) next;
                    String strOoooOoo3 = C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, backupFile3.getName(), "");
                    if (!backupFile3.isDir() && strOoooOoo3.equals(BackupFile.EXTENSION_FOLDER_TREE_FILE)) {
                        break;
                    }
                }
                c31114OooO.f111040OooOo = (BackupFile) next;
                arrayListOooooOO = oOo000Oo.OooOo.OooooOO(arrayList, arrayList2);
                C33781o00o0O c33781o00o0O4 = c31114OooO.f111041OooOo0;
                this.f111074OooOo0o = arrayListOooooOO;
                this.f111073OooOo = 3;
                c33781o00o0O4.getClass();
                c33781o00o0O4.OooOO0(null, arrayListOooooOO);
                if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                    C33781o00o0O c33781o00o0O5 = c31114OooO.f111043OooOo0O;
                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
                    it2 = arrayListOooooOO.iterator();
                    while (it2.hasNext()) {
                    }
                    Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList3);
                    c33781o00o0O5.getClass();
                    c33781o00o0O5.OooOO0(null, setO0OO00O);
                    c33772OooooOo = c31114OooO.f111038OooOOo0;
                    c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    this.f111074OooOo0o = null;
                    this.f111073OooOo = 4;
                    if (c33772OooooOo.emit(c32460OooOooO, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i == 3) {
                arrayListOooooOO = this.f111074OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C33781o00o0O c33781o00o0O52 = c31114OooO.f111043OooOo0O;
                ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
                it2 = arrayListOooooOO.iterator();
                while (it2.hasNext()) {
                    arrayList32.add(((BackupFile) it2.next()).getId());
                }
                Set setO0OO00O2 = oOo000Oo.OooOo.o0OO00O(arrayList32);
                c33781o00o0O52.getClass();
                c33781o00o0O52.OooOO0(null, setO0OO00O2);
                c33772OooooOo = c31114OooO.f111038OooOOo0;
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
                this.f111074OooOo0o = null;
                this.f111073OooOo = 4;
                if (c33772OooooOo.emit(c32460OooOooO, this) != enumC32485OooO00o) {
                    Boolean bool2 = Boolean.FALSE;
                    this.f111074OooOo0o = null;
                    this.f111073OooOo = 5;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, bool2);
                }
                return enumC32485OooO00o;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            Boolean bool22 = Boolean.FALSE;
            this.f111074OooOo0o = null;
            this.f111073OooOo = 5;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool22);
        }
        C27351Oooo0O0 c27351Oooo0O0 = c31114OooO.f111025OooO0Oo;
        Uri uri = this.f111075OooOoO;
        this.f111073OooOo = 2;
        c27351Oooo0O0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27339OooOo0O(c27351Oooo0O0, uri, null), this);
        if (objOooO0o != enumC32485OooO00o) {
            List list2 = (List) objOooO0o;
            ArrayList arrayList4 = new ArrayList();
            while (r8.hasNext()) {
            }
            ArrayList arrayList22 = new ArrayList();
            while (r5.hasNext()) {
            }
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            c31114OooO.f111040OooOo = (BackupFile) next;
            arrayListOooooOO = oOo000Oo.OooOo.OooooOO(arrayList4, arrayList22);
            C33781o00o0O c33781o00o0O42 = c31114OooO.f111041OooOo0;
            this.f111074OooOo0o = arrayListOooooOO;
            this.f111073OooOo = 3;
            c33781o00o0O42.getClass();
            c33781o00o0O42.OooOO0(null, arrayListOooooOO);
            if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
