package com.orion.notein.domain.workmanager;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.orion.notein.domain.models.cache.HandWritingTextCacheWithoutElements;
import com.orion.notein.domain.models.cache.PageGridModificationRecord;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageGrid;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.penkit.models.DrawRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oo0.C24684Oooo;
import o0OOO0OO.C27009OooO0oO;
import o0OOO0OO.C27015OooOOoo;
import o0OOO0OO.OooOOO;
import o0OOo0Oo.InterfaceC27320Oooo0OO;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27545o00o0oo0;
import o0OOo0o.C27597o00ooo00;
import o0OOo0o.o00000O;
import o0Oo00o0.C28031OooO00o;
import o0Oo00o0.C28032OooO0O0;
import o0Oo00o0.C28033OooO0OO;
import o0Oo00o0.C28034OooO0Oo;
import o0oo000O.C31192OooOOOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33644OoooO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/domain/workmanager/PageTextCacheUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lo0OOo0o/o00000O;", "getRemoteConfigUseCase", "Lo0OOo0Oo/Oooo0oO;", "strokeRepo", "Lo0OOo0Oo/Oooo0OO;", "pdfTextRepo", "Lo0OOo0o/o00o0oo0;", "textUseCase", "Lo0OOo0o/o00ooo00;", "vipFeatureUseCase", "Lo0OOo0o/o00O0OoO;", "noteUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lo0OOo0o/o00000O;Lo0OOo0Oo/Oooo0oO;Lo0OOo0Oo/Oooo0OO;Lo0OOo0o/o00o0oo0;Lo0OOo0o/o00ooo00;Lo0OOo0o/o00O0OoO;)V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageTextCacheUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final o00000O f70410OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C27597o00ooo00 f70411Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final InterfaceC27323Oooo0oO f70412Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final InterfaceC27320Oooo0OO f70413Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C27545o00o0oo0 f70414Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C27449o00O0OoO f70415Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public OooO00o f70416Oooo0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f70417OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f70418OooO0O0 = 1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f70419OooO0OO = System.currentTimeMillis();

        public OooO00o(long j) {
            this.f70417OooO00o = j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageTextCacheUpdateWorker(Context appContext, WorkerParameters workerParams, o00000O getRemoteConfigUseCase, InterfaceC27323Oooo0oO strokeRepo, InterfaceC27320Oooo0OO pdfTextRepo, C27545o00o0oo0 textUseCase, C27597o00ooo00 vipFeatureUseCase, C27449o00O0OoO noteUseCase) {
        super(appContext, workerParams);
        OooOOO0.OooO0oO(appContext, "appContext");
        OooOOO0.OooO0oO(workerParams, "workerParams");
        OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        OooOOO0.OooO0oO(strokeRepo, "strokeRepo");
        OooOOO0.OooO0oO(pdfTextRepo, "pdfTextRepo");
        OooOOO0.OooO0oO(textUseCase, "textUseCase");
        OooOOO0.OooO0oO(vipFeatureUseCase, "vipFeatureUseCase");
        OooOOO0.OooO0oO(noteUseCase, "noteUseCase");
        this.f70410OooOooo = getRemoteConfigUseCase;
        this.f70412Oooo000 = strokeRepo;
        this.f70413Oooo00O = pdfTextRepo;
        this.f70414Oooo00o = textUseCase;
        this.f70411Oooo0 = vipFeatureUseCase;
        this.f70415Oooo0O0 = noteUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0104, code lost:
    
        if (r0 == r3) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157 A[LOOP:2: B:30:0x0151->B:32:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020a A[PHI: r0 r1 r4 r6 r8 r10 r11 r12 r13
      0x020a: PHI (r0v42 java.lang.Object) = (r0v1 java.lang.Object), (r0v53 java.lang.Object) binds: [B:15:0x0062, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r1v12 o0Oo00o0.OooO00o) = (r1v2 o0Oo00o0.OooO00o), (r1v13 o0Oo00o0.OooO00o) binds: [B:15:0x0062, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r4v25 com.orion.notein.domain.models.cache.HandWritingTextCacheWithoutElements) = 
      (r4v11 com.orion.notein.domain.models.cache.HandWritingTextCacheWithoutElements)
      (r4v31 com.orion.notein.domain.models.cache.HandWritingTextCacheWithoutElements)
     binds: [B:15:0x0062, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r6v10 com.orion.notein.domain.models.page.Page) = (r6v0 com.orion.notein.domain.models.page.Page), (r6v12 com.orion.notein.domain.models.page.Page) binds: [B:15:0x0062, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r8v15 long) = (r8v9 long), (r8v19 long) binds: [B:15:0x0062, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r10v15 com.orion.notein.domain.models.page.Page) = (r10v9 com.orion.notein.domain.models.page.Page), (r10v16 com.orion.notein.domain.models.page.Page) binds: [B:15:0x0062, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r11v14 com.orion.notein.domain.models.page.PageGrid) = (r11v11 com.orion.notein.domain.models.page.PageGrid), (r11v15 com.orion.notein.domain.models.page.PageGrid) binds: [B:15:0x0062, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r12v13 java.util.Iterator) = (r12v9 java.util.Iterator), (r12v14 java.util.Iterator) binds: [B:15:0x0062, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r13v6 com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker) = 
      (r13v4 com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker)
      (r13v7 com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker)
     binds: [B:15:0x0062, B:57:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x02b7 -> B:78:0x0266). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x02f5 -> B:113:0x02f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0104 -> B:27:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0113 -> B:29:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01e0 -> B:114:0x02f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28031OooO00o c28031OooO00o;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker;
        Iterator it;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker2;
        Collection collection;
        Iterator it2;
        Page page;
        ArrayList arrayListOooO0OO;
        Iterator it3;
        Page page2;
        PageGrid pageGrid;
        HandWritingTextCacheWithoutElements handWritingTextCacheWithoutElements;
        Iterator it4;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker3;
        Page page3;
        PageGrid pageGrid2;
        long lastModificationTime;
        Iterator it5;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker4;
        boolean z;
        List list2;
        PageGrid pageGrid3;
        OooO00o oooO00o;
        C28031OooO00o c28031OooO00o2;
        boolean z2;
        Iterator it6;
        Object objOooO0O0;
        if (abstractC32479OooO0OO instanceof C28031OooO00o) {
            c28031OooO00o = (C28031OooO00o) abstractC32479OooO0OO;
            int i = c28031OooO00o.f99382OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28031OooO00o.f99382OooOooo = i - Integer.MIN_VALUE;
                pageTextCacheUpdateWorker = this;
            } else {
                pageTextCacheUpdateWorker = this;
                c28031OooO00o = new C28031OooO00o(pageTextCacheUpdateWorker, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c28031OooO00o.f99379OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        boolean z3 = true;
        Page page4 = null;
        switch (c28031OooO00o.f99382OooOooo) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0oO);
                ArrayList arrayList = new ArrayList();
                it = list.iterator();
                pageTextCacheUpdateWorker2 = pageTextCacheUpdateWorker;
                collection = arrayList;
                if (it.hasNext()) {
                    page = (Page) it.next();
                    if (page.getUnbounded()) {
                        C27449o00O0OoO c27449o00O0OoO = pageTextCacheUpdateWorker2.f70415Oooo0O0;
                        String id = page.getId();
                        String noteId = page.getNoteId();
                        c28031OooO00o.f99375OooOo0o = pageTextCacheUpdateWorker2;
                        c28031OooO00o.f99374OooOo = collection;
                        c28031OooO00o.f99377OooOoO0 = it;
                        c28031OooO00o.f99376OooOoO = page;
                        c28031OooO00o.f99382OooOooo = 1;
                        C27015OooOOoo c27015OooOOoo = c27449o00O0OoO.f96039OooO0o.f94064OooO00o;
                        c27015OooOOoo.getClass();
                        objOooO0oO = c27015OooOOoo.f94033OooO00o.OooO0oO(noteId, new OooOOO(new C27009OooO0oO(id, null), null));
                        break;
                    } else {
                        float width = page.getPaperSpec().getWidth();
                        float height = page.getPaperSpec().getHeight();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new PageGrid(page.getId(), new RectF(0.0f, 0.0f, width, height), new Point(0, 0)));
                        arrayListOooO0OO = arrayList2;
                        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooO0OO, 10));
                        it3 = arrayListOooO0OO.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(new C32443OooOOO((PageGrid) it3.next(), page));
                        }
                        C34431OooOo0.OooOo0o(collection, arrayList3);
                        if (it.hasNext()) {
                            it2 = ((List) collection).iterator();
                            if (!it2.hasNext()) {
                                C32443OooOOO c32443OooOOO = (C32443OooOOO) it2.next();
                                pageGrid = (PageGrid) c32443OooOOO.f116638OooOo0o;
                                page2 = (Page) c32443OooOOO.f116637OooOo;
                                if (pageTextCacheUpdateWorker2.f66671OooOoO0) {
                                    return C32460OooOooO.f116667OooO00o;
                                }
                                C27545o00o0oo0 c27545o00o0oo0 = pageTextCacheUpdateWorker2.f70414Oooo00o;
                                c28031OooO00o.f99375OooOo0o = pageTextCacheUpdateWorker2;
                                c28031OooO00o.f99374OooOo = it2;
                                c28031OooO00o.f99377OooOoO0 = pageGrid;
                                c28031OooO00o.f99376OooOoO = page2;
                                c28031OooO00o.f99378OooOoOO = page4;
                                c28031OooO00o.f99382OooOooo = 2;
                                objOooO0oO = c27545o00o0oo0.f96583OooO0oo.OooO0OO(pageGrid, c28031OooO00o);
                                if (objOooO0oO != enumC32485OooO00o) {
                                    HandWritingTextCacheWithoutElements handWritingTextCacheWithoutElements2 = (HandWritingTextCacheWithoutElements) objOooO0oO;
                                    C27545o00o0oo0 c27545o00o0oo02 = pageTextCacheUpdateWorker2.f70414Oooo00o;
                                    c28031OooO00o.f99375OooOo0o = pageTextCacheUpdateWorker2;
                                    c28031OooO00o.f99374OooOo = it2;
                                    c28031OooO00o.f99377OooOoO0 = pageGrid;
                                    c28031OooO00o.f99376OooOoO = page2;
                                    c28031OooO00o.f99378OooOoOO = handWritingTextCacheWithoutElements2;
                                    c28031OooO00o.f99382OooOooo = 3;
                                    objOooO0O0 = c27545o00o0oo02.f96584OooOO0.OooO0O0(pageGrid, c28031OooO00o);
                                    if (objOooO0O0 != enumC32485OooO00o) {
                                        it4 = it2;
                                        pageTextCacheUpdateWorker3 = pageTextCacheUpdateWorker2;
                                        page3 = page2;
                                        handWritingTextCacheWithoutElements = handWritingTextCacheWithoutElements2;
                                        objOooO0oO = objOooO0O0;
                                        pageGrid2 = pageGrid;
                                        PageGridModificationRecord pageGridModificationRecord = (PageGridModificationRecord) objOooO0oO;
                                        lastModificationTime = pageGridModificationRecord == null ? pageGridModificationRecord.getLastModificationTime() : 0L;
                                        if (handWritingTextCacheWithoutElements != null || handWritingTextCacheWithoutElements.getCreationTime() < lastModificationTime) {
                                            InterfaceC27323Oooo0oO interfaceC27323Oooo0oO = pageTextCacheUpdateWorker3.f70412Oooo000;
                                            String pageId = pageGrid2.getPageId();
                                            String noteId2 = page3.getNoteId();
                                            RectF bounds = pageGrid2.getBounds();
                                            c28031OooO00o.f99375OooOo0o = pageTextCacheUpdateWorker3;
                                            c28031OooO00o.f99374OooOo = it4;
                                            c28031OooO00o.f99377OooOoO0 = pageGrid2;
                                            c28031OooO00o.f99376OooOoO = page3;
                                            c28031OooO00o.f99378OooOoOO = handWritingTextCacheWithoutElements;
                                            c28031OooO00o.f99380OooOoo0 = lastModificationTime;
                                            c28031OooO00o.f99382OooOooo = 4;
                                            objOooO0oO = interfaceC27323Oooo0oO.OooOO0(pageId, noteId2, bounds, c28031OooO00o);
                                            if (objOooO0oO != enumC32485OooO00o) {
                                                List list3 = (List) objOooO0oO;
                                                ArrayList arrayList4 = new ArrayList();
                                                it6 = list3.iterator();
                                                while (it6.hasNext()) {
                                                    DrawRecord record = ((Stroke) it6.next()).getRecord();
                                                    if (record != null) {
                                                        arrayList4.add(record);
                                                    }
                                                }
                                                int trajectoryHash = DrawRecord.INSTANCE.getTrajectoryHash(arrayList4);
                                                if (handWritingTextCacheWithoutElements == null && trajectoryHash == handWritingTextCacheWithoutElements.getTrajectoryHash()) {
                                                    C27545o00o0oo0 c27545o00o0oo03 = pageTextCacheUpdateWorker3.f70414Oooo00o;
                                                    c28031OooO00o.f99375OooOo0o = pageTextCacheUpdateWorker3;
                                                    c28031OooO00o.f99374OooOo = it4;
                                                    c28031OooO00o.f99377OooOoO0 = page4;
                                                    c28031OooO00o.f99376OooOoO = page4;
                                                    c28031OooO00o.f99378OooOoOO = page4;
                                                    c28031OooO00o.f99382OooOooo = 5;
                                                    Object objOooO0o0 = c27545o00o0oo03.f96583OooO0oo.OooO0o0(pageGrid2, lastModificationTime, c28031OooO00o);
                                                    if (objOooO0o0 != EnumC32485OooO00o.f116726OooOo0o) {
                                                        objOooO0o0 = C32460OooOooO.f116667OooO00o;
                                                    }
                                                    if (objOooO0o0 != enumC32485OooO00o) {
                                                        it5 = it4;
                                                        pageTextCacheUpdateWorker4 = pageTextCacheUpdateWorker3;
                                                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                                        z = true;
                                                        it2 = it5;
                                                        pageTextCacheUpdateWorker2 = pageTextCacheUpdateWorker4;
                                                        z3 = z;
                                                        page4 = null;
                                                        if (!it2.hasNext()) {
                                                        }
                                                    }
                                                } else {
                                                    list2 = list3;
                                                    pageGrid3 = pageGrid2;
                                                    pageTextCacheUpdateWorker4 = pageTextCacheUpdateWorker3;
                                                    oooO00o = pageTextCacheUpdateWorker4.f70416Oooo0OO;
                                                    if (oooO00o != null) {
                                                        synchronized (oooO00o) {
                                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                                            c28031OooO00o2 = c28031OooO00o;
                                                            int i2 = (int) ((jCurrentTimeMillis - oooO00o.f70419OooO0OO) / oooO00o.f70417OooO00o);
                                                            if (i2 > 0) {
                                                                z = true;
                                                                oooO00o.f70418OooO0O0 = Math.min(1, oooO00o.f70418OooO0O0 + i2);
                                                                oooO00o.f70419OooO0OO = jCurrentTimeMillis;
                                                            } else {
                                                                z = true;
                                                            }
                                                            int i3 = oooO00o.f70418OooO0O0;
                                                            if (i3 > 0) {
                                                                oooO00o.f70418OooO0O0 = i3 - 1;
                                                                z2 = z;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                        }
                                                        if (z2) {
                                                            C27545o00o0oo0 c27545o00o0oo04 = pageTextCacheUpdateWorker4.f70414Oooo00o;
                                                            ArrayList arrayList5 = new ArrayList();
                                                            Iterator it7 = list2.iterator();
                                                            while (it7.hasNext()) {
                                                                DrawRecord record2 = ((Stroke) it7.next()).getRecord();
                                                                if (record2 != null) {
                                                                    arrayList5.add(record2);
                                                                }
                                                            }
                                                            Point index = pageGrid3.getIndex();
                                                            c28031OooO00o2.f99375OooOo0o = pageTextCacheUpdateWorker4;
                                                            c28031OooO00o2.f99374OooOo = it4;
                                                            c28031OooO00o2.f99377OooOoO0 = null;
                                                            c28031OooO00o2.f99376OooOoO = null;
                                                            c28031OooO00o2.f99378OooOoOO = null;
                                                            c28031OooO00o2.f99382OooOooo = 7;
                                                            if (c27545o00o0oo04.OooOO0(page3, arrayList5, index, c28031OooO00o2) != enumC32485OooO00o) {
                                                                c28031OooO00o = c28031OooO00o2;
                                                                it5 = it4;
                                                                it2 = it5;
                                                                pageTextCacheUpdateWorker2 = pageTextCacheUpdateWorker4;
                                                                z3 = z;
                                                                page4 = null;
                                                                if (!it2.hasNext()) {
                                                                    return C32460OooOooO.f116667OooO00o;
                                                                }
                                                            }
                                                        } else {
                                                            c28031OooO00o2.f99375OooOo0o = pageTextCacheUpdateWorker4;
                                                            c28031OooO00o2.f99374OooOo = it4;
                                                            c28031OooO00o2.f99377OooOoO0 = pageGrid3;
                                                            c28031OooO00o2.f99376OooOoO = page3;
                                                            c28031OooO00o2.f99378OooOoOO = list2;
                                                            c28031OooO00o2.f99382OooOooo = 6;
                                                            if (C33644OoooO0.OooO00o(500L, c28031OooO00o2) != enumC32485OooO00o) {
                                                                c28031OooO00o = c28031OooO00o2;
                                                                if (!pageTextCacheUpdateWorker4.f66671OooOoO0) {
                                                                    return C32460OooOooO.f116667OooO00o;
                                                                }
                                                                oooO00o = pageTextCacheUpdateWorker4.f70416Oooo0OO;
                                                                if (oooO00o != null) {
                                                                    OooOOO0.OooOOOO("leakyBucket");
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            z = z3;
                                            it2 = it4;
                                            pageTextCacheUpdateWorker2 = pageTextCacheUpdateWorker3;
                                            z3 = z;
                                            page4 = null;
                                            if (!it2.hasNext()) {
                                            }
                                        }
                                    }
                                }
                                return enumC32485OooO00o;
                            }
                        }
                    }
                }
                break;
            case 1:
                page = c28031OooO00o.f99376OooOoO;
                it = (Iterator) c28031OooO00o.f99377OooOoO0;
                collection = (Collection) c28031OooO00o.f99374OooOo;
                pageTextCacheUpdateWorker2 = c28031OooO00o.f99375OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                arrayListOooO0OO = C31192OooOOOo.OooO0OO(page.getId(), (RectF) objOooO0oO);
                ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooO0OO, 10));
                it3 = arrayListOooO0OO.iterator();
                while (it3.hasNext()) {
                }
                C34431OooOo0.OooOo0o(collection, arrayList32);
                if (it.hasNext()) {
                }
                break;
            case 2:
                page2 = c28031OooO00o.f99376OooOoO;
                pageGrid = (PageGrid) c28031OooO00o.f99377OooOoO0;
                it2 = (Iterator) c28031OooO00o.f99374OooOo;
                pageTextCacheUpdateWorker2 = c28031OooO00o.f99375OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                HandWritingTextCacheWithoutElements handWritingTextCacheWithoutElements22 = (HandWritingTextCacheWithoutElements) objOooO0oO;
                C27545o00o0oo0 c27545o00o0oo022 = pageTextCacheUpdateWorker2.f70414Oooo00o;
                c28031OooO00o.f99375OooOo0o = pageTextCacheUpdateWorker2;
                c28031OooO00o.f99374OooOo = it2;
                c28031OooO00o.f99377OooOoO0 = pageGrid;
                c28031OooO00o.f99376OooOoO = page2;
                c28031OooO00o.f99378OooOoOO = handWritingTextCacheWithoutElements22;
                c28031OooO00o.f99382OooOooo = 3;
                objOooO0O0 = c27545o00o0oo022.f96584OooOO0.OooO0O0(pageGrid, c28031OooO00o);
                if (objOooO0O0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                handWritingTextCacheWithoutElements = (HandWritingTextCacheWithoutElements) c28031OooO00o.f99378OooOoOO;
                Page page5 = c28031OooO00o.f99376OooOoO;
                PageGrid pageGrid4 = (PageGrid) c28031OooO00o.f99377OooOoO0;
                Iterator it8 = (Iterator) c28031OooO00o.f99374OooOo;
                PageTextCacheUpdateWorker pageTextCacheUpdateWorker5 = c28031OooO00o.f99375OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                it4 = it8;
                pageTextCacheUpdateWorker3 = pageTextCacheUpdateWorker5;
                page3 = page5;
                pageGrid2 = pageGrid4;
                PageGridModificationRecord pageGridModificationRecord2 = (PageGridModificationRecord) objOooO0oO;
                if (pageGridModificationRecord2 == null) {
                }
                if (handWritingTextCacheWithoutElements != null) {
                    break;
                }
                InterfaceC27323Oooo0oO interfaceC27323Oooo0oO2 = pageTextCacheUpdateWorker3.f70412Oooo000;
                String pageId2 = pageGrid2.getPageId();
                String noteId22 = page3.getNoteId();
                RectF bounds2 = pageGrid2.getBounds();
                c28031OooO00o.f99375OooOo0o = pageTextCacheUpdateWorker3;
                c28031OooO00o.f99374OooOo = it4;
                c28031OooO00o.f99377OooOoO0 = pageGrid2;
                c28031OooO00o.f99376OooOoO = page3;
                c28031OooO00o.f99378OooOoOO = handWritingTextCacheWithoutElements;
                c28031OooO00o.f99380OooOoo0 = lastModificationTime;
                c28031OooO00o.f99382OooOooo = 4;
                objOooO0oO = interfaceC27323Oooo0oO2.OooOO0(pageId2, noteId22, bounds2, c28031OooO00o);
                if (objOooO0oO != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                lastModificationTime = c28031OooO00o.f99380OooOoo0;
                handWritingTextCacheWithoutElements = (HandWritingTextCacheWithoutElements) c28031OooO00o.f99378OooOoOO;
                page3 = c28031OooO00o.f99376OooOoO;
                pageGrid2 = (PageGrid) c28031OooO00o.f99377OooOoO0;
                it4 = (Iterator) c28031OooO00o.f99374OooOo;
                pageTextCacheUpdateWorker3 = c28031OooO00o.f99375OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                List list32 = (List) objOooO0oO;
                ArrayList arrayList42 = new ArrayList();
                it6 = list32.iterator();
                while (it6.hasNext()) {
                }
                int trajectoryHash2 = DrawRecord.INSTANCE.getTrajectoryHash(arrayList42);
                if (handWritingTextCacheWithoutElements == null) {
                }
                list2 = list32;
                pageGrid3 = pageGrid2;
                pageTextCacheUpdateWorker4 = pageTextCacheUpdateWorker3;
                oooO00o = pageTextCacheUpdateWorker4.f70416Oooo0OO;
                if (oooO00o != null) {
                }
                break;
            case 5:
                it5 = (Iterator) c28031OooO00o.f99374OooOo;
                pageTextCacheUpdateWorker4 = c28031OooO00o.f99375OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                z = true;
                it2 = it5;
                pageTextCacheUpdateWorker2 = pageTextCacheUpdateWorker4;
                z3 = z;
                page4 = null;
                if (!it2.hasNext()) {
                }
                break;
            case 6:
                list2 = (List) c28031OooO00o.f99378OooOoOO;
                Page page6 = c28031OooO00o.f99376OooOoO;
                pageGrid3 = (PageGrid) c28031OooO00o.f99377OooOoO0;
                Iterator it9 = (Iterator) c28031OooO00o.f99374OooOo;
                PageTextCacheUpdateWorker pageTextCacheUpdateWorker6 = c28031OooO00o.f99375OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                it4 = it9;
                page3 = page6;
                pageTextCacheUpdateWorker4 = pageTextCacheUpdateWorker6;
                if (!pageTextCacheUpdateWorker4.f66671OooOoO0) {
                }
                break;
            case 7:
                it5 = (Iterator) c28031OooO00o.f99374OooOo;
                pageTextCacheUpdateWorker4 = c28031OooO00o.f99375OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                z = true;
                it2 = it5;
                pageTextCacheUpdateWorker2 = pageTextCacheUpdateWorker4;
                z3 = z;
                page4 = null;
                if (!it2.hasNext()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        if (r5.OooO(r3, r1) == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:14:0x0031, B:21:0x0047, B:44:0x00bf, B:46:0x00c7, B:48:0x00d9, B:50:0x0104, B:52:0x0114, B:24:0x0052, B:40:0x00aa, B:36:0x0097), top: B:59:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:14:0x0031, B:21:0x0047, B:44:0x00bf, B:46:0x00c7, B:48:0x00d9, B:50:0x0104, B:52:0x0114, B:24:0x0052, B:40:0x00aa, B:36:0x0097), top: B:59:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28034OooO0Oo c28034OooO0Oo;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker2;
        List list;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker3;
        if (abstractC32479OooO0OO instanceof C28034OooO0Oo) {
            c28034OooO0Oo = (C28034OooO0Oo) abstractC32479OooO0OO;
            int i = c28034OooO0Oo.f99395OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28034OooO0Oo.f99395OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c28034OooO0Oo = new C28034OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOooO = c28034OooO0Oo.f99394OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28034OooO0Oo.f99395OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOooO);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PageTextCacheUpdateWorker");
                c20358OooO00o.OooO0o0("start to update page text cache.", new Object[0]);
                String strOooO0O0 = this.f66668OooOo.f66692OooO0O0.OooO0O0("key_input_note_id");
                if (strOooO0O0 == null) {
                    return new ListenableWorker.OooO00o.C19046OooO00o();
                }
                c28034OooO0Oo.f99392OooOo0o = this;
                c28034OooO0Oo.f99395OooOoOO = 1;
                objOooOooO = this.f70415Oooo0O0.OooOooO(strOooO0O0, c28034OooO0Oo);
                if (objOooOooO != enumC32485OooO00o) {
                    pageTextCacheUpdateWorker = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 == 1) {
                pageTextCacheUpdateWorker = c28034OooO0Oo.f99392OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOooO);
            } else if (i2 == 2) {
                list = c28034OooO0Oo.f99391OooOo;
                pageTextCacheUpdateWorker2 = c28034OooO0Oo.f99392OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOooO);
                C27597o00ooo00 c27597o00ooo00 = pageTextCacheUpdateWorker2.f70411Oooo0;
                c28034OooO0Oo.f99392OooOo0o = pageTextCacheUpdateWorker2;
                c28034OooO0Oo.f99391OooOo = list;
                c28034OooO0Oo.f99395OooOoOO = 3;
                objOooOooO = c27597o00ooo00.OooO0o(25, c28034OooO0Oo);
                if (objOooOooO != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                pageTextCacheUpdateWorker3 = pageTextCacheUpdateWorker2;
                if (((Number) objOooOooO).intValue() == 0) {
                }
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooOooO);
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PageTextCacheUpdateWorker");
                    c20358OooO00o2.OooO0o0("finish to update page text cache.", new Object[0]);
                    return new ListenableWorker.OooO00o.OooO0OO();
                }
                list = c28034OooO0Oo.f99391OooOo;
                pageTextCacheUpdateWorker3 = c28034OooO0Oo.f99392OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOooO);
                if (((Number) objOooOooO).intValue() == 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("PageTextCacheUpdateWorker");
                    c20358OooO00o3.OooOO0O("Handwriting text feature is disabled.", new Object[0]);
                    return new ListenableWorker.OooO00o.OooO0OO();
                }
                long valueAsLong = pageTextCacheUpdateWorker3.f70410OooOooo.f95374OooO00o.getValueAsLong("rconfig_handwriting_text_cache_creation_interval_in_ms");
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("PageTextCacheUpdateWorker");
                c20358OooO00o4.OooO0o0("Handwriting text cache creation interval is " + valueAsLong + " ms.", new Object[0]);
                if (valueAsLong <= 0) {
                    c20358OooO00o4.OooOOO0("PageTextCacheUpdateWorker");
                    c20358OooO00o4.OooOO0O("Handwriting text cache creation is disabled.", new Object[0]);
                    return new ListenableWorker.OooO00o.OooO0OO();
                }
                pageTextCacheUpdateWorker3.f70416Oooo0OO = new OooO00o(valueAsLong);
                c28034OooO0Oo.f99392OooOo0o = null;
                c28034OooO0Oo.f99391OooOo = null;
                c28034OooO0Oo.f99395OooOoOO = 4;
            }
            List listO00O0O = OooOo.o00O0O((Iterable) objOooOooO, new C28033OooO0OO());
            c28034OooO0Oo.f99392OooOo0o = pageTextCacheUpdateWorker;
            c28034OooO0Oo.f99391OooOo = listO00O0O;
            c28034OooO0Oo.f99395OooOoOO = 2;
            if (pageTextCacheUpdateWorker.OooOO0(listO00O0O, c28034OooO0Oo) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            pageTextCacheUpdateWorker2 = pageTextCacheUpdateWorker;
            list = listO00O0O;
            C27597o00ooo00 c27597o00ooo002 = pageTextCacheUpdateWorker2.f70411Oooo0;
            c28034OooO0Oo.f99392OooOo0o = pageTextCacheUpdateWorker2;
            c28034OooO0Oo.f99391OooOo = list;
            c28034OooO0Oo.f99395OooOoOO = 3;
            objOooOooO = c27597o00ooo002.OooO0o(25, c28034OooO0Oo);
            if (objOooOooO != enumC32485OooO00o) {
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o5, "PageTextCacheUpdateWorker", "checkAndUpdateTextCache error, ", e), new Object[0]);
            return new ListenableWorker.OooO00o.C19046OooO00o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a7 -> B:17:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ea -> B:40:0x00eb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28032OooO0O0 c28032OooO0O0;
        Iterator it;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker;
        int i;
        Page page;
        Iterator it2;
        PdfPaperTheme pdfPaperTheme;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker2;
        if (abstractC32479OooO0OO instanceof C28032OooO0O0) {
            c28032OooO0O0 = (C28032OooO0O0) abstractC32479OooO0OO;
            int i2 = c28032OooO0O0.f99390OooOooO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28032OooO0O0.f99390OooOooO = i2 - Integer.MIN_VALUE;
            } else {
                c28032OooO0O0 = new C28032OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c28032OooO0O0.f99389OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28032OooO0O0.f99390OooOooO;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            it = list.iterator();
            pageTextCacheUpdateWorker = this;
            while (it.hasNext()) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c28032OooO0O0.f99383OooOo;
            pageTextCacheUpdateWorker2 = c28032OooO0O0.f99384OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            pageTextCacheUpdateWorker = pageTextCacheUpdateWorker2;
            while (it.hasNext()) {
                Page page2 = (Page) it.next();
                if (pageTextCacheUpdateWorker.f66671OooOoO0) {
                    return C32460OooOooO.f116667OooO00o;
                }
                PaperTheme paperTheme = page2.getPaperTheme();
                PdfPaperTheme pdfPaperTheme2 = paperTheme instanceof PdfPaperTheme ? (PdfPaperTheme) paperTheme : null;
                if (pdfPaperTheme2 != null) {
                    String pdfPath = pdfPaperTheme2.getPdfInfo().getPdfPath();
                    int pageNum = pdfPaperTheme2.getPageNum();
                    InterfaceC27320Oooo0OO interfaceC27320Oooo0OO = pageTextCacheUpdateWorker.f70413Oooo00O;
                    c28032OooO0O0.f99384OooOo0o = pageTextCacheUpdateWorker;
                    c28032OooO0O0.f99383OooOo = it;
                    c28032OooO0O0.f99386OooOoO0 = page2;
                    c28032OooO0O0.f99385OooOoO = pdfPaperTheme2;
                    c28032OooO0O0.f99387OooOoOO = pageNum;
                    c28032OooO0O0.f99390OooOooO = 1;
                    Object objOooO00o = interfaceC27320Oooo0OO.OooO00o(pdfPath, pageNum, c28032OooO0O0);
                    if (objOooO00o != enumC32485OooO00o) {
                        it2 = it;
                        i = pageNum;
                        page = page2;
                        pdfPaperTheme = pdfPaperTheme2;
                        pageTextCacheUpdateWorker2 = pageTextCacheUpdateWorker;
                        obj = objOooO00o;
                        if (((Boolean) obj).booleanValue()) {
                            C32443OooOOO<Integer, Integer> unrotatedPageSize = page.getUnrotatedPageSize();
                            int iIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
                            int iIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
                            Rect unrotatedPaperPadding = page.getUnrotatedPaperPadding();
                            int i4 = (iIntValue - unrotatedPaperPadding.left) - unrotatedPaperPadding.right;
                            int i5 = (iIntValue2 - unrotatedPaperPadding.top) - unrotatedPaperPadding.bottom;
                            C27545o00o0oo0 c27545o00o0oo0 = pageTextCacheUpdateWorker2.f70414Oooo00o;
                            PdfInfo pdfInfo = pdfPaperTheme.getPdfInfo();
                            Size size = new Size(i4, i5);
                            c28032OooO0O0.f99384OooOo0o = pageTextCacheUpdateWorker2;
                            c28032OooO0O0.f99383OooOo = it2;
                            c28032OooO0O0.f99386OooOoO0 = null;
                            c28032OooO0O0.f99385OooOoO = null;
                            c28032OooO0O0.f99390OooOooO = 2;
                            if (c27545o00o0oo0.OooOO0O(pdfInfo, i, size, c28032OooO0O0) != enumC32485OooO00o) {
                                it = it2;
                                pageTextCacheUpdateWorker = pageTextCacheUpdateWorker2;
                                while (it.hasNext()) {
                                }
                            }
                        } else {
                            pageTextCacheUpdateWorker = pageTextCacheUpdateWorker2;
                            it = it2;
                            while (it.hasNext()) {
                            }
                        }
                    }
                    return enumC32485OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        i = c28032OooO0O0.f99387OooOoOO;
        PdfPaperTheme pdfPaperTheme3 = c28032OooO0O0.f99385OooOoO;
        Page page3 = c28032OooO0O0.f99386OooOoO0;
        it2 = c28032OooO0O0.f99383OooOo;
        PageTextCacheUpdateWorker pageTextCacheUpdateWorker3 = c28032OooO0O0.f99384OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        pdfPaperTheme = pdfPaperTheme3;
        pageTextCacheUpdateWorker2 = pageTextCacheUpdateWorker3;
        page = page3;
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
