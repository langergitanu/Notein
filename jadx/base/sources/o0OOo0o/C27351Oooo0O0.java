package o0OOo0o;

import OooOo.C20485OooOoO;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21111o0ooOoO;
import OoooooO.C21445Oooo;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.data.p602db.entity.MyTemplateEntity;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.backup.BackupInstance;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteInFile;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipOutputStream;
import o0000oOO.AbstractC24338OooO0o0;
import o000oooo.C24761OooO;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOO00.C27095OooOo0O;
import o0OOOoo.C27205OooO0OO;
import o0OOo0Oo.InterfaceC27293OooO0oo;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0Oo0O00.C28051OooO00o;
import o0Oo0OoO.C28108OooOO0;
import o0Oo0OoO.C28114OooOOOo;
import o0Oo0OoO.C28117OooOOoo;
import o0oOo0o0.AbstractC30978OooO;
import o0oo000O.C31183OooO00o;
import o0oo000O.C31184OooO0O0;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0OOo0o.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27351Oooo0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceC27314OooOooO f95235OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f95236OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C28117OooOOoo f95237OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C28114OooOOOo f95238OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C28108OooOO0 f95239OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27600o0ooOO0 f95240OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27449o00O0OoO f95241OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27387o0000o0 f95242OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InterfaceC27293OooO0oo f95243OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C27095OooOo0O f95244OooOO0;

    public C27351Oooo0O0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, C28117OooOOoo c28117OooOOoo, C28114OooOOOo c28114OooOOOo, C28108OooOO0 c28108OooOO0, C27449o00O0OoO c27449o00O0OoO, C27600o0ooOO0 c27600o0ooOO0, C27387o0000o0 noteInFileUseCase, InterfaceC27293OooO0oo backupRepo, InterfaceC27314OooOooO notePlaceholderRepo, C27095OooOo0O c27095OooOo0O) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteInFileUseCase, "noteInFileUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(backupRepo, "backupRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notePlaceholderRepo, "notePlaceholderRepo");
        this.f95236OooO00o = abstractApplicationC26277OooOoOO;
        this.f95237OooO0O0 = c28117OooOOoo;
        this.f95238OooO0OO = c28114OooOOOo;
        this.f95239OooO0Oo = c28108OooOO0;
        this.f95241OooO0o0 = c27449o00O0OoO;
        this.f95240OooO0o = c27600o0ooOO0;
        this.f95242OooO0oO = noteInFileUseCase;
        this.f95243OooO0oo = backupRepo;
        this.f95235OooO = notePlaceholderRepo;
        this.f95244OooOO0 = c27095OooOo0O;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C27333OooOO0o(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27351Oooo0O0 c27351Oooo0O0, List list, File file, AbstractC32479OooO0OO abstractC32479OooO0OO) throws NoSuchAlgorithmException, IOException {
        OooOOOO oooOOOO;
        File file2;
        long j;
        c27351Oooo0O0.getClass();
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i = oooOOOO.f95129OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f95129OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(c27351Oooo0O0, abstractC32479OooO0OO);
            }
        }
        Object objO00000Oo = oooOOOO.f95128OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOOO.f95129OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objO00000Oo);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupUseCase");
            c20358OooO00o.OooO0o0("backupFolderTree, start converting folder tree to backupFile.", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
            oooOOOO.f95126OooOo0o = file;
            oooOOOO.f95125OooOo = jCurrentTimeMillis;
            oooOOOO.f95129OooOoOO = 1;
            objO00000Oo = c27351Oooo0O0.f95239OooO0Oo.o00000Oo(absolutePath, list, oooOOOO);
            if (objO00000Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file2 = file;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooOOOO.f95125OooOo;
            file2 = oooOOOO.f95126OooOo0o;
            C32446OooOOOo.OooO0O0(objO00000Oo);
        }
        int iIntValue = ((Number) objO00000Oo).intValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        File[] fileArrListFiles = file2.listFiles();
        c20358OooO00o2.OooO00o("backupFolderTree, result: " + iIntValue + ", outputDir: " + file2 + " outputDir files: " + (fileArrListFiles != null ? oOo000Oo.OooOOO.Oooo0O0(fileArrListFiles, null, null, null, new OooO(0), 31) : null), new Object[0]);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c20358OooO00o2.OooOOO0("BackupUseCase");
        String strOooO0O0 = C31430OooO00o.OooO0O0(j);
        String strOooO0O02 = C31430OooO00o.OooO0O0(jCurrentTimeMillis2);
        String strOooO00o = C31430OooO00o.OooO00o(jCurrentTimeMillis2 - j);
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("backupFolderTree, backup folder tree during ", strOooO0O0, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, strOooO0O02, ", cost ");
        sbOooO0O0.append(strOooO00o);
        sbOooO0O0.append(", result is ");
        sbOooO0O0.append(iIntValue);
        c20358OooO00o2.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        if (iIntValue != 0) {
            c20358OooO00o2.OooO0OO(C20860Ooooooo.OooO0OO(c20358OooO00o2, "BackupUseCase", "backupFolderTree failed, result: ", iIntValue), new Object[0]);
            return null;
        }
        File[] fileArrListFiles2 = file2.listFiles();
        if (fileArrListFiles2 == null) {
            c20358OooO00o2.OooOOO0("BackupUseCase");
            c20358OooO00o2.OooO0OO("backupFolderTree failed, folder tree file is null.", new Object[0]);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file3 : C31190OooO0oo.OooOo00(file2, true)) {
            if (file3.isFile()) {
                arrayList.add(C31190OooO0oo.OooOOO(file3));
            }
        }
        C34431OooOo0.OooOoo(arrayList);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        kotlin.jvm.internal.OooOOO0.OooO0o(messageDigest, "getInstance(...)");
        String strJoin = TextUtils.join(",", arrayList);
        kotlin.jvm.internal.OooOOO0.OooO0o(strJoin, "join(...)");
        messageDigest.update(C33595OooOOo.OooOOOo(strJoin));
        String strOooO00o2 = C31184OooO0O0.OooO00o(messageDigest.digest());
        File file4 = new File(file2, "folder.tree");
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("backupFolderTree, start to zip, filesInOutputDir: ", oOo000Oo.OooOOO.Oooo0O0(fileArrListFiles2, null, null, null, new OooOO0(0), 31)), new Object[0]);
        C31193OooOOo.OooO0o(oOo000Oo.OooOOO.OoooOO0(fileArrListFiles2), file4);
        c20358OooO00o3.OooOOO0("BackupUseCase");
        c20358OooO00o3.OooO0o0("backupFolderTree, zip folder tree files, result: true", new Object[0]);
        Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_ID, "folder_tree"), new C32443OooOOO("content_type", "folder_tree"), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_CHECKSUM, strOooO00o2));
        String strOooO00o3 = C24761OooO.OooO00o("toString(...)");
        BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.None;
        String name = file4.getName();
        kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
        String absolutePath2 = file4.getAbsolutePath();
        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
        BackupFile backupFile = new BackupFile(strOooO00o3, diskVendor, name, absolutePath2, false, file4.lastModified(), file4.length(), mapOooO0oo, null);
        C31190OooO0oo.OooOO0O(file2, new OooOO0O());
        return backupFile;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C27351Oooo0O0 c27351Oooo0O0, Note note, File file, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27334OooOOOo c27334OooOOOo;
        long jCurrentTimeMillis;
        Note note2;
        File file2;
        C27351Oooo0O0 c27351Oooo0O02 = c27351Oooo0O0;
        String strOooO0Oo = str;
        if (abstractC32479OooO0OO instanceof C27334OooOOOo) {
            c27334OooOOOo = (C27334OooOOOo) abstractC32479OooO0OO;
            int i = c27334OooOOOo.f95137OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27334OooOOOo.f95137OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27334OooOOOo = new C27334OooOOOo(c27351Oooo0O02, abstractC32479OooO0OO);
            }
        }
        Object objOooo0oO = c27334OooOOOo.f95136OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27334OooOOOo.f95137OooOooO;
        BackupFile backupFile = null;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooo0oO);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupUseCase");
            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("backupNote, start converting note to backupFile, note id = ", note.getId(), ", title = ", note.getTitle(), ", noteinFileName = ");
            sbOooO0O0.append(strOooO0Oo);
            c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
            jCurrentTimeMillis = System.currentTimeMillis();
            String id = note.getId();
            c27334OooOOOo.f95131OooOo0o = c27351Oooo0O02;
            note2 = note;
            c27334OooOOOo.f95130OooOo = note2;
            file2 = file;
            c27334OooOOOo.f95133OooOoO0 = file2;
            c27334OooOOOo.f95132OooOoO = strOooO0Oo;
            c27334OooOOOo.f95134OooOoOO = jCurrentTimeMillis;
            c27334OooOOOo.f95137OooOooO = 1;
            objOooo0oO = C27387o0000o0.Oooo0oO(c27351Oooo0O02.f95242OooO0oO, id, null, c27334OooOOOo, 6);
            if (objOooo0oO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = c27334OooOOOo.f95134OooOoOO;
            String str2 = c27334OooOOOo.f95132OooOoO;
            File file3 = c27334OooOOOo.f95133OooOoO0;
            Note note3 = c27334OooOOOo.f95130OooOo;
            C27351Oooo0O0 c27351Oooo0O03 = c27334OooOOOo.f95131OooOo0o;
            C32446OooOOOo.OooO0O0(objOooo0oO);
            jCurrentTimeMillis = j;
            c27351Oooo0O02 = c27351Oooo0O03;
            strOooO0Oo = str2;
            file2 = file3;
            note2 = note3;
        }
        NoteInFile noteInFile = (NoteInFile) objOooo0oO;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("BackupUseCase");
        String strOooO0O0 = C31430OooO00o.OooO0O0(jCurrentTimeMillis);
        String strOooO0O02 = C31430OooO00o.OooO0O0(jCurrentTimeMillis2);
        String strOooO00o = C31430OooO00o.OooO00o(jCurrentTimeMillis2 - jCurrentTimeMillis);
        StringBuilder sb = new StringBuilder("backupNote, convert note to noteinFile, result = ");
        sb.append(noteInFile);
        sb.append(", during: ");
        sb.append(strOooO0O0);
        sb.append(" - ");
        c20358OooO00o2.OooO0o0(C21445Oooo.OooO0O0(sb, strOooO0O02, ", cost: ", strOooO00o, "s"), new Object[0]);
        if (noteInFile != null) {
            String md5 = noteInFile.getMd5();
            if (strOooO0Oo == null) {
                strOooO0Oo = C21111o0ooOoO.OooO0Oo(note2.getTitle(), ".in");
            }
            c27351Oooo0O02.getClass();
            File file4 = new File(file2, OooOo00(strOooO0Oo));
            boolean zOooO00o = C31190OooO0oo.OooO00o(noteInFile.getFile(), file4);
            c20358OooO00o2.OooOOO0("BackupUseCase");
            c20358OooO00o2.OooO0o0(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("backupNote, zip note files, ok = ", zOooO00o), new Object[0]);
            noteInFile.deleteFileWithItsParentAfterUsed();
            if (!zOooO00o) {
                return null;
            }
            file4.setLastModified(note2.getLastModificationTime());
            Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_ID, note2.getId()), new C32443OooOOO("content_type", BackupFile.FILE_CONTENT_TYPE_NOTE), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_CHECKSUM, md5));
            String strOooO00o2 = C24761OooO.OooO00o("toString(...)");
            BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.None;
            String name = file4.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
            String absolutePath = file4.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
            backupFile = new BackupFile(strOooO00o2, diskVendor, name, absolutePath, false, file4.lastModified(), file4.length(), mapOooO0oo, null);
        } else {
            c20358OooO00o2.OooOOO0("BackupUseCase");
            c20358OooO00o2.OooO0OO("backupNote, convert note to noteinFile failed.", new Object[0]);
        }
        C31190OooO0oo.OooOO0O(file2, new C27332OooO0oo());
        file2.setLastModified(note2.getLastModificationTime());
        c20358OooO00o2.OooOOO0("BackupUseCase");
        c20358OooO00o2.OooO0o0("backupNote, end converting note to backupFile, " + backupFile, new Object[0]);
        return backupFile;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(C27351Oooo0O0 c27351Oooo0O0, MyTemplate myTemplate, File file, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27336OooOOo0 c27336OooOOo0;
        long jCurrentTimeMillis;
        File file2;
        C27351Oooo0O0 c27351Oooo0O02 = c27351Oooo0O0;
        MyTemplate myTemplate2 = myTemplate;
        c27351Oooo0O02.getClass();
        if (abstractC32479OooO0OO instanceof C27336OooOOo0) {
            c27336OooOOo0 = (C27336OooOOo0) abstractC32479OooO0OO;
            int i = c27336OooOOo0.f95146OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27336OooOOo0.f95146OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27336OooOOo0 = new C27336OooOOo0(c27351Oooo0O02, abstractC32479OooO0OO);
            }
        }
        Object num = c27336OooOOo0.f95145OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27336OooOOo0.f95146OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(num);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupUseCase");
            c20358OooO00o.OooO0o0(C22237OooO0o0.OooO00o("backupTemplate, start converting template to backupFile, template id = ", myTemplate2.getId(), ", title = ", myTemplate2.getTitle()), new Object[0]);
            jCurrentTimeMillis = System.currentTimeMillis();
            String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
            c27336OooOOo0.f95142OooOo0o = c27351Oooo0O02;
            c27336OooOOo0.f95141OooOo = myTemplate2;
            c27336OooOOo0.f95144OooOoO0 = file;
            c27336OooOOo0.f95143OooOoO = jCurrentTimeMillis;
            c27336OooOOo0.f95146OooOoo = 1;
            C28114OooOOOo c28114OooOOOo = c27351Oooo0O02.f95238OooO0OO;
            File file3 = new File(absolutePath);
            PaperTheme paperTheme = myTemplate2.getPaperTheme();
            if (paperTheme == null) {
                num = new Integer(-999);
            } else {
                boolean z = paperTheme instanceof LocalUriPaperTheme;
                if (z || (paperTheme instanceof PdfPaperTheme)) {
                    File file4 = z ? new File(((LocalUriPaperTheme) paperTheme).getUri()) : new File(((PdfPaperTheme) paperTheme).getPdfInfo().getPdfPath());
                    if (file4.exists()) {
                        File file5 = new File(file3, Oooo0oO.o0Oo0oo.OooO0Oo(myTemplate2.getId(), ".", C32501OooO0oO.OooO0o0(file4)));
                        if (C31190OooO0oo.OooO00o(file4, file5)) {
                            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(c28114OooOOOo.f99651OooOoO0.toEntity(myTemplate2));
                            String absolutePath2 = new File(file3.getAbsolutePath(), Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getAbsolutePath();
                            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
                            num = new Integer(c28114OooOOOo.o00000O(listOooO0oO, MyTemplateEntity.class, absolutePath2));
                        } else {
                            Log.e("MyTemplate", "Couldn't back theme file from " + file4 + " to " + file5);
                            num = new Integer(-999);
                        }
                    } else {
                        num = new Integer(-999);
                    }
                }
            }
            if (num == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            file2 = file;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = c27336OooOOo0.f95143OooOoO;
            file2 = c27336OooOOo0.f95144OooOoO0;
            MyTemplate myTemplate3 = c27336OooOOo0.f95141OooOo;
            C27351Oooo0O0 c27351Oooo0O03 = c27336OooOOo0.f95142OooOo0o;
            C32446OooOOOo.OooO0O0(num);
            jCurrentTimeMillis = j;
            c27351Oooo0O02 = c27351Oooo0O03;
            myTemplate2 = myTemplate3;
        }
        int iIntValue = ((Number) num).intValue();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("BackupUseCase");
        String title = myTemplate2.getTitle();
        String strOooO0O0 = C31430OooO00o.OooO0O0(jCurrentTimeMillis);
        String strOooO0O02 = C31430OooO00o.OooO0O0(jCurrentTimeMillis2);
        String strOooO00o = C31430OooO00o.OooO00o(jCurrentTimeMillis2 - jCurrentTimeMillis);
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(iIntValue, "backupTemplate, convert template: ", title, " to templateFile, result = ", ", during: ");
        OooOO0.OooO0OO.OooO0o0(sbOooO0OO, strOooO0O0, " - ", strOooO0O02, ", cost: ");
        sbOooO0OO.append(strOooO00o);
        c20358OooO00o2.OooO0o0(sbOooO0OO.toString(), new Object[0]);
        ZipOutputStream zipOutputStream = null;
        if (iIntValue != 0) {
            c20358OooO00o2.OooOOO0("BackupUseCase");
            c20358OooO00o2.OooO0OO("backupTemplate, convert template to templateFile failed.", new Object[0]);
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            c20358OooO00o2.OooOOO0("BackupUseCase");
            c20358OooO00o2.OooO0OO("backupTemplate failed, can not list files in outputDir.", new Object[0]);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (File file6 : C31190OooO0oo.OooOo00(file2, true)) {
            if (file6.isFile()) {
                arrayList.add(C31190OooO0oo.OooOOO(file6));
            }
        }
        C34431OooOo0.OooOoo(arrayList);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        kotlin.jvm.internal.OooOOO0.OooO0o(messageDigest, "getInstance(...)");
        String strJoin = TextUtils.join(",", arrayList);
        kotlin.jvm.internal.OooOOO0.OooO0o(strJoin, "join(...)");
        messageDigest.update(C33595OooOOo.OooOOOo(strJoin));
        String strOooO00o2 = C31184OooO0O0.OooO00o(messageDigest.digest());
        String str = myTemplate2.getTitle() + ".template";
        c27351Oooo0O02.getClass();
        File file7 = new File(file2, OooOo00(str));
        List listOoooOO0 = oOo000Oo.OooOOO.OoooOO0(fileArrListFiles);
        String id = myTemplate2.getId();
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file7));
            try {
                Iterator it = listOoooOO0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zipOutputStream2.finish();
                        zipOutputStream2.close();
                        break;
                    }
                    if (!C31193OooOOo.OooO0o0((File) it.next(), "", zipOutputStream2, id)) {
                        zipOutputStream2.finish();
                        zipOutputStream2.close();
                        z2 = false;
                        break;
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("BackupUseCase");
                c20358OooO00o3.OooO0o0("backupTemplate, zip template files, ok = " + z2, new Object[0]);
                file7.setLastModified(myTemplate2.getLastModificationTime());
                Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_ID, myTemplate2.getId()), new C32443OooOOO("content_type", "template"), new C32443OooOOO(BackupFile.FILE_PROPERTY_CONTENT_CHECKSUM, strOooO00o2));
                String strOooO00o3 = C24761OooO.OooO00o("toString(...)");
                BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.None;
                String name = file7.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                String absolutePath3 = file7.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath3, "getAbsolutePath(...)");
                BackupFile backupFile = new BackupFile(strOooO00o3, diskVendor, name, absolutePath3, false, file7.lastModified(), file7.length(), mapOooO0oo, null);
                C31190OooO0oo.OooOO0O(file2, new C27331OooO0oO());
                file2.setLastModified(myTemplate2.getLastModificationTime());
                return backupFile;
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    zipOutputStream.finish();
                    zipOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final Object OooO0Oo(C27351Oooo0O0 c27351Oooo0O0, BackupFile backupFile, Oooo000 oooo000) throws Throwable {
        c27351Oooo0O0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27337OooOOoo(backupFile, c27351Oooo0O0, null), oooo000);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public static final /* synthetic */ String OooO0o0(C27351Oooo0O0 c27351Oooo0O0, String str) {
        c27351Oooo0O0.getClass();
        return OooOo00(str);
    }

    public static final File OooO0oO(C27351Oooo0O0 c27351Oooo0O0, BackupFile.DiskVendor diskVendor) {
        c27351Oooo0O0.getClass();
        File file = new File(c27351Oooo0O0.f95236OooO00o.getFilesDir(), "backup");
        C31190OooO0oo.OooO0o(file);
        String lowerCase = diskVendor.name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        File file2 = new File(file, lowerCase);
        C31190OooO0oo.OooO0o(file2);
        File file3 = new File(file2, "to_upload_dir");
        C31190OooO0oo.OooO0o(file3);
        File file4 = new File(file3, String.valueOf(System.currentTimeMillis()));
        C31190OooO0oo.OooO0o(file4);
        return file4;
    }

    public static final File OooO0oo(C27351Oooo0O0 c27351Oooo0O0) {
        c27351Oooo0O0.getClass();
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "Notein");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "backup.zip");
    }

    public static final File OooOO0(C27351Oooo0O0 c27351Oooo0O0, BackupFile.DiskVendor diskVendor) {
        c27351Oooo0O0.getClass();
        return new File(c27351Oooo0O0.f95236OooO00o.getCacheDir(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("recovery-template-", diskVendor.name()));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|2|(2:4|(1:6)(1:7))(0)|8|58|(1:(1:(1:(8:13|56|14|47|48|53|54|55)(2:18|19))(9:20|21|40|41|61|43|(4:46|47|48|53)|54|55))(2:25|26))(3:30|31|(3:33|54|55))|34|35|37|(3:39|54|55)|40|41|61|43|(0)|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
    
        r12 = r15;
        r15 = r14;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010a, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, o0OOo0o.Oooo0O0] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, o0OOo0o.Oooo0O0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, o0OOo0o.Oooo0O0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable OooOO0O(C27351Oooo0O0 c27351Oooo0O0, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27341OooOoO c27341OooOoO;
        ?? r15;
        List list;
        ?? r2;
        List list2;
        ?? r22;
        ?? r14;
        Object objOooO0o;
        ?? r142;
        c27351Oooo0O0.getClass();
        if (abstractC32479OooO0OO instanceof C27341OooOoO) {
            c27341OooOoO = (C27341OooOoO) abstractC32479OooO0OO;
            int i = c27341OooOoO.f95190OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27341OooOoO.f95190OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27341OooOoO = new C27341OooOoO(c27351Oooo0O0, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o2 = c27341OooOoO.f95187OooOoO;
        Serializable serializableOooooOO = EnumC32485OooO00o.f116726OooOo0o;
        ?? r23 = c27341OooOoO.f95190OooOoo0;
        List list3 = C34434OooOoO.f123453OooOo0o;
        try {
            try {
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BackupUseCase");
                c20358OooO00o.OooO0Oo(e, "getRemoteBackupFiles get notein files error.", new Object[0]);
                r2 = c27351Oooo0O0;
                list2 = list3;
            }
        } catch (Exception e2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupUseCase");
            c20358OooO00o2.OooO0Oo(e2, "getRemoteBackupFiles get template files error.", new Object[0]);
            r15 = c27351Oooo0O0;
            list = list3;
            r22 = r23;
        }
        if (r23 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o2);
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("BackupUseCase");
            c20358OooO00o3.OooO0o0("getRemoteBackupFiles, vendor = " + diskVendor, new Object[0]);
            c27341OooOoO.f95186OooOo0o = c27351Oooo0O0;
            c27341OooOoO.f95185OooOo = diskVendor;
            c27341OooOoO.f95190OooOoo0 = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27342OooOoO0(diskVendor, true, c27351Oooo0O0, null), c27341OooOoO);
            c27351Oooo0O0 = c27351Oooo0O0;
            if (objOooO0o2 == serializableOooooOO) {
                return serializableOooooOO;
            }
        } else {
            if (r23 != 1) {
                if (r23 != 2) {
                    if (r23 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) c27341OooOoO.f95185OooOo;
                    r14 = (List) c27341OooOoO.f95186OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0o2);
                        r14 = r14;
                        list3 = (List) objOooO0o2;
                        r142 = r14;
                    } catch (Exception e3) {
                        Exception e4 = e3;
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("BackupUseCase");
                        c20358OooO00o4.OooO0Oo(e4, "getRemoteBackupFiles get folder tree error.", new Object[0]);
                        r142 = r14;
                    }
                    serializableOooooOO = oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO((Collection) r142, list), list3);
                    return serializableOooooOO;
                }
                List list4 = c27341OooOoO.f95188OooOoO0;
                diskVendor = (BackupFile.DiskVendor) c27341OooOoO.f95185OooOo;
                C27351Oooo0O0 c27351Oooo0O02 = (C27351Oooo0O0) c27341OooOoO.f95186OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o2);
                r23 = c27351Oooo0O02;
                c27351Oooo0O0 = list4;
                List list5 = (List) objOooO0o2;
                r15 = c27351Oooo0O0;
                list = list5;
                r22 = r23;
                c27341OooOoO.f95186OooOo0o = r15;
                c27341OooOoO.f95185OooOo = list;
                c27341OooOoO.f95188OooOoO0 = null;
                c27341OooOoO.f95190OooOoo0 = 3;
                r22.getClass();
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27340OooOo0o(diskVendor, null, r22), c27341OooOoO);
                if (objOooO0o != serializableOooooOO) {
                    ?? r12 = r15;
                    objOooO0o2 = objOooO0o;
                    r14 = r12;
                    list3 = (List) objOooO0o2;
                    r142 = r14;
                    serializableOooooOO = oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO((Collection) r142, list), list3);
                }
                return serializableOooooOO;
            }
            diskVendor = (BackupFile.DiskVendor) c27341OooOoO.f95185OooOo;
            C27351Oooo0O0 c27351Oooo0O03 = (C27351Oooo0O0) c27341OooOoO.f95186OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o2);
            c27351Oooo0O0 = c27351Oooo0O03;
        }
        r2 = c27351Oooo0O0;
        list2 = (List) objOooO0o2;
        c27341OooOoO.f95186OooOo0o = r2;
        c27341OooOoO.f95185OooOo = diskVendor;
        c27341OooOoO.f95188OooOoO0 = list2;
        c27341OooOoO.f95190OooOoo0 = 2;
        r2.getClass();
        C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
        objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27343OooOoOO(diskVendor, true, r2, null), c27341OooOoO);
        r23 = r2;
        c27351Oooo0O0 = list2;
        if (objOooO0o2 == serializableOooooOO) {
            return serializableOooooOO;
        }
        List list52 = (List) objOooO0o2;
        r15 = c27351Oooo0O0;
        list = list52;
        r22 = r23;
        c27341OooOoO.f95186OooOo0o = r15;
        c27341OooOoO.f95185OooOo = list;
        c27341OooOoO.f95188OooOoO0 = null;
        c27341OooOoO.f95190OooOoo0 = 3;
        r22.getClass();
        C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27340OooOo0o(diskVendor, null, r22), c27341OooOoO);
        if (objOooO0o != serializableOooooOO) {
        }
        return serializableOooooOO;
    }

    public static final LinkedHashMap OooOO0o(C27351Oooo0O0 c27351Oooo0O0, List list) {
        String str;
        c27351Oooo0O0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Note note = (Note) it.next();
            String title = note.getTitle();
            if (linkedHashMap2.containsKey(title)) {
                Object obj = linkedHashMap2.get(title);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
                int iIntValue = ((Number) obj).intValue();
                linkedHashMap2.put(title, Integer.valueOf(iIntValue + 1));
                str = title + C18115b5.CONNECTOR + iIntValue + ".in";
            } else {
                linkedHashMap2.put(title, 1);
                str = title + ".in";
            }
            linkedHashMap.put(note.getId(), str);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOOO(C27351Oooo0O0 c27351Oooo0O0, String str, BackupInstance backupInstance, File file, BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27349Oooo00O c27349Oooo00O;
        String str2;
        if (abstractC32479OooO0OO instanceof C27349Oooo00O) {
            c27349Oooo00O = (C27349Oooo00O) abstractC32479OooO0OO;
            int i = c27349Oooo00O.f95231OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27349Oooo00O.f95231OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27349Oooo00O = new C27349Oooo00O(c27351Oooo0O0, abstractC32479OooO0OO);
            }
        }
        C27349Oooo00O c27349Oooo00O2 = c27349Oooo00O;
        Object objO0000 = c27349Oooo00O2.f95230OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27349Oooo00O2.f95231OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objO0000);
            if (str != null) {
                c27349Oooo00O2.f95225OooOo0o = c27351Oooo0O0;
                c27349Oooo00O2.f95224OooOo = backupInstance;
                c27349Oooo00O2.f95227OooOoO0 = file;
                c27349Oooo00O2.f95226OooOoO = diskVendor;
                c27349Oooo00O2.f95228OooOoOO = str;
                c27349Oooo00O2.f95231OooOooO = 1;
                objO0000 = c27351Oooo0O0.f95239OooO0Oo.o0000(str, c27349Oooo00O2);
                if (objO0000 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) c27349Oooo00O2.f95225OooOo0o;
            C32446OooOOOo.OooO0O0(objO0000);
            if (((Boolean) objO0000).booleanValue()) {
                return null;
            }
            return str2;
        }
        str = c27349Oooo00O2.f95228OooOoOO;
        diskVendor = c27349Oooo00O2.f95226OooOoO;
        file = c27349Oooo00O2.f95227OooOoO0;
        backupInstance = c27349Oooo00O2.f95224OooOo;
        c27351Oooo0O0 = (C27351Oooo0O0) c27349Oooo00O2.f95225OooOo0o;
        C32446OooOOOo.OooO0O0(objO0000);
        if (((Boolean) objO0000).booleanValue()) {
            return str;
        }
        if (backupInstance != null || file != null) {
            C28108OooOO0 c28108OooOO0 = c27351Oooo0O0.f95239OooO0Oo;
            c27349Oooo00O2.f95225OooOo0o = str;
            c27349Oooo00O2.f95224OooOo = null;
            c27349Oooo00O2.f95227OooOoO0 = null;
            c27349Oooo00O2.f95226OooOoO = null;
            c27349Oooo00O2.f95228OooOoOO = null;
            c27349Oooo00O2.f95231OooOooO = 2;
            objO0000 = c28108OooOO0.o00000oo(str, backupInstance, file, diskVendor, c27349Oooo00O2);
            if (objO0000 != enumC32485OooO00o) {
                str2 = str;
                if (((Boolean) objO0000).booleanValue()) {
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }

    public static final Object OooOOOO(C27351Oooo0O0 c27351Oooo0O0, BackupFile backupFile, BackupFile.DiskVendor diskVendor, OooOOO oooOOO) {
        return c27351Oooo0O0.f95243OooO0oo.OooO0Oo(backupFile, diskVendor, oooOOO);
    }

    public static String OooOo00(String str) {
        String strOooooOO = C33599OooOo0O.OooooOO(str, ".", str);
        String strOoooo00 = C33599OooOo0O.Ooooo00(str, ".");
        String strOooO0OO = C31183OooO00o.f111222OooO0O0.OooO0OO(strOooooOO, C18115b5.CONNECTOR);
        Pattern patternCompile = Pattern.compile("\\R");
        kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strOooO0OO).replaceAll(C18115b5.CONNECTOR);
        kotlin.jvm.internal.OooOOO0.OooO0o(strReplaceAll, "replaceAll(...)");
        return Oooo0oO.o0Oo0oo.OooO0Oo(strReplaceAll, ".", strOoooo00);
    }

    public final Object OooOOOo(BackupFile.DiskVendor diskVendor, Uri uri, AbstractC30978OooO abstractC30978OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOOO(this, diskVendor, uri, abstractC30978OooO, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(boolean z, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        boolean z2;
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO;
        boolean z3 = z;
        boolean z4 = true;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("BackupUseCase");
        int i = 0;
        c20358OooO00o.OooO0o0("clearExpiredBackupDirs, isColdStart: " + z3, new Object[0]);
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO2 = this.f95236OooO00o;
        File[] fileArrListFiles = abstractApplicationC26277OooOoOO2.getCacheDir().listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    String name = file.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                    if (C33595OooOOo.OooOoO0(name, "backup", false)) {
                        arrayList.add(file);
                    }
                }
            }
            for (File file2 : arrayList) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(file2);
                C32501OooO0oO.OooO0Oo(file2);
            }
        }
        for (BackupFile.DiskVendor diskVendor : oOo000Oo.OooOOO.OoooOO0(BackupFile.DiskVendor.values())) {
            File file3 = new File(abstractApplicationC26277OooOoOO2.getFilesDir(), "backup");
            if (file3.exists()) {
                String lowerCase = diskVendor.name().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
                File file4 = new File(file3, lowerCase);
                if (file4.exists()) {
                    File file5 = new File(file4, "to_upload_dir");
                    C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("clearExpiredBackupDirs, uploadDirs: ", file5.getAbsolutePath()), new Object[i]);
                    int i2 = z3 ? 600000 : 21600000;
                    File[] fileArrListFiles2 = file5.listFiles();
                    if (fileArrListFiles2 != null) {
                        ArrayList<File> arrayList2 = new ArrayList();
                        int length = fileArrListFiles2.length;
                        int i3 = i;
                        while (i3 < length) {
                            File file6 = fileArrListFiles2[i3];
                            boolean z5 = z4;
                            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO3 = abstractApplicationC26277OooOoOO2;
                            if (System.currentTimeMillis() - file6.lastModified() > i2) {
                                arrayList2.add(file6);
                            }
                            i3++;
                            z4 = z5;
                            abstractApplicationC26277OooOoOO2 = abstractApplicationC26277OooOoOO3;
                        }
                        boolean z6 = z4;
                        abstractApplicationC26277OooOoOO = abstractApplicationC26277OooOoOO2;
                        for (File file7 : arrayList2) {
                            if (!C31190OooO0oo.OooO0oo(file7)) {
                                Iterator it = C31190OooO0oo.OooOo00(file7, z6).iterator();
                                long length2 = 0;
                                while (it.hasNext()) {
                                    length2 += ((File) it.next()).length();
                                }
                                String strOooO0OO = C31430OooO00o.OooO0OO(length2);
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("BackupUseCase");
                                c20358OooO00o2.OooOO0O(C22237OooO0o0.OooO00o("clearExpiredBackupDirs, failed to delete file: ", file7.getAbsolutePath(), ", toDeleteFileSize: ", strOooO0OO), new Object[0]);
                            }
                            z6 = true;
                        }
                    } else {
                        abstractApplicationC26277OooOoOO = abstractApplicationC26277OooOoOO2;
                    }
                    File file8 = new File(file4, "to_download_dir");
                    C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("clearExpiredBackupDirs, downloadDir: ", file8.getAbsolutePath()), new Object[0]);
                    int i4 = z3 ? 600000 : 3600000;
                    File[] fileArrListFiles3 = file8.listFiles();
                    if (fileArrListFiles3 != null) {
                        ArrayList<File> arrayList3 = new ArrayList();
                        int length3 = fileArrListFiles3.length;
                        int i5 = 0;
                        while (i5 < length3) {
                            File file9 = fileArrListFiles3[i5];
                            File[] fileArr = fileArrListFiles3;
                            if (System.currentTimeMillis() - file9.lastModified() > i4) {
                                arrayList3.add(file9);
                            }
                            i5++;
                            fileArrListFiles3 = fileArr;
                        }
                        z2 = true;
                        for (File file10 : arrayList3) {
                            if (!C31190OooO0oo.OooO0oo(file10)) {
                                Iterator it2 = C31190OooO0oo.OooOo00(file10, true).iterator();
                                long length4 = 0;
                                while (it2.hasNext()) {
                                    length4 += ((File) it2.next()).length();
                                }
                                String strOooO0OO2 = C31430OooO00o.OooO0OO(length4);
                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o3.OooOOO0("BackupUseCase");
                                c20358OooO00o3.OooOO0O(C22237OooO0o0.OooO00o("clearExpiredBackupDirs, failed to delete file: ", file10.getAbsolutePath(), ", toDeleteFileSize: ", strOooO0OO2), new Object[0]);
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    i = 0;
                } else {
                    z2 = z4;
                    abstractApplicationC26277OooOoOO = abstractApplicationC26277OooOoOO2;
                }
            }
            z4 = z2;
            abstractApplicationC26277OooOoOO2 = abstractApplicationC26277OooOoOO;
            z3 = z;
        }
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27345OooOoo0(this, null), abstractC32476OooO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o != enumC32485OooO00o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01a1 -> B:19:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOoo(List list, List list2, File file, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Exception {
        C27338OooOo0 c27338OooOo0;
        BackupFile.DiskVendor diskVendor;
        C27351Oooo0O0 c27351Oooo0O0;
        C27338OooOo0 c27338OooOo02;
        oO0O000o.OooO00o oooO00o;
        int i;
        File file2;
        Iterator it;
        List list3;
        List list4;
        NotePlaceHolder notePlaceHolder;
        List list5;
        C27351Oooo0O0 c27351Oooo0O02;
        Exception exc;
        Iterator it2;
        NotePlaceHolder notePlaceHolder2;
        oO0O000o.OooO00o oooO00o2;
        C27351Oooo0O0 c27351Oooo0O03;
        File file3;
        List list6;
        String str;
        Iterator it3;
        int i2;
        C27449o00O0OoO c27449o00O0OoO;
        String[] strArr;
        C27351Oooo0O0 c27351Oooo0O04;
        NotePlaceHolder notePlaceHolder3;
        File file4;
        if (abstractC32479OooO0OO instanceof C27338OooOo0) {
            c27338OooOo0 = (C27338OooOo0) abstractC32479OooO0OO;
            int i3 = c27338OooOo0.f95167Oooo00o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c27338OooOo0.f95167Oooo00o = i3 - Integer.MIN_VALUE;
            } else {
                c27338OooOo0 = new C27338OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27338OooOo0.f95165Oooo000;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c27338OooOo0.f95167Oooo00o;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            BackupFile backupFile = (BackupFile) oOo000Oo.OooOo.Oooo(list2);
            if (backupFile == null || (diskVendor = backupFile.getDiskVendor()) == null) {
                diskVendor = BackupFile.DiskVendor.None;
            }
            C32443OooOOO c32443OooOOO = (file == null || !file.exists()) ? new C32443OooOOO(OooOo0(diskVendor), Boolean.TRUE) : new C32443OooOOO(file, Boolean.FALSE);
            final File file5 = (File) c32443OooOOO.f116638OooOo0o;
            final boolean zBooleanValue = ((Boolean) c32443OooOOO.f116637OooOo).booleanValue();
            c27351Oooo0O0 = this;
            c27338OooOo02 = c27338OooOo0;
            oooO00o = new oO0O000o.OooO00o() { // from class: o0OOo0o.OooO0o
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    if (zBooleanValue) {
                        C31190OooO0oo.OooO0oo(file5);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            };
            i = 0;
            file2 = file5;
            it = list.iterator();
            list3 = list;
            list4 = list2;
            if (it.hasNext()) {
            }
        } else {
            if (i4 == 1) {
                i2 = c27338OooOo0.f95164OooOooo;
                str = c27338OooOo0.f95163OooOooO;
                notePlaceHolder = c27338OooOo0.f95161OooOoo;
                Iterator it4 = c27338OooOo0.f95162OooOoo0;
                oooO00o = (oO0O000o.OooO00o) c27338OooOo0.f95160OooOoOO;
                File file6 = (File) c27338OooOo0.f95158OooOoO;
                list6 = (List) c27338OooOo0.f95159OooOoO0;
                List list7 = (List) c27338OooOo0.f95156OooOo;
                C27351Oooo0O0 c27351Oooo0O05 = c27338OooOo0.f95157OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    file3 = file6;
                    list5 = list7;
                    it3 = it4;
                    c27351Oooo0O02 = c27351Oooo0O05;
                    c27449o00O0OoO = c27351Oooo0O02.f95241OooO0o0;
                    strArr = new String[]{notePlaceHolder.getId()};
                    c27338OooOo0.f95157OooOo0o = c27351Oooo0O02;
                    c27338OooOo0.f95156OooOo = list5;
                    c27338OooOo0.f95159OooOoO0 = list6;
                    c27338OooOo0.f95158OooOoO = file3;
                    c27338OooOo0.f95160OooOoOO = oooO00o;
                    c27338OooOo0.f95162OooOoo0 = it3;
                    c27338OooOo0.f95161OooOoo = notePlaceHolder;
                    c27338OooOo0.f95163OooOooO = str;
                    c27338OooOo0.f95164OooOooo = i2;
                    c27338OooOo0.f95167Oooo00o = 2;
                    if (c27449o00O0OoO.Oooo0oO(strArr, c27338OooOo0) != obj2) {
                    }
                } catch (Exception e) {
                    e = e;
                    list5 = list7;
                    c27351Oooo0O02 = c27351Oooo0O05;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("BackupUseCase");
                    c20358OooO00o.OooO0Oo(e, "createNotesByPlaceholder error. Recover note failed.", new Object[0]);
                    exc = e;
                    it2 = list5.iterator();
                    notePlaceHolder2 = notePlaceHolder;
                    oooO00o2 = oooO00o;
                    c27351Oooo0O03 = c27351Oooo0O02;
                    while (it2.hasNext()) {
                    }
                    oooO00o2.invoke();
                    throw exc;
                }
                return obj2;
            }
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) c27338OooOo0.f95160OooOoOO;
                exc = (Exception) c27338OooOo0.f95158OooOoO;
                notePlaceHolder2 = (NotePlaceHolder) c27338OooOo0.f95159OooOoO0;
                oooO00o2 = (oO0O000o.OooO00o) c27338OooOo0.f95156OooOo;
                c27351Oooo0O03 = c27338OooOo0.f95157OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                while (it2.hasNext()) {
                    InterfaceC27314OooOooO interfaceC27314OooOooO = c27351Oooo0O03.f95235OooO;
                    String id = notePlaceHolder2.getId();
                    c27338OooOo0.f95157OooOo0o = c27351Oooo0O03;
                    c27338OooOo0.f95156OooOo = oooO00o2;
                    c27338OooOo0.f95159OooOoO0 = notePlaceHolder2;
                    c27338OooOo0.f95158OooOoO = exc;
                    c27338OooOo0.f95160OooOoOO = it2;
                    c27338OooOo0.f95162OooOoo0 = null;
                    c27338OooOo0.f95161OooOoo = null;
                    c27338OooOo0.f95163OooOooO = null;
                    c27338OooOo0.f95167Oooo00o = 3;
                    if (interfaceC27314OooOooO.OooO0oO(1, id, c27338OooOo0) == obj2) {
                        return obj2;
                    }
                }
                oooO00o2.invoke();
                throw exc;
            }
            int i5 = c27338OooOo0.f95164OooOooo;
            str = c27338OooOo0.f95163OooOooO;
            notePlaceHolder = c27338OooOo0.f95161OooOoo;
            Iterator it5 = c27338OooOo0.f95162OooOoo0;
            oooO00o = (oO0O000o.OooO00o) c27338OooOo0.f95160OooOoOO;
            file3 = (File) c27338OooOo0.f95158OooOoO;
            List list8 = (List) c27338OooOo0.f95159OooOoO0;
            list5 = (List) c27338OooOo0.f95156OooOo;
            c27351Oooo0O02 = c27338OooOo0.f95157OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                list3 = list5;
                i = i5;
                list4 = list8;
                NotePlaceHolder notePlaceHolder4 = notePlaceHolder;
                c27351Oooo0O0 = c27351Oooo0O02;
                c27338OooOo02 = c27338OooOo0;
                file2 = file3;
                if (str != null) {
                    try {
                        if (str.length() != 0) {
                            File file7 = new File(str);
                            if (file7.exists()) {
                                file7.delete();
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        list5 = list3;
                        c27338OooOo0 = c27338OooOo02;
                        c27351Oooo0O02 = c27351Oooo0O0;
                        notePlaceHolder = notePlaceHolder4;
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("BackupUseCase");
                        c20358OooO00o2.OooO0Oo(e, "createNotesByPlaceholder error. Recover note failed.", new Object[0]);
                        exc = e;
                        it2 = list5.iterator();
                        notePlaceHolder2 = notePlaceHolder;
                        oooO00o2 = oooO00o;
                        c27351Oooo0O03 = c27351Oooo0O02;
                        while (it2.hasNext()) {
                        }
                        oooO00o2.invoke();
                        throw exc;
                    }
                }
                it = it5;
            } catch (Exception e3) {
                e = e3;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("BackupUseCase");
                c20358OooO00o22.OooO0Oo(e, "createNotesByPlaceholder error. Recover note failed.", new Object[0]);
                exc = e;
                it2 = list5.iterator();
                notePlaceHolder2 = notePlaceHolder;
                oooO00o2 = oooO00o;
                c27351Oooo0O03 = c27351Oooo0O02;
                while (it2.hasNext()) {
                }
                oooO00o2.invoke();
                throw exc;
            }
            if (it.hasNext()) {
                Object next = it.next();
                int i6 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                NotePlaceHolder notePlaceHolder5 = (NotePlaceHolder) next;
                String filePath = notePlaceHolder5.getFilePath();
                try {
                    try {
                        C34406OooO00o.f123390OooO00o.OooO00o("createNotesByPlaceholder, " + ((BackupFile) list4.get(i)).getDiskVendor(), new Object[0]);
                        BackupFile backupFile2 = (BackupFile) list4.get(i);
                        c27338OooOo02.f95157OooOo0o = c27351Oooo0O0;
                        c27338OooOo02.f95156OooOo = list3;
                        c27338OooOo02.f95159OooOoO0 = list4;
                        c27338OooOo02.f95158OooOoO = file2;
                        c27338OooOo02.f95160OooOoOO = oooO00o;
                        c27338OooOo02.f95162OooOoo0 = it;
                        c27338OooOo02.f95161OooOoo = notePlaceHolder5;
                        c27338OooOo02.f95163OooOooO = filePath;
                        c27338OooOo02.f95164OooOooo = i6;
                        c27338OooOo02.f95167Oooo00o = 1;
                        c27351Oooo0O0.getClass();
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOo00(backupFile2, notePlaceHolder3, file4, c27351Oooo0O04, null), c27338OooOo02);
                        if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                            objOooO0o = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO0o != obj2) {
                            list6 = list4;
                            list5 = list3;
                            it3 = it;
                            c27338OooOo0 = c27338OooOo02;
                            i2 = i6;
                            str = filePath;
                            notePlaceHolder = notePlaceHolder3;
                            file3 = file4;
                            c27351Oooo0O02 = c27351Oooo0O04;
                            c27449o00O0OoO = c27351Oooo0O02.f95241OooO0o0;
                            strArr = new String[]{notePlaceHolder.getId()};
                            c27338OooOo0.f95157OooOo0o = c27351Oooo0O02;
                            c27338OooOo0.f95156OooOo = list5;
                            c27338OooOo0.f95159OooOoO0 = list6;
                            c27338OooOo0.f95158OooOoO = file3;
                            c27338OooOo0.f95160OooOoOO = oooO00o;
                            c27338OooOo0.f95162OooOoo0 = it3;
                            c27338OooOo0.f95161OooOoo = notePlaceHolder;
                            c27338OooOo0.f95163OooOooO = str;
                            c27338OooOo0.f95164OooOooo = i2;
                            c27338OooOo0.f95167Oooo00o = 2;
                            if (c27449o00O0OoO.Oooo0oO(strArr, c27338OooOo0) != obj2) {
                                list3 = list5;
                                i = i2;
                                list4 = list6;
                                it5 = it3;
                                NotePlaceHolder notePlaceHolder42 = notePlaceHolder;
                                c27351Oooo0O0 = c27351Oooo0O02;
                                c27338OooOo02 = c27338OooOo0;
                                file2 = file3;
                                if (str != null) {
                                }
                                it = it5;
                                if (it.hasNext()) {
                                    oooO00o.invoke();
                                    return C32460OooOooO.f116667OooO00o;
                                }
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        list5 = list3;
                        c27338OooOo0 = c27338OooOo02;
                        notePlaceHolder = notePlaceHolder3;
                        c27351Oooo0O02 = c27351Oooo0O04;
                        C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o222.OooOOO0("BackupUseCase");
                        c20358OooO00o222.OooO0Oo(e, "createNotesByPlaceholder error. Recover note failed.", new Object[0]);
                        exc = e;
                        it2 = list5.iterator();
                        notePlaceHolder2 = notePlaceHolder;
                        oooO00o2 = oooO00o;
                        c27351Oooo0O03 = c27351Oooo0O02;
                        while (it2.hasNext()) {
                        }
                        oooO00o2.invoke();
                        throw exc;
                    }
                    file4 = file2;
                    c27351Oooo0O04 = c27351Oooo0O0;
                    notePlaceHolder3 = notePlaceHolder5;
                } catch (Exception e5) {
                    e = e5;
                    c27351Oooo0O04 = c27351Oooo0O0;
                    notePlaceHolder3 = notePlaceHolder5;
                }
                return obj2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27347OooOooo c27347OooOooo;
        if (abstractC32479OooO0OO instanceof C27347OooOooo) {
            c27347OooOooo = (C27347OooOooo) abstractC32479OooO0OO;
            int i = c27347OooOooo.f95212OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27347OooOooo.f95212OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27347OooOooo = new C27347OooOooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27347OooOooo.f95211OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27347OooOooo.f95212OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String strOooO00o = C24761OooO.OooO00o("toString(...)");
                BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.None;
                String name = new File(str).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(new BackupFile(strOooO00o, diskVendor, name, str, false, System.currentTimeMillis(), 0L, C34436OooOoOO.f123455OooOo0o, null));
                c27347OooOooo.f95212OooOoO0 = 1;
                if (OooOoO0(listOooO0oO, c27347OooOooo) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public final File OooOo0(BackupFile.DiskVendor diskVendor) {
        File file = new File(this.f95236OooO00o.getFilesDir(), "backup");
        C31190OooO0oo.OooO0o(file);
        String lowerCase = diskVendor.name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        File file2 = new File(file, lowerCase);
        C31190OooO0oo.OooO0o(file2);
        File file3 = new File(file2, "to_download_dir");
        C31190OooO0oo.OooO0o(file3);
        File file4 = new File(file3, String.valueOf(System.currentTimeMillis()));
        C31190OooO0oo.OooO0o(file4);
        return file4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum OooOo0O(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOo oooOo;
        if (abstractC32479OooO0OO instanceof OooOo) {
            oooOo = (OooOo) abstractC32479OooO0OO;
            int i = oooOo.f95155OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f95155OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = oooOo.f95154OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo.f95155OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO00o(this.f95236OooO00o).getData();
            oooOo.f95155OooOoO0 = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(data, oooOo);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        Integer num = (Integer) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(C27205OooO0OO.f95007OooO0o0);
        BackupFile.DiskVendor diskVendor = BackupFile.DiskVendor.None;
        int iOrdinal = diskVendor.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            return diskVendor;
        }
        BackupFile.DiskVendor diskVendor2 = BackupFile.DiskVendor.Baidu;
        int iOrdinal2 = diskVendor2.ordinal();
        if (num != null && num.intValue() == iOrdinal2) {
            return diskVendor2;
        }
        BackupFile.DiskVendor diskVendor3 = BackupFile.DiskVendor.GoogleDrive;
        int iOrdinal3 = diskVendor3.ordinal();
        if (num != null && num.intValue() == iOrdinal3) {
            return diskVendor3;
        }
        BackupFile.DiskVendor diskVendor4 = BackupFile.DiskVendor.Local;
        int iOrdinal4 = diskVendor4.ordinal();
        if (num != null && num.intValue() == iOrdinal4) {
            return diskVendor4;
        }
        return null;
    }

    public final Object OooOo0o(List list, String str, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27344OooOoo(list, this, str, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooOoO(BackupFile.DiskVendor diskVendor, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new Oooo0(diskVendor, null, this), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OooOoO0(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new Oooo000(list, this, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
