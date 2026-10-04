package o0OOo0o;

import OooOo.C20485OooOoO;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.appcompat.widget.C21559Oooo0oO;
import androidx.core.content.C21638OooO0Oo;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.gson.annotations.SerializedName;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18250l0;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.orion.notein.data.p602db.NoteContentDatabase;
import com.orion.notein.data.p602db.entity.MyTemplateEntity;
import com.orion.notein.domain.mapper.C22976OooO0Oo;
import com.orion.notein.domain.mapper.C22977OooO0o0;
import com.orion.notein.domain.mapper.MyTemplateMapper;
import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.LabelType;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.login.LoginErrorCode;
import com.orion.notein.domain.models.note.AudioFile;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteFile;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C24030OooOoo;
import o000O00.C24378OooOoO0;
import o000oo0.C24684Oooo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooO.C26264OooOOO0;
import o0O0oooO.C26305OooooO0;
import o0OO.C26427Oooo0O0;
import o0OO000o.C26454OooO0Oo;
import o0OO00o0.C26479OooOO0o;
import o0OO00o0.C26493OooOooo;
import o0OO00o0.C26501Oooo0oO;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26517OooooOo;
import o0OO00o0.C26596o00O0o0;
import o0OO00o0.C26613o00OOOoO;
import o0OO00o0.C26620o00Oo00o;
import o0OO00o0.C26649o00OoooO;
import o0OO00o0.C26690oOooo0o;
import o0OO00o0.C26691ooOO;
import o0OOO0OO.C27015OooOOoo;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO00.C27095OooOo0O;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27292OooO0oO;
import o0OOo0Oo.InterfaceC27301OooOOo;
import o0OOo0Oo.InterfaceC27303OooOOoo;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27312OooOoo;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27316Oooo;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import o0OOo0Oo.InterfaceC27319Oooo0O0;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOo0o.C27387o0000o0;
import o0OOoOo0.C27798OooO0o0;
import o0OOoOo0.C27799OooO0oO;
import o0OOoOo0.C27807OooOOOo;
import o0OOoOo0.C27808OooOOo;
import o0OOoOo0.C27819OooOoo;
import o0OOoooO.C28009OooOOOO;
import o0Oo00o.C28028OooO0o;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0OOo0o.o0000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27387o0000o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C24378OooOoO0 f95425OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27129OoooOOO f95426OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f95427OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27312OooOoo f95428OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27309OooOoO f95429OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27020OooOoO0 f95430OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C26427Oooo0O0 f95431OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC27323Oooo0oO f95432OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C26620o00Oo00o f95433OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0OO00o0.OooOo00 f95434OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC27318Oooo00o f95435OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C26596o00O0o0 f95436OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C26264OooOOO0 f95437OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C26649o00OoooO f95438OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final InterfaceC27301OooOOo f95439OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C26515OooooO0 f95440OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C27095OooOo0O f95441OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C27499o00Ooo0 f95442OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final InterfaceC27292OooO0oO f95443OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C27798OooO0o0 f95444OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C27585o00ooO0 f95445OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C26454OooO0Oo f95446OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C27449o00O0OoO f95447OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C27819OooOoo f95448OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C28009OooOOOO f95449OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C27799OooO0oO f95450OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final MyTemplateMapper f95451OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f95452OooOoo0;

    /* JADX INFO: renamed from: o0OOo0o.o0000o0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f95453OooO00o;

        public OooO00o(int i) {
            this.f95453OooO00o = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO00o) {
                return this.f95453OooO00o == ((OooO00o) obj).f95453OooO00o;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(25) + (Integer.hashCode(this.f95453OooO00o) * 31);
        }

        public final String toString() {
            return C21023OooO0Oo.OooO0OO(", contentDBVersion=25)", this.f95453OooO00o, new StringBuilder("NoteExtra(dbVersion="));
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o0000o0$OooO0O0 */
    public static final class OooO0O0 extends Exception {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final String f95454OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f95455OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String errorMsg) {
            super(errorMsg);
            kotlin.jvm.internal.OooOOO0.OooO0oO(errorMsg, "errorMsg");
            this.f95455OooOo0o = str;
            this.f95454OooOo = errorMsg;
        }

        public final String OooO00o() {
            return this.f95455OooOo0o;
        }

        public final String OooO0O0() {
            return this.f95454OooOo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f95455OooOo0o, oooO0O0.f95455OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f95454OooOo, oooO0O0.f95454OooOo);
        }

        public final int hashCode() {
            return this.f95454OooOo.hashCode() + (this.f95455OooOo0o.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("NoteInFileException(errorCode=");
            sb.append(this.f95455OooOo0o);
            sb.append(", errorMsg=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f95454OooOo, ")");
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o0000o0$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f95456OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f95457OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f95458OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f95459OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f95460OooO0o0;

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO0OO() {
            boolean z = false;
            this(31, z, z, z);
        }

        public final boolean OooO00o() {
            return this.f95460OooO0o0;
        }

        public final boolean OooO0O0() {
            return this.f95458OooO0OO;
        }

        public final boolean OooO0OO() {
            return this.f95457OooO0O0;
        }

        public final boolean OooO0Oo() {
            return this.f95459OooO0Oo;
        }

        public final boolean OooO0o0() {
            return this.f95456OooO00o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f95456OooO00o == oooO0OO.f95456OooO00o && this.f95457OooO0O0 == oooO0OO.f95457OooO0O0 && this.f95458OooO0OO == oooO0OO.f95458OooO0OO && this.f95459OooO0Oo == oooO0OO.f95459OooO0Oo && this.f95460OooO0o0 == oooO0OO.f95460OooO0o0;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f95460OooO0o0) + OooOoo0.o00000.OooO0O0(OooOoo0.o00000.OooO0O0(OooOoo0.o00000.OooO0O0(Boolean.hashCode(this.f95456OooO00o) * 31, 31, this.f95457OooO0O0), 31, this.f95458OooO0OO), 31, this.f95459OooO0Oo);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoteInFileFlag(includePaperTheme=");
            sb.append(this.f95456OooO00o);
            sb.append(", includeOutlineAndAnnotation=");
            sb.append(this.f95457OooO0O0);
            sb.append(", includeAllDisplayItems=");
            sb.append(this.f95458OooO0OO);
            sb.append(", includePagePadding=");
            sb.append(this.f95459OooO0Oo);
            sb.append(", ignore=");
            return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f95460OooO0o0);
        }

        public /* synthetic */ OooO0OO(int i, boolean z, boolean z2, boolean z3) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, true, (i & 16) != 0);
        }

        public OooO0OO(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.f95456OooO00o = z;
            this.f95457OooO0O0 = z2;
            this.f95458OooO0OO = z3;
            this.f95459OooO0Oo = z4;
            this.f95460OooO0o0 = z5;
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o0000o0$OooO0Oo, reason: case insensitive filesystem */
    @Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R,\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lo0OOo0o/o0000o0$OooO0Oo;", "", "", "Lcom/orion/notein/domain/models/Label;", "OooO00o", "Ljava/util/List;", "()Ljava/util/List;", "noteLabels", "", "", "OooO0O0", "Ljava/util/Map;", "()Ljava/util/Map;", "pageIdToLabelsMap", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class C27388OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("note_labels")
        private final List<Label> noteLabels;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
        @SerializedName("page_id_to_labels_map")
        private final Map<String, List<Label>> pageIdToLabelsMap;

        /* JADX WARN: Multi-variable type inference failed */
        public C27388OooO0Oo(List<Label> noteLabels, Map<String, ? extends List<Label>> map) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteLabels, "noteLabels");
            this.noteLabels = noteLabels;
            this.pageIdToLabelsMap = map;
        }

        public final List<Label> OooO00o() {
            return this.noteLabels;
        }

        public final Map<String, List<Label>> OooO0O0() {
            return this.pageIdToLabelsMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27388OooO0Oo)) {
                return false;
            }
            C27388OooO0Oo c27388OooO0Oo = (C27388OooO0Oo) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.noteLabels, c27388OooO0Oo.noteLabels) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.pageIdToLabelsMap, c27388OooO0Oo.pageIdToLabelsMap);
        }

        public final int hashCode() {
            return this.pageIdToLabelsMap.hashCode() + (this.noteLabels.hashCode() * 31);
        }

        public final String toString() {
            return "NoteLabelInfo(noteLabels=" + this.noteLabels + ", pageIdToLabelsMap=" + this.pageIdToLabelsMap + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o0000o0$OooO0o */
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final File f95463OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final File[] f95464OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f95465OooO0OO;

        public OooO0o(File file, File[] fileArr, ArrayList arrayList) {
            this.f95463OooO00o = file;
            this.f95464OooO0O0 = fileArr;
            this.f95465OooO0OO = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f95463OooO00o.equals(oooO0o.f95463OooO00o) && this.f95464OooO0O0.equals(oooO0o.f95464OooO0O0) && this.f95465OooO0OO.equals(oooO0o.f95465OooO0OO);
        }

        public final int hashCode() {
            return this.f95465OooO0OO.hashCode() + (((this.f95463OooO00o.hashCode() * 31) + Arrays.hashCode(this.f95464OooO0O0)) * 31);
        }

        public final String toString() {
            return "UnzipResult(importDir=" + this.f95463OooO00o + ", unzippedFiles=" + Arrays.toString(this.f95464OooO0O0) + ", databaseFiles=" + this.f95465OooO0OO + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o0000o0$OooO0o0, reason: case insensitive filesystem */
    @Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, m80612d2 = {"Lo0OOo0o/o0000o0$OooO0o0;", "", "", "OooO00o", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "OooO0O0", "getSrcNoteId", "srcNoteId", "", "OooO0OO", "J", "getCreationTime", "()J", C17625c.f52155b, "OooO0Oo", "getPdfFileName", "pdfFileName", "", "OooO0o0", "I", "getDbVersion", "()I", "dbVersion", "OooO0o", "getContentDBVersion", "contentDBVersion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class C27389OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("id")
        private final String id;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
        @SerializedName("src_note_id")
        private final String srcNoteId;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
        @SerializedName("creation_time")
        private final long creationTime;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
        @SerializedName("pdf_file_name")
        private final String pdfFileName;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
        @SerializedName("content_db_version")
        private final int contentDBVersion;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
        @SerializedName("db_version")
        private final int dbVersion;

        public C27389OooO0o0(String id, String srcNoteId, long j, String pdfFileName, int i, int i2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
            kotlin.jvm.internal.OooOOO0.OooO0oO(srcNoteId, "srcNoteId");
            kotlin.jvm.internal.OooOOO0.OooO0oO(pdfFileName, "pdfFileName");
            this.id = id;
            this.srcNoteId = srcNoteId;
            this.creationTime = j;
            this.pdfFileName = pdfFileName;
            this.dbVersion = i;
            this.contentDBVersion = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27389OooO0o0)) {
                return false;
            }
            C27389OooO0o0 c27389OooO0o0 = (C27389OooO0o0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.id, c27389OooO0o0.id) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.srcNoteId, c27389OooO0o0.srcNoteId) && this.creationTime == c27389OooO0o0.creationTime && kotlin.jvm.internal.OooOOO0.OooO0O0(this.pdfFileName, c27389OooO0o0.pdfFileName) && this.dbVersion == c27389OooO0o0.dbVersion && this.contentDBVersion == c27389OooO0o0.contentDBVersion;
        }

        public final int hashCode() {
            return Integer.hashCode(this.contentDBVersion) + C20785Oooo00o.OooO00o(this.dbVersion, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.srcNoteId), 31, this.creationTime), 31, this.pdfFileName), 31);
        }

        public final String toString() {
            String str = this.id;
            String str2 = this.srcNoteId;
            long j = this.creationTime;
            String str3 = this.pdfFileName;
            int i = this.dbVersion;
            int i2 = this.contentDBVersion;
            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("NotePdfLost(id=", str, ", srcNoteId=", str2, ", creationTime=");
            sbOooO0O0.append(j);
            sbOooO0O0.append(", pdfFileName=");
            sbOooO0O0.append(str3);
            sbOooO0O0.append(", dbVersion=");
            sbOooO0O0.append(i);
            sbOooO0O0.append(", contentDBVersion=");
            sbOooO0O0.append(i2);
            sbOooO0O0.append(")");
            return sbOooO0O0.toString();
        }
    }

    public C27387o0000o0(C27129OoooOOO c27129OoooOOO, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27312OooOoo notePdfLostInfoRepo, InterfaceC27309OooOoO noteContentRepo, C26427Oooo0O0 c26427Oooo0O0, C27020OooOoO0 c27020OooOoO0, InterfaceC27323Oooo0oO strokeRepo, C26620o00Oo00o c26620o00Oo00o, C24378OooOoO0 c24378OooOoO0, o0OO00o0.OooOo00 oooOo00, InterfaceC27318Oooo00o pageLayerRepo, C26596o00O0o0 c26596o00O0o0, C26649o00OoooO c26649o00OoooO, C26264OooOOO0 c26264OooOOO0, InterfaceC27301OooOOo hyperLinkRepo, C26515OooooO0 c26515OooooO0, C27499o00Ooo0 pdfFileUseCase, C27095OooOo0O c27095OooOo0O, InterfaceC27292OooO0oO audioRepo, C26454OooO0Oo noteContentDatabaseProvider, C27585o00ooO0 c27585o00ooO0, C27449o00O0OoO c27449o00O0OoO, C27819OooOoo c27819OooOoo, C27798OooO0o0 c27798OooO0o0, C27799OooO0oO c27799OooO0oO, C28009OooOOOO c28009OooOOOO, MyTemplateMapper myTemplateMapper, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notePdfLostInfoRepo, "notePdfLostInfoRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeRepo, "strokeRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageLayerRepo, "pageLayerRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(hyperLinkRepo, "hyperLinkRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfFileUseCase, "pdfFileUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(audioRepo, "audioRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentDatabaseProvider, "noteContentDatabaseProvider");
        kotlin.jvm.internal.OooOOO0.OooO0oO(myTemplateMapper, "myTemplateMapper");
        this.f95426OooO00o = c27129OoooOOO;
        this.f95427OooO0O0 = noteMetaRepo;
        this.f95428OooO0OO = notePdfLostInfoRepo;
        this.f95429OooO0Oo = noteContentRepo;
        this.f95431OooO0o0 = c26427Oooo0O0;
        this.f95430OooO0o = c27020OooOoO0;
        this.f95432OooO0oO = strokeRepo;
        this.f95433OooO0oo = c26620o00Oo00o;
        this.f95425OooO = c24378OooOoO0;
        this.f95434OooOO0 = oooOo00;
        this.f95435OooOO0O = pageLayerRepo;
        this.f95436OooOO0o = c26596o00O0o0;
        this.f95438OooOOO0 = c26649o00OoooO;
        this.f95437OooOOO = c26264OooOOO0;
        this.f95439OooOOOO = hyperLinkRepo;
        this.f95440OooOOOo = c26515OooooO0;
        this.f95442OooOOo0 = pdfFileUseCase;
        this.f95441OooOOo = c27095OooOo0O;
        this.f95443OooOOoo = audioRepo;
        this.f95446OooOo00 = noteContentDatabaseProvider;
        this.f95445OooOo0 = c27585o00ooO0;
        this.f95447OooOo0O = c27449o00O0OoO;
        this.f95448OooOo0o = c27819OooOoo;
        this.f95444OooOo = c27798OooO0o0;
        this.f95450OooOoO0 = c27799OooO0oO;
        this.f95449OooOoO = c28009OooOOOO;
        this.f95451OooOoOO = myTemplateMapper;
        this.f95452OooOoo0 = abstractApplicationC26277OooOoOO;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C27384o0000OoO(this, null), 3);
    }

    public static final /* synthetic */ InterfaceC27303OooOOoo OooO(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95436OooOO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27387o0000o0 c27387o0000o0, String str, NoteFile noteFile, NoteMeta noteMeta, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27390o0000o0O c27390o0000o0O;
        NoteFile noteFile2;
        NoteMeta noteMeta2;
        C27387o0000o0 c27387o0000o02;
        boolean z2;
        String str2;
        String str3;
        PdfInfo pdfInfo;
        String str4;
        NoteContent noteContent;
        int i;
        Page page;
        List<Page> pages;
        Page page2;
        PdfInfo pdfInfo2;
        int i2;
        NoteFile noteFile3;
        String str5;
        NoteMeta noteMeta3;
        String str6;
        List<Page> pages2;
        String tnPath;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof C27390o0000o0O) {
            c27390o0000o0O = (C27390o0000o0O) abstractC32479OooO0OO;
            int i3 = c27390o0000o0O.f95482Oooo00O;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c27390o0000o0O.f95482Oooo00O = i3 - Integer.MIN_VALUE;
            } else {
                c27390o0000o0O = new C27390o0000o0O(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object obj = c27390o0000o0O.f95480OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c27390o0000o0O.f95482Oooo00O;
        int size = 1;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String strOooO0Oo = c27387o0000o0.f95426OooO00o.OooO0Oo();
            c27390o0000o0O.f95473OooOo0o = c27387o0000o0;
            c27390o0000o0O.f95472OooOo = str;
            noteFile2 = noteFile;
            c27390o0000o0O.f95475OooOoO0 = noteFile2;
            noteMeta2 = noteMeta;
            c27390o0000o0O.f95474OooOoO = noteMeta2;
            c27390o0000o0O.f95476OooOoOO = strOooO0Oo;
            c27390o0000o0O.f95477OooOoo = z;
            c27390o0000o0O.f95482Oooo00O = 1;
            Object objOooOO0o = c27387o0000o0.f95429OooO0Oo.OooOO0o(str, c27390o0000o0O);
            if (objOooOO0o != enumC32485OooO00o) {
                c27387o0000o02 = c27387o0000o0;
                z2 = z;
                str2 = str;
                str3 = strOooO0Oo;
                obj = objOooOO0o;
            }
            return enumC32485OooO00o;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c27390o0000o0O.f95479OooOooO;
            pdfInfo2 = c27390o0000o0O.f95478OooOoo0;
            noteContent = (NoteContent) c27390o0000o0O.f95476OooOoOO;
            str5 = (String) c27390o0000o0O.f95474OooOoO;
            noteMeta3 = (NoteMeta) c27390o0000o0O.f95475OooOoO0;
            noteFile3 = (NoteFile) c27390o0000o0O.f95472OooOo;
            str6 = (String) c27390o0000o0O.f95473OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            page = (Page) obj;
            i = i2;
            pdfInfo = pdfInfo2;
            str2 = str6;
            str4 = str5;
            noteMeta2 = noteMeta3;
            noteFile2 = noteFile3;
            C32443OooOOO<Integer, Integer> tnSize = page != null ? page.getTnSize() : null;
            String parentId = noteFile2.getInTrashBin() ? null : noteFile2.getParentId();
            String parentId2 = noteFile2.getInTrashBin() ? noteFile2.getParentId() : null;
            String title = noteFile2.getTitle();
            return new NoteMeta(str2, str4, title == null ? "" : title, parentId, parentId2, noteFile2.getFavorite(), (page == null || (tnPath = page.getTnPath()) == null) ? "" : tnPath, tnSize != null ? tnSize.f116638OooOo0o.intValue() : 0, tnSize != null ? tnSize.f116637OooOo.intValue() : 0, noteFile2.getInTrashBin(), pdfInfo, i, noteMeta2 != null ? noteMeta2.getCreationTime() : System.currentTimeMillis(), noteFile2.getLastModificationTime(), noteFile2.getSortKey(), noteContent != null ? noteContent.getUnboundedNote() : false, noteFile2.getUsingOwnPdf(), noteFile2.getLockAdded(), 0L, 262144, null);
        }
        z2 = c27390o0000o0O.f95477OooOoo;
        str3 = (String) c27390o0000o0O.f95476OooOoOO;
        NoteMeta noteMeta4 = (NoteMeta) c27390o0000o0O.f95474OooOoO;
        NoteFile noteFile4 = (NoteFile) c27390o0000o0O.f95475OooOoO0;
        str2 = (String) c27390o0000o0O.f95472OooOo;
        c27387o0000o02 = (C27387o0000o0) c27390o0000o0O.f95473OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        noteMeta2 = noteMeta4;
        noteFile2 = noteFile4;
        NoteContent noteContent2 = (NoteContent) obj;
        PdfInfo pdfInfo3 = (!z2 || noteContent2 == null) ? null : noteContent2.getPdfInfo();
        if (noteContent2 != null && (pages2 = noteContent2.getPages()) != null) {
            size = pages2.size();
        }
        if (noteContent2 == null || (pages = noteContent2.getPages()) == null || (page2 = (Page) oOo000Oo.OooOo.Oooo(pages)) == null) {
            pdfInfo = pdfInfo3;
            str4 = str3;
            noteContent = noteContent2;
            i = size;
            page = null;
            if (page != null) {
            }
            if (noteFile2.getInTrashBin()) {
            }
            String parentId22 = noteFile2.getInTrashBin() ? noteFile2.getParentId() : null;
            String title2 = noteFile2.getTitle();
            return new NoteMeta(str2, str4, title2 == null ? "" : title2, parentId, parentId22, noteFile2.getFavorite(), (page == null || (tnPath = page.getTnPath()) == null) ? "" : tnPath, tnSize != null ? tnSize.f116638OooOo0o.intValue() : 0, tnSize != null ? tnSize.f116637OooOo.intValue() : 0, noteFile2.getInTrashBin(), pdfInfo, i, noteMeta2 != null ? noteMeta2.getCreationTime() : System.currentTimeMillis(), noteFile2.getLastModificationTime(), noteFile2.getSortKey(), noteContent != null ? noteContent.getUnboundedNote() : false, noteFile2.getUsingOwnPdf(), noteFile2.getLockAdded(), 0L, 262144, null);
        }
        C27020OooOoO0 c27020OooOoO0 = c27387o0000o02.f95430OooO0o;
        String id = page2.getId();
        c27390o0000o0O.f95473OooOo0o = str2;
        c27390o0000o0O.f95472OooOo = noteFile2;
        c27390o0000o0O.f95475OooOoO0 = noteMeta2;
        c27390o0000o0O.f95474OooOoO = str3;
        c27390o0000o0O.f95476OooOoOO = noteContent2;
        c27390o0000o0O.f95478OooOoo0 = pdfInfo3;
        c27390o0000o0O.f95479OooOooO = size;
        c27390o0000o0O.f95482Oooo00O = 2;
        Object objOooO0Oo = c27020OooOoO0.OooO0Oo(id, str2, c27390o0000o0O);
        if (objOooO0Oo != enumC32485OooO00o) {
            String str7 = str3;
            pdfInfo2 = pdfInfo3;
            i2 = size;
            noteFile3 = noteFile2;
            str5 = str7;
            noteContent = noteContent2;
            obj = objOooO0Oo;
            noteMeta3 = noteMeta2;
            str6 = str2;
            page = (Page) obj;
            i = i2;
            pdfInfo = pdfInfo2;
            str2 = str6;
            str4 = str5;
            noteMeta2 = noteMeta3;
            noteFile2 = noteFile3;
            if (page != null) {
            }
            if (noteFile2.getInTrashBin()) {
            }
            String parentId222 = noteFile2.getInTrashBin() ? noteFile2.getParentId() : null;
            String title22 = noteFile2.getTitle();
            return new NoteMeta(str2, str4, title22 == null ? "" : title22, parentId, parentId222, noteFile2.getFavorite(), (page == null || (tnPath = page.getTnPath()) == null) ? "" : tnPath, tnSize != null ? tnSize.f116638OooOo0o.intValue() : 0, tnSize != null ? tnSize.f116637OooOo.intValue() : 0, noteFile2.getInTrashBin(), pdfInfo, i, noteMeta2 != null ? noteMeta2.getCreationTime() : System.currentTimeMillis(), noteFile2.getLastModificationTime(), noteFile2.getSortKey(), noteContent != null ? noteContent.getUnboundedNote() : false, noteFile2.getUsingOwnPdf(), noteFile2.getLockAdded(), 0L, 262144, null);
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ad -> B:30:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C27387o0000o0 c27387o0000o0, File file, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27412o000Ooo c27412o000Ooo;
        C27388OooO0Oo c27388OooO0OoOoooO0O;
        C27387o0000o0 c27387o0000o02;
        String str2;
        Iterator it;
        C27412o000Ooo c27412o000Ooo2;
        Iterator<Map.Entry<String, List<Label>>> it2;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof C27412o000Ooo) {
            c27412o000Ooo = (C27412o000Ooo) abstractC32479OooO0OO;
            int i = c27412o000Ooo.f95681OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27412o000Ooo.f95681OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27412o000Ooo = new C27412o000Ooo(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object obj = c27412o000Ooo.f95680OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27412o000Ooo.f95681OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27388OooO0OoOoooO0O = OoooO0O(file);
            if (c27388OooO0OoOoooO0O == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            c27387o0000o02 = c27387o0000o0;
            str2 = str;
            it = c27388OooO0OoOoooO0O.OooO00o().iterator();
            c27412o000Ooo2 = c27412o000Ooo;
        } else if (i2 == 1) {
            it = (Iterator) c27412o000Ooo.f95676OooOoO;
            c27388OooO0OoOoooO0O = (C27388OooO0Oo) c27412o000Ooo.f95677OooOoO0;
            String str3 = c27412o000Ooo.f95674OooOo;
            C27387o0000o0 c27387o0000o03 = c27412o000Ooo.f95675OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str2 = str3;
            c27412o000Ooo2 = c27412o000Ooo;
            c27387o0000o02 = c27387o0000o03;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it3 = c27412o000Ooo.f95678OooOoOO;
            String str4 = (String) c27412o000Ooo.f95676OooOoO;
            Iterator<Map.Entry<String, List<Label>>> it4 = (Iterator) c27412o000Ooo.f95677OooOoO0;
            String str5 = c27412o000Ooo.f95674OooOo;
            C27387o0000o0 c27387o0000o04 = c27412o000Ooo.f95675OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String str6 = str4;
            Iterator<Map.Entry<String, List<Label>>> it5 = it4;
            C27412o000Ooo c27412o000Ooo3 = c27412o000Ooo;
            String str7 = str5;
            while (it3.hasNext()) {
                Label label = (Label) it3.next();
                int value = LabelType.PAGE.getValue();
                c27412o000Ooo3.f95675OooOo0o = c27387o0000o04;
                c27412o000Ooo3.f95674OooOo = str7;
                c27412o000Ooo3.f95677OooOoO0 = it5;
                c27412o000Ooo3.f95676OooOoO = str6;
                c27412o000Ooo3.f95678OooOoOO = it3;
                c27412o000Ooo3.f95681OooOooO = 2;
                if (c27387o0000o04.Oooo0o(label, str6, value, str7, c27412o000Ooo3) == enumC32485OooO00o) {
                    break;
                }
            }
            it2 = it5;
            c27387o0000o02 = c27387o0000o04;
            str2 = str7;
            c27412o000Ooo2 = c27412o000Ooo3;
            if (it2.hasNext()) {
                Map.Entry<String, List<Label>> next = it2.next();
                String key = next.getKey();
                Iterator it6 = next.getValue().iterator();
                it5 = it2;
                it3 = it6;
                str6 = key;
                c27387o0000o04 = c27387o0000o02;
                str7 = str2;
                c27412o000Ooo3 = c27412o000Ooo2;
                while (it3.hasNext()) {
                }
                it2 = it5;
                c27387o0000o02 = c27387o0000o04;
                str2 = str7;
                c27412o000Ooo2 = c27412o000Ooo3;
                if (it2.hasNext()) {
                    return C32460OooOooO.f116667OooO00o;
                }
            }
        }
        while (it.hasNext()) {
            Label label2 = (Label) it.next();
            int value2 = LabelType.NOTE.getValue();
            c27412o000Ooo2.f95675OooOo0o = c27387o0000o02;
            c27412o000Ooo2.f95674OooOo = str2;
            c27412o000Ooo2.f95677OooOoO0 = c27388OooO0OoOoooO0O;
            c27412o000Ooo2.f95676OooOoO = it;
            c27412o000Ooo2.f95681OooOooO = 1;
            if (c27387o0000o02.Oooo0o(label2, str2, value2, "", c27412o000Ooo2) == enumC32485OooO00o) {
                break;
            }
        }
        it2 = c27388OooO0OoOoooO0O.OooO0O0().entrySet().iterator();
        if (it2.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(C27387o0000o0 c27387o0000o0, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000O0O o000o0o2;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof o000O0O) {
            o000o0o2 = (o000O0O) abstractC32479OooO0OO;
            int i = o000o0o2.f95549OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o0o2.f95549OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o000o0o2 = new o000O0O(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o000o0o2.f95548OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000o0o2.f95549OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            o000o0o2.f95549OooOoO0 = 1;
            objOooO00o = c27387o0000o0.f95443OooOOoo.OooO00o(str, o000o0o2);
            if (objOooO00o == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        List list = (List) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AudioFile) it.next()).getFilePath());
        }
        return oOo000Oo.OooOo.o0OO00O(arrayList);
    }

    public static final /* synthetic */ Context OooO0Oo(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95452OooOoo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o(C27387o0000o0 c27387o0000o0, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o000Oo0 o000oo02;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof o000Oo0) {
            o000oo02 = (o000Oo0) abstractC32479OooO0OO;
            int i = o000oo02.f95652OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oo02.f95652OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o000oo02 = new o000Oo0(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object obj = o000oo02.f95651OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000oo02.f95652OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000oo02.f95649OooOo0o = c27387o0000o0;
            o000oo02.f95648OooOo = str;
            o000oo02.f95652OooOoOO = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27393o0000oO0(c27387o0000o0, false, null), o000oo02);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = o000oo02.f95648OooOo;
            c27387o0000o0 = o000oo02.f95649OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        File file = new File(c27387o0000o0.f95452OooOoo0.getFilesDir(), "notein_files");
        C31190OooO0oo.OooO0o(file);
        File file2 = new File(file, "export");
        C31190OooO0oo.OooO0o(file2);
        File file3 = new File(file2, str);
        C31190OooO0oo.OooO0o(file3);
        File file4 = new File(file3, UUID.randomUUID().toString());
        C31190OooO0oo.OooO0o(file4);
        C34406OooO00o.f123390OooO00o.OooO00o(C21638OooO0Oo.OooO00o(file4, "exportZipWithIdAndTimeParent: "), new Object[0]);
        return file4;
    }

    public static final /* synthetic */ C26515OooooO0 OooO0o0(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95440OooOOOo;
    }

    public static final /* synthetic */ Object OooO0oO(C27387o0000o0 c27387o0000o0, Uri uri, C27419o000o00o c27419o000o00o) {
        return c27387o0000o0.Oooo(uri, c27419o000o00o);
    }

    public static final /* synthetic */ InterfaceC27301OooOOo OooO0oo(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95439OooOOOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[LOOP:1: B:30:0x009e->B:32:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOO0(C27387o0000o0 c27387o0000o0, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000O0Oo o000o0oo2;
        List list;
        Iterator it;
        Iterator it2;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof o000O0Oo) {
            o000o0oo2 = (o000O0Oo) abstractC32479OooO0OO;
            int i = o000o0oo2.f95559OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o0oo2.f95559OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o000o0oo2 = new o000O0Oo(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object objOoooO00 = o000o0oo2.f95558OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000o0oo2.f95559OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOoooO00);
            o000o0oo2.f95556OooOo0o = c27387o0000o0;
            o000o0oo2.f95555OooOo = str;
            o000o0oo2.f95559OooOoOO = 1;
            objOoooO00 = c27387o0000o0.OoooO00(str, o000o0oo2);
            if (objOoooO00 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) o000o0oo2.f95556OooOo0o;
            C32446OooOOOo.OooO0O0(objOoooO00);
            ArrayList arrayList = new ArrayList();
            it = ((Iterable) objOoooO00).iterator();
            while (it.hasNext()) {
                Image item = ((DualLinkRef) it.next()).getItem();
                if (item != null) {
                    arrayList.add(item);
                }
            }
            ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(list, arrayList);
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
            it2 = arrayListOooooOO.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Image) it2.next()).getUri());
            }
            return oOo000Oo.OooOo.o0OO00O(arrayList2);
        }
        str = o000o0oo2.f95555OooOo;
        c27387o0000o0 = (C27387o0000o0) o000o0oo2.f95556OooOo0o;
        C32446OooOOOo.OooO0O0(objOoooO00);
        List list2 = (List) objOoooO00;
        o000o0oo2.f95556OooOo0o = list2;
        o000o0oo2.f95555OooOo = null;
        o000o0oo2.f95559OooOoOO = 2;
        Object objOooOO0 = c27387o0000o0.f95440OooOOOo.OooOO0(str, o000o0oo2);
        if (objOooOO0 != enumC32485OooO00o) {
            objOoooO00 = objOooOO0;
            list = list2;
            ArrayList arrayList3 = new ArrayList();
            it = ((Iterable) objOoooO00).iterator();
            while (it.hasNext()) {
            }
            ArrayList arrayListOooooOO2 = oOo000Oo.OooOo.OooooOO(list, arrayList3);
            ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO2, 10));
            it2 = arrayListOooooOO2.iterator();
            while (it2.hasNext()) {
            }
            return oOo000Oo.OooOo.o0OO00O(arrayList22);
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8 A[LOOP:1: B:30:0x00b2->B:32:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOO0O(String str, Set set, C27387o0000o0 c27387o0000o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000OO0O o000oo0o2;
        List list;
        Iterator it;
        Iterator it2;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof o000OO0O) {
            o000oo0o2 = (o000OO0O) abstractC32479OooO0OO;
            int i = o000oo0o2.f95620OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oo0o2.f95620OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o000oo0o2 = new o000OO0O(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO = o000oo0o2.f95617OooOoO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000oo0o2.f95620OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO);
            o000oo0o2.f95616OooOo0o = c27387o0000o0;
            o000oo0o2.f95615OooOo = str;
            o000oo0o2.f95618OooOoO0 = set;
            o000oo0o2.f95620OooOoo0 = 1;
            objOooOOO = c27387o0000o0.f95436OooOO0o.OooOOO(str, set, o000oo0o2);
            if (objOooOOO != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) o000oo0o2.f95616OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO);
            ArrayList arrayList = new ArrayList();
            it = ((Iterable) objOooOOO).iterator();
            while (it.hasNext()) {
                Image item = ((DualLinkRef) it.next()).getItem();
                if (item != null) {
                    arrayList.add(item);
                }
            }
            ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(list, arrayList);
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
            it2 = arrayListOooooOO.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Image) it2.next()).getUri());
            }
            return oOo000Oo.OooOo.o0OO00O(arrayList2);
        }
        set = o000oo0o2.f95618OooOoO0;
        str = o000oo0o2.f95615OooOo;
        c27387o0000o0 = (C27387o0000o0) o000oo0o2.f95616OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOO);
        List list2 = (List) objOooOOO;
        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(set);
        o000oo0o2.f95616OooOo0o = list2;
        o000oo0o2.f95615OooOo = null;
        o000oo0o2.f95618OooOoO0 = null;
        o000oo0o2.f95620OooOoo0 = 2;
        Object objOooOO0o = c27387o0000o0.f95440OooOOOo.OooOO0o(str, listO0ooOO0, o000oo0o2);
        if (objOooOO0o != obj) {
            objOooOOO = objOooOO0o;
            list = list2;
            ArrayList arrayList3 = new ArrayList();
            it = ((Iterable) objOooOOO).iterator();
            while (it.hasNext()) {
            }
            ArrayList arrayListOooooOO2 = oOo000Oo.OooOo.OooooOO(list, arrayList3);
            ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO2, 10));
            it2 = arrayListOooooOO2.iterator();
            while (it2.hasNext()) {
            }
            return oOo000Oo.OooOo.o0OO00O(arrayList22);
        }
        return obj;
    }

    public static final /* synthetic */ InterfaceC27309OooOoO OooOO0o(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95429OooO0Oo;
    }

    public static final /* synthetic */ o0OOo0Oo.Oooo0 OooOOO(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95430OooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOOOO(C27387o0000o0 c27387o0000o0, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27401o000O0oO c27401o000O0oO;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof C27401o000O0oO) {
            c27401o000O0oO = (C27401o000O0oO) abstractC32479OooO0OO;
            int i = c27401o000O0oO.f95587OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27401o000O0oO.f95587OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27401o000O0oO = new C27401o000O0oO(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c27401o000O0oO.f95585OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27401o000O0oO.f95587OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            c27401o000O0oO.f95586OooOo0o = c27387o0000o0;
            c27401o000O0oO.f95587OooOoO = 1;
            objOooO0oO = c27387o0000o0.f95430OooO0o.OooO0oO(str, c27401o000O0oO);
            if (objOooO0oO == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27387o0000o0 = c27401o000O0oO.f95586OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
        }
        c27387o0000o0.getClass();
        return OoooO((List) objOooO0oO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOOOo(String str, Set set, C27387o0000o0 c27387o0000o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27402o000O0oo c27402o000O0oo;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof C27402o000O0oo) {
            c27402o000O0oo = (C27402o000O0oo) abstractC32479OooO0OO;
            int i = c27402o000O0oo.f95591OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27402o000O0oo.f95591OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27402o000O0oo = new C27402o000O0oo(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object objOooO = c27402o000O0oo.f95589OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27402o000O0oo.f95591OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            c27402o000O0oo.f95590OooOo0o = c27387o0000o0;
            c27402o000O0oo.f95591OooOoO = 1;
            objOooO = c27387o0000o0.f95430OooO0o.OooO(str, set, c27402o000O0oo);
            if (objOooO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27387o0000o0 = c27402o000O0oo.f95590OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO);
        }
        c27387o0000o0.getClass();
        return OoooO((List) objOooO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOOo(C27387o0000o0 c27387o0000o0, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000OO00 o000oo002;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof o000OO00) {
            o000oo002 = (o000OO00) abstractC32479OooO0OO;
            int i = o000oo002.f95613OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oo002.f95613OooOoO = i - Integer.MIN_VALUE;
            } else {
                o000oo002 = new o000OO00(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = o000oo002.f95611OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000oo002.f95613OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            o000oo002.f95612OooOo0o = c27387o0000o0;
            o000oo002.f95613OooOoO = 1;
            objOooO0oO = c27387o0000o0.f95430OooO0o.OooO0oO(str, o000oo002);
            if (objOooO0oO == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27387o0000o0 = o000oo002.f95612OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
        }
        return c27387o0000o0.o000oOoO((List) objOooO0oO);
    }

    public static final /* synthetic */ InterfaceC27319Oooo0O0 OooOOo0(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95431OooO0o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOOoo(String str, Set set, C27387o0000o0 c27387o0000o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27598o0OoO0o c27598o0OoO0o;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof C27598o0OoO0o) {
            c27598o0OoO0o = (C27598o0OoO0o) abstractC32479OooO0OO;
            int i = c27598o0OoO0o.f96955OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27598o0OoO0o.f96955OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27598o0OoO0o = new C27598o0OoO0o(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object objOooO = c27598o0OoO0o.f96953OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27598o0OoO0o.f96955OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            c27598o0OoO0o.f96954OooOo0o = c27387o0000o0;
            c27598o0OoO0o.f96955OooOoO = 1;
            objOooO = c27387o0000o0.f95430OooO0o.OooO(str, set, c27598o0OoO0o);
            if (objOooO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27387o0000o0 = c27598o0OoO0o.f96954OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO);
        }
        return c27387o0000o0.o000oOoO((List) objOooO);
    }

    public static final /* synthetic */ C27585o00ooO0 OooOo(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95445OooOo0;
    }

    public static final /* synthetic */ InterfaceC27323Oooo0oO OooOo0(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95432OooO0oO;
    }

    public static final /* synthetic */ C26649o00OoooO OooOo00(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95438OooOOO0;
    }

    public static final /* synthetic */ C26264OooOOO0 OooOo0O(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95437OooOOO;
    }

    public static final /* synthetic */ InterfaceC27316Oooo OooOo0o(C27387o0000o0 c27387o0000o0) {
        return c27387o0000o0.f95441OooOOo;
    }

    public static final NoteMeta OooOoO(C27387o0000o0 c27387o0000o0, File[] fileArr) {
        File file;
        c27387o0000o0.getClass();
        int length = fileArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                file = null;
                break;
            }
            file = fileArr[i];
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(file.getName(), "note_meta.json")) {
                break;
            }
            i++;
        }
        if (file != null) {
            try {
                return (NoteMeta) C28028OooO0o.OooO00o().fromJson(C32501OooO0oO.OooO0oo(file), NoteMeta.class);
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteInFileUseCase");
                c20358OooO00o.OooOO0o(e, "parseNoteMetaFromFile failed", new Object[0]);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO0(C27387o0000o0 c27387o0000o0, ArrayList arrayList, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000OOo0 o000ooo02;
        o000OOoO o000oooo2;
        List list;
        List list2;
        String str2;
        C34406OooO00o.OooO0O0 oooO0O0;
        String str3 = str;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof o000OOo0) {
            o000ooo02 = (o000OOo0) abstractC32479OooO0OO;
            int i = o000ooo02.f95637OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000ooo02.f95637OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o000ooo02 = new o000OOo0(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object objInvoke = o000ooo02.f95634OooOoO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000ooo02.f95637OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objInvoke);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                File file = (File) obj2;
                C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isToZipFilesValid, zipFile: ", file.getName()), new Object[0]);
                String name = file.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                if (C33595OooOOo.OooOoO0(name, "note_pdf_", false)) {
                    String name2 = file.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                    if (!C33595OooOOo.OooOoO0(name2, "note_pdf_set_uri_theme_", false)) {
                        arrayList2.add(obj2);
                    }
                }
            }
            o000OOoO o000oooo3 = new o000OOoO(c27387o0000o0, str3, null);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList2.size(), "isToZipFilesValid, noteInPdf size: ", ", ", oOo000Oo.OooOo.o000oOoO(arrayList2, null, null, null, new o0000OOO(), 31)), new Object[0]);
            int size = arrayList2.size();
            list = arrayList2;
            if (size == 1) {
                o000ooo02.f95633OooOo0o = str3;
                o000ooo02.f95632OooOo = arrayList2;
                o000ooo02.f95635OooOoO0 = o000oooo3;
                o000ooo02.f95637OooOoo0 = 1;
                Object objOoooOO0 = c27387o0000o0.OoooOO0(str3, o000ooo02);
                if (objOoooOO0 != obj) {
                    objInvoke = objOoooOO0;
                    o000oooo2 = o000oooo3;
                    list2 = arrayList2;
                }
                return obj;
            }
            if (list.size() > 1) {
                return Boolean.TRUE;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInFileUseCase");
            c20358OooO00o2.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isToZipFilesValid failed, noteInPdfs size is bigger than 1, ", oOo000Oo.OooOo.o000oOoO(list, null, null, null, new C27381o0000OOo(), 31)), new Object[0]);
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) o000ooo02.f95632OooOo;
            oooO0O0 = (C34406OooO00o.OooO0O0) o000ooo02.f95633OooOo0o;
            C32446OooOOOo.OooO0O0(objInvoke);
            oooO0O0.OooO0OO("isNoteInFileValid failed, getPdfPathByNoteId is null or empty, noteId: " + str2 + ", meta: " + objInvoke, new Object[0]);
            return Boolean.FALSE;
        }
        o000oooo2 = o000ooo02.f95635OooOoO0;
        List list3 = (List) o000ooo02.f95632OooOo;
        String str4 = (String) o000ooo02.f95633OooOo0o;
        C32446OooOOOo.OooO0O0(objInvoke);
        list2 = list3;
        str3 = str4;
        String str5 = (String) objInvoke;
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("isToZipFilesValid, pdfPath: ", str5), new Object[0]);
        if (str5 == null || str5.length() == 0) {
            c20358OooO00o3.OooOOO0("NoteInFileUseCase");
            o000ooo02.f95633OooOo0o = c20358OooO00o3;
            o000ooo02.f95632OooOo = str3;
            o000ooo02.f95635OooOoO0 = null;
            o000ooo02.f95637OooOoo0 = 2;
            objInvoke = o000oooo2.invoke(o000ooo02);
            if (objInvoke != obj) {
                str2 = str3;
                oooO0O0 = c20358OooO00o3;
                oooO0O0.OooO0OO("isNoteInFileValid failed, getPdfPathByNoteId is null or empty, noteId: " + str2 + ", meta: " + objInvoke, new Object[0]);
                return Boolean.FALSE;
            }
            return obj;
        }
        File file2 = new File(str5);
        String name3 = ((File) list2.get(0)).getName();
        kotlin.jvm.internal.OooOOO0.OooO0o(name3, "getName(...)");
        String strOooOo0o = C33595OooOOo.OooOo0o(name3, "note_pdf_");
        list = list2;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(strOooOo0o, file2.getName())) {
            c20358OooO00o3.OooOOO0("NoteInFileUseCase");
            c20358OooO00o3.OooO0OO(C22237OooO0o0.OooO00o("isNoteInFileValid failed, noteInPdfFileName is not equal to pdfFile.name,noteInPdfFileName: ", strOooOo0o, ", pdfFile.name: ", file2.getName()), new Object[0]);
            return Boolean.FALSE;
        }
        if (list.size() > 1) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0349, code lost:
    
        if (r2.OooO0oo(r0, r1, r4) != r5) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0274 A[PHI: r0 r1 r2 r3
      0x0274: PHI (r0v29 java.lang.String) = (r0v27 java.lang.String), (r0v30 java.lang.String) binds: [B:98:0x0270, B:17:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r1v21 java.lang.String) = (r1v19 java.lang.String), (r1v22 java.lang.String) binds: [B:98:0x0270, B:17:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r2v23 o0OOo0o.o0000o0) = (r2v21 o0OOo0o.o0000o0), (r2v24 o0OOo0o.o0000o0) binds: [B:98:0x0270, B:17:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r3v42 java.lang.Object) = (r3v41 java.lang.Object), (r3v1 java.lang.Object) binds: [B:98:0x0270, B:17:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e7 A[PHI: r0 r1 r2
      0x02e7: PHI (r0v35 java.lang.String) = (r0v31 java.lang.String), (r0v36 java.lang.String) binds: [B:114:0x02e4, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r1v26 java.lang.String) = (r1v23 java.lang.String), (r1v27 java.lang.String) binds: [B:114:0x02e4, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x02e7: PHI (r2v28 o0OOo0o.o0000o0) = (r2v25 o0OOo0o.o0000o0), (r2v29 o0OOo0o.o0000o0) binds: [B:114:0x02e4, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0310 A[PHI: r0 r1 r2
      0x0310: PHI (r0v37 java.lang.String) = (r0v35 java.lang.String), (r0v38 java.lang.String) binds: [B:123:0x030d, B:14:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0310: PHI (r1v28 java.lang.String) = (r1v26 java.lang.String), (r1v29 java.lang.String) binds: [B:123:0x030d, B:14:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0310: PHI (r2v30 o0OOo0o.o0000o0) = (r2v28 o0OOo0o.o0000o0), (r2v31 o0OOo0o.o0000o0) binds: [B:123:0x030d, B:14:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0339 A[PHI: r0 r1 r2
      0x0339: PHI (r0v39 java.lang.String) = (r0v37 java.lang.String), (r0v41 java.lang.String) binds: [B:132:0x0336, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0339: PHI (r1v30 java.lang.String) = (r1v28 java.lang.String), (r1v31 java.lang.String) binds: [B:132:0x0336, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0339: PHI (r2v32 o0OOo0o.o0000o0) = (r2v30 o0OOo0o.o0000o0), (r2v34 o0OOo0o.o0000o0) binds: [B:132:0x0336, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca A[PHI: r0 r1 r2 r3
      0x00ca: PHI (r0v7 java.lang.String) = (r0v5 java.lang.String), (r0v10 java.lang.String) binds: [B:42:0x0139, B:24:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v7 java.lang.String) binds: [B:42:0x0139, B:24:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r2v7 o0OOo0o.o0000o0) = (r2v5 o0OOo0o.o0000o0), (r2v9 o0OOo0o.o0000o0) binds: [B:42:0x0139, B:24:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r3v14 java.lang.Object) = (r3v13 java.lang.Object), (r3v1 java.lang.Object) binds: [B:42:0x0139, B:24:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f A[LOOP:3: B:54:0x0179->B:56:0x017f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1 A[PHI: r0 r1 r2 r6
      0x01a1: PHI (r0v11 java.util.List) = (r0v9 java.util.List), (r0v18 java.util.List) binds: [B:58:0x019d, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r1v8 java.lang.String) = (r1v6 java.lang.String), (r1v10 java.lang.String) binds: [B:58:0x019d, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r2v10 java.lang.String) = (r2v8 java.lang.String), (r2v12 java.lang.String) binds: [B:58:0x019d, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r6v5 o0OOo0o.o0000o0) = (r6v4 o0OOo0o.o0000o0), (r6v6 o0OOo0o.o0000o0) binds: [B:58:0x019d, B:23:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0211 A[PHI: r0 r1 r2
      0x0211: PHI (r0v21 java.lang.String) = (r0v19 java.lang.String), (r0v22 java.lang.String) binds: [B:80:0x020d, B:21:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r1v13 java.lang.String) = (r1v11 java.lang.String), (r1v14 java.lang.String) binds: [B:80:0x020d, B:21:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r2v15 o0OOo0o.o0000o0) = (r2v13 o0OOo0o.o0000o0), (r2v16 o0OOo0o.o0000o0) binds: [B:80:0x020d, B:21:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023a A[PHI: r0 r1 r2
      0x023a: PHI (r0v23 java.lang.String) = (r0v21 java.lang.String), (r0v24 java.lang.String) binds: [B:89:0x0236, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r1v15 java.lang.String) = (r1v13 java.lang.String), (r1v16 java.lang.String) binds: [B:89:0x0236, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x023a: PHI (r2v17 o0OOo0o.o0000o0) = (r2v15 o0OOo0o.o0000o0), (r2v18 o0OOo0o.o0000o0) binds: [B:89:0x0236, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024e A[PHI: r0 r1 r2
      0x024e: PHI (r0v25 java.lang.String) = (r0v23 java.lang.String), (r0v26 java.lang.String) binds: [B:92:0x024a, B:19:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r1v17 java.lang.String) = (r1v15 java.lang.String), (r1v18 java.lang.String) binds: [B:92:0x024a, B:19:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r2v19 o0OOo0o.o0000o0) = (r2v17 o0OOo0o.o0000o0), (r2v20 o0OOo0o.o0000o0) binds: [B:92:0x024a, B:19:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0262 A[PHI: r0 r1 r2
      0x0262: PHI (r0v27 java.lang.String) = (r0v25 java.lang.String), (r0v28 java.lang.String) binds: [B:95:0x025e, B:18:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r1v19 java.lang.String) = (r1v17 java.lang.String), (r1v20 java.lang.String) binds: [B:95:0x025e, B:18:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r2v21 o0OOo0o.o0000o0) = (r2v19 o0OOo0o.o0000o0), (r2v22 o0OOo0o.o0000o0) binds: [B:95:0x025e, B:18:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(C27387o0000o0 c27387o0000o0, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27405o000Oo c27405o000Oo;
        Object objOooO0O0;
        C27387o0000o0 c27387o0000o02;
        String str3;
        C27387o0000o0 c27387o0000o03;
        String str4;
        String str5;
        List list;
        ArrayList arrayList;
        C27020OooOoO0 c27020OooOoO0;
        Iterator it;
        Set setO0OO00O;
        C27020OooOoO0 c27020OooOoO02;
        String str6;
        String str7;
        C27387o0000o0 c27387o0000o04;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o;
        Object objOooO00o2;
        EnumC32485OooO00o enumC32485OooO00o2;
        InterfaceC27318Oooo00o interfaceC27318Oooo00o;
        C26515OooooO0 c26515OooooO0;
        Object objOooOO0;
        String str8;
        ArrayList arrayList2;
        C26596o00O0o0 c26596o00O0o0;
        Object objOooO00o3;
        EnumC32485OooO00o enumC32485OooO00o3;
        Object objOooO00o4;
        EnumC32485OooO00o enumC32485OooO00o4;
        C27387o0000o0 c27387o0000o05 = c27387o0000o0;
        String str9 = str;
        String str10 = str2;
        c27387o0000o05.getClass();
        if (abstractC32479OooO0OO instanceof C27405o000Oo) {
            c27405o000Oo = (C27405o000Oo) abstractC32479OooO0OO;
            int i = c27405o000Oo.f95646OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27405o000Oo.f95646OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27405o000Oo = new C27405o000Oo(c27387o0000o05, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c27405o000Oo.f95645OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o5 = EnumC32485OooO00o.f116726OooOo0o;
        switch (c27405o000Oo.f95646OooOoo) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0oO);
                c27405o000Oo.f95642OooOo0o = c27387o0000o05;
                c27405o000Oo.f95641OooOo = str9;
                c27405o000Oo.f95644OooOoO0 = str10;
                c27405o000Oo.f95646OooOoo = 1;
                if (c27387o0000o05.f95429OooO0Oo.OooO0O0(str10, str9, c27405o000Oo) != enumC32485OooO00o5) {
                    C27020OooOoO0 c27020OooOoO03 = c27387o0000o05.f95430OooO0o;
                    c27405o000Oo.f95642OooOo0o = c27387o0000o05;
                    c27405o000Oo.f95641OooOo = str9;
                    c27405o000Oo.f95644OooOoO0 = str10;
                    c27405o000Oo.f95646OooOoo = 2;
                    C27015OooOOoo c27015OooOOoo = c27020OooOoO03.f94064OooO00o;
                    c27015OooOOoo.getClass();
                    objOooO0O0 = c27015OooOOoo.OooO0O0(str10, new o0OOO0OO.OooOOOO(str9, str10, null));
                    if (objOooO0O0 != enumC32485OooO00o5) {
                        objOooO0O0 = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0O0 != enumC32485OooO00o5) {
                        objOooO0O0 = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0O0 != enumC32485OooO00o5) {
                        String str11 = str10;
                        c27387o0000o02 = c27387o0000o05;
                        str3 = str11;
                        C27020OooOoO0 c27020OooOoO04 = c27387o0000o02.f95430OooO0o;
                        c27405o000Oo.f95642OooOo0o = c27387o0000o02;
                        c27405o000Oo.f95641OooOo = str9;
                        c27405o000Oo.f95644OooOoO0 = str3;
                        c27405o000Oo.f95646OooOoo = 3;
                        objOooO0oO = c27020OooOoO04.OooO0oO(str3, c27405o000Oo);
                        if (objOooO0oO != enumC32485OooO00o5) {
                            c27387o0000o03 = c27387o0000o02;
                            str4 = str9;
                            str5 = str3;
                            list = (List) objOooO0oO;
                            ArrayList<Page> arrayList3 = new ArrayList();
                            for (Object obj : list) {
                                List<String> historyPageIdList = ((Page) obj).getHistoryPageIdList();
                                if (historyPageIdList != null && !historyPageIdList.isEmpty()) {
                                    arrayList3.add(obj);
                                }
                            }
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                            for (Page page : arrayList3) {
                                page.setHistoryPageIdList(null);
                                arrayList.add(page);
                            }
                            c27020OooOoO0 = c27387o0000o03.f95430OooO0o;
                            c27405o000Oo.f95642OooOo0o = c27387o0000o03;
                            c27405o000Oo.f95641OooOo = str4;
                            c27405o000Oo.f95644OooOoO0 = str5;
                            c27405o000Oo.f95643OooOoO = list;
                            c27405o000Oo.f95646OooOoo = 4;
                            if (c27020OooOoO0.OooOO0(str5, arrayList, c27405o000Oo) != enumC32485OooO00o5) {
                                ArrayList arrayList4 = new ArrayList();
                                it = list.iterator();
                                while (it.hasNext()) {
                                    List<String> historyPageIdList2 = ((Page) it.next()).getHistoryPageIdList();
                                    String str12 = historyPageIdList2 != null ? (String) oOo000Oo.OooOo.Oooo(historyPageIdList2) : null;
                                    if (str12 != null) {
                                        arrayList4.add(str12);
                                    }
                                }
                                setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList4);
                                c27020OooOoO02 = c27387o0000o03.f95430OooO0o;
                                c27405o000Oo.f95642OooOo0o = c27387o0000o03;
                                c27405o000Oo.f95641OooOo = str4;
                                c27405o000Oo.f95644OooOoO0 = str5;
                                c27405o000Oo.f95643OooOoO = null;
                                c27405o000Oo.f95646OooOoo = 5;
                                if (c27020OooOoO02.OooO0O0(str5, setO0OO00O, c27405o000Oo) != enumC32485OooO00o5) {
                                    str6 = str5;
                                    str7 = str4;
                                    c27387o0000o04 = c27387o0000o03;
                                    C26620o00Oo00o c26620o00Oo00o = c27387o0000o04.f95433OooO0oo;
                                    c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                                    c27405o000Oo.f95641OooOo = str7;
                                    c27405o000Oo.f95644OooOoO0 = str6;
                                    c27405o000Oo.f95646OooOoo = 6;
                                    C26613o00OOOoO c26613o00OOOoO = c26620o00Oo00o.f91878OooO00o;
                                    c26613o00OOOoO.getClass();
                                    objOooO00o = c26613o00OOOoO.OooO00o(str6, new C26690oOooo0o(str7, str6, null));
                                    enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                                    if (objOooO00o != enumC32485OooO00o) {
                                        objOooO00o = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o != enumC32485OooO00o) {
                                        objOooO00o = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o != enumC32485OooO00o5) {
                                        o0OO00o0.OooOo00 oooOo00 = c27387o0000o04.f95434OooOO0;
                                        c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                                        c27405o000Oo.f95641OooOo = str7;
                                        c27405o000Oo.f95644OooOoO0 = str6;
                                        c27405o000Oo.f95646OooOoo = 7;
                                        C26479OooOO0o c26479OooOO0o = oooOo00.f91041OooO00o;
                                        c26479OooOO0o.getClass();
                                        objOooO00o2 = c26479OooOO0o.OooO00o(str6, new o0OO00o0.OooOO0O(str7, str6, null));
                                        enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                                        if (objOooO00o2 != enumC32485OooO00o2) {
                                            objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                        }
                                        if (objOooO00o2 != enumC32485OooO00o2) {
                                            objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                        }
                                        if (objOooO00o2 != enumC32485OooO00o5) {
                                            interfaceC27318Oooo00o = c27387o0000o04.f95435OooOO0O;
                                            c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                                            c27405o000Oo.f95641OooOo = str7;
                                            c27405o000Oo.f95644OooOoO0 = str6;
                                            c27405o000Oo.f95646OooOoo = 8;
                                            if (interfaceC27318Oooo00o.OooO0O0(str6, str7, c27405o000Oo) != enumC32485OooO00o5) {
                                                c26515OooooO0 = c27387o0000o04.f95440OooOOOo;
                                                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                                                c27405o000Oo.f95641OooOo = str7;
                                                c27405o000Oo.f95644OooOoO0 = str6;
                                                c27405o000Oo.f95646OooOoo = 9;
                                                if (c26515OooooO0.OooOOOo(str6, str7, c27405o000Oo) != enumC32485OooO00o5) {
                                                    InterfaceC27309OooOoO interfaceC27309OooOoO = c27387o0000o04.f95429OooO0Oo;
                                                    c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                                                    c27405o000Oo.f95641OooOo = str7;
                                                    c27405o000Oo.f95644OooOoO0 = str6;
                                                    c27405o000Oo.f95646OooOoo = 10;
                                                    objOooO0oO = interfaceC27309OooOoO.OooOO0o(str6, c27405o000Oo);
                                                    if (objOooO0oO != enumC32485OooO00o5) {
                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooO0oO);
                                                        String activatedPageLayerId = ((NoteContent) objOooO0oO).getActivatedPageLayerId();
                                                        C26515OooooO0 c26515OooooO02 = c27387o0000o04.f95440OooOOOo;
                                                        c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                                                        c27405o000Oo.f95641OooOo = str7;
                                                        c27405o000Oo.f95644OooOoO0 = str6;
                                                        c27405o000Oo.f95643OooOoO = activatedPageLayerId;
                                                        c27405o000Oo.f95646OooOoo = 11;
                                                        objOooOO0 = c26515OooooO02.OooOO0(str6, c27405o000Oo);
                                                        if (objOooOO0 != enumC32485OooO00o5) {
                                                            str8 = activatedPageLayerId;
                                                            objOooO0oO = objOooOO0;
                                                            arrayList2 = new ArrayList();
                                                            for (DualLinkRef dualLinkRef : (Iterable) objOooO0oO) {
                                                                Image item = dualLinkRef.getItem();
                                                                Image imageCopy$default = item != null ? Image.copy$default(item, null, dualLinkRef.getPageId(), null, str8, null, 0.0f, 0L, 0L, false, 501, null) : null;
                                                                if (imageCopy$default != null) {
                                                                    arrayList2.add(imageCopy$default);
                                                                }
                                                            }
                                                            c26596o00O0o0 = c27387o0000o04.f95436OooOO0o;
                                                            c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                                                            c27405o000Oo.f95641OooOo = str7;
                                                            c27405o000Oo.f95644OooOoO0 = str6;
                                                            c27405o000Oo.f95643OooOoO = null;
                                                            c27405o000Oo.f95646OooOoo = 12;
                                                            if (c26596o00O0o0.OooO0O0(arrayList2, str6, false, c27405o000Oo) != enumC32485OooO00o5) {
                                                                C26515OooooO0 c26515OooooO03 = c27387o0000o04.f95440OooOOOo;
                                                                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                                                                c27405o000Oo.f95641OooOo = str7;
                                                                c27405o000Oo.f95644OooOoO0 = str6;
                                                                c27405o000Oo.f95646OooOoo = 13;
                                                                C26501Oooo0oO c26501Oooo0oO = c26515OooooO03.f91177OooO0O0;
                                                                c26501Oooo0oO.getClass();
                                                                objOooO00o3 = c26501Oooo0oO.OooO00o(str6, new C26493OooOooo(str6, null));
                                                                enumC32485OooO00o3 = EnumC32485OooO00o.f116726OooOo0o;
                                                                if (objOooO00o3 != enumC32485OooO00o3) {
                                                                    objOooO00o3 = C32460OooOooO.f116667OooO00o;
                                                                }
                                                                if (objOooO00o3 != enumC32485OooO00o3) {
                                                                    objOooO00o3 = C32460OooOooO.f116667OooO00o;
                                                                }
                                                                if (objOooO00o3 != enumC32485OooO00o5) {
                                                                    C26515OooooO0 c26515OooooO04 = c27387o0000o04.f95440OooOOOo;
                                                                    c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                                                                    c27405o000Oo.f95641OooOo = str7;
                                                                    c27405o000Oo.f95644OooOoO0 = str6;
                                                                    c27405o000Oo.f95646OooOoo = 14;
                                                                    C26691ooOO c26691ooOO = c26515OooooO04.f91176OooO00o;
                                                                    c26691ooOO.getClass();
                                                                    objOooO00o4 = c26691ooOO.OooO00o(str6, new C26517OooooOo(str6, null));
                                                                    enumC32485OooO00o4 = EnumC32485OooO00o.f116726OooOo0o;
                                                                    if (objOooO00o4 != enumC32485OooO00o4) {
                                                                        objOooO00o4 = C32460OooOooO.f116667OooO00o;
                                                                    }
                                                                    if (objOooO00o4 != enumC32485OooO00o4) {
                                                                        objOooO00o4 = C32460OooOooO.f116667OooO00o;
                                                                    }
                                                                    if (objOooO00o4 != enumC32485OooO00o5) {
                                                                        InterfaceC27292OooO0oO interfaceC27292OooO0oO = c27387o0000o04.f95443OooOOoo;
                                                                        c27405o000Oo.f95642OooOo0o = null;
                                                                        c27405o000Oo.f95641OooOo = null;
                                                                        c27405o000Oo.f95644OooOoO0 = null;
                                                                        c27405o000Oo.f95646OooOoo = 15;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o5;
            case 1:
                String str13 = c27405o000Oo.f95644OooOoO0;
                str9 = c27405o000Oo.f95641OooOo;
                C27387o0000o0 c27387o0000o06 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                str10 = str13;
                c27387o0000o05 = c27387o0000o06;
                C27020OooOoO0 c27020OooOoO032 = c27387o0000o05.f95430OooO0o;
                c27405o000Oo.f95642OooOo0o = c27387o0000o05;
                c27405o000Oo.f95641OooOo = str9;
                c27405o000Oo.f95644OooOoO0 = str10;
                c27405o000Oo.f95646OooOoo = 2;
                C27015OooOOoo c27015OooOOoo2 = c27020OooOoO032.f94064OooO00o;
                c27015OooOOoo2.getClass();
                objOooO0O0 = c27015OooOOoo2.OooO0O0(str10, new o0OOO0OO.OooOOOO(str9, str10, null));
                if (objOooO0O0 != enumC32485OooO00o5) {
                }
                if (objOooO0O0 != enumC32485OooO00o5) {
                }
                if (objOooO0O0 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 2:
                str3 = c27405o000Oo.f95644OooOoO0;
                str9 = c27405o000Oo.f95641OooOo;
                c27387o0000o02 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C27020OooOoO0 c27020OooOoO042 = c27387o0000o02.f95430OooO0o;
                c27405o000Oo.f95642OooOo0o = c27387o0000o02;
                c27405o000Oo.f95641OooOo = str9;
                c27405o000Oo.f95644OooOoO0 = str3;
                c27405o000Oo.f95646OooOoo = 3;
                objOooO0oO = c27020OooOoO042.OooO0oO(str3, c27405o000Oo);
                if (objOooO0oO != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 3:
                str3 = c27405o000Oo.f95644OooOoO0;
                str9 = c27405o000Oo.f95641OooOo;
                c27387o0000o02 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                c27387o0000o03 = c27387o0000o02;
                str4 = str9;
                str5 = str3;
                list = (List) objOooO0oO;
                ArrayList<Page> arrayList32 = new ArrayList();
                while (r3.hasNext()) {
                }
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList32, 10));
                while (r9.hasNext()) {
                }
                c27020OooOoO0 = c27387o0000o03.f95430OooO0o;
                c27405o000Oo.f95642OooOo0o = c27387o0000o03;
                c27405o000Oo.f95641OooOo = str4;
                c27405o000Oo.f95644OooOoO0 = str5;
                c27405o000Oo.f95643OooOoO = list;
                c27405o000Oo.f95646OooOoo = 4;
                if (c27020OooOoO0.OooOO0(str5, arrayList, c27405o000Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 4:
                list = (List) c27405o000Oo.f95643OooOoO;
                str5 = c27405o000Oo.f95644OooOoO0;
                str4 = c27405o000Oo.f95641OooOo;
                c27387o0000o03 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                ArrayList arrayList42 = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                }
                setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList42);
                c27020OooOoO02 = c27387o0000o03.f95430OooO0o;
                c27405o000Oo.f95642OooOo0o = c27387o0000o03;
                c27405o000Oo.f95641OooOo = str4;
                c27405o000Oo.f95644OooOoO0 = str5;
                c27405o000Oo.f95643OooOoO = null;
                c27405o000Oo.f95646OooOoo = 5;
                if (c27020OooOoO02.OooO0O0(str5, setO0OO00O, c27405o000Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 5:
                str6 = c27405o000Oo.f95644OooOoO0;
                str7 = c27405o000Oo.f95641OooOo;
                c27387o0000o04 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C26620o00Oo00o c26620o00Oo00o2 = c27387o0000o04.f95433OooO0oo;
                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                c27405o000Oo.f95641OooOo = str7;
                c27405o000Oo.f95644OooOoO0 = str6;
                c27405o000Oo.f95646OooOoo = 6;
                C26613o00OOOoO c26613o00OOOoO2 = c26620o00Oo00o2.f91878OooO00o;
                c26613o00OOOoO2.getClass();
                objOooO00o = c26613o00OOOoO2.OooO00o(str6, new C26690oOooo0o(str7, str6, null));
                enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o != enumC32485OooO00o) {
                }
                if (objOooO00o != enumC32485OooO00o) {
                }
                if (objOooO00o != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 6:
                str6 = c27405o000Oo.f95644OooOoO0;
                str7 = c27405o000Oo.f95641OooOo;
                c27387o0000o04 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                o0OO00o0.OooOo00 oooOo002 = c27387o0000o04.f95434OooOO0;
                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                c27405o000Oo.f95641OooOo = str7;
                c27405o000Oo.f95644OooOoO0 = str6;
                c27405o000Oo.f95646OooOoo = 7;
                C26479OooOO0o c26479OooOO0o2 = oooOo002.f91041OooO00o;
                c26479OooOO0o2.getClass();
                objOooO00o2 = c26479OooOO0o2.OooO00o(str6, new o0OO00o0.OooOO0O(str7, str6, null));
                enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o2 != enumC32485OooO00o2) {
                }
                if (objOooO00o2 != enumC32485OooO00o2) {
                }
                if (objOooO00o2 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 7:
                str6 = c27405o000Oo.f95644OooOoO0;
                str7 = c27405o000Oo.f95641OooOo;
                c27387o0000o04 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                interfaceC27318Oooo00o = c27387o0000o04.f95435OooOO0O;
                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                c27405o000Oo.f95641OooOo = str7;
                c27405o000Oo.f95644OooOoO0 = str6;
                c27405o000Oo.f95646OooOoo = 8;
                if (interfaceC27318Oooo00o.OooO0O0(str6, str7, c27405o000Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 8:
                str6 = c27405o000Oo.f95644OooOoO0;
                str7 = c27405o000Oo.f95641OooOo;
                c27387o0000o04 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                c26515OooooO0 = c27387o0000o04.f95440OooOOOo;
                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                c27405o000Oo.f95641OooOo = str7;
                c27405o000Oo.f95644OooOoO0 = str6;
                c27405o000Oo.f95646OooOoo = 9;
                if (c26515OooooO0.OooOOOo(str6, str7, c27405o000Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 9:
                str6 = c27405o000Oo.f95644OooOoO0;
                str7 = c27405o000Oo.f95641OooOo;
                c27387o0000o04 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                InterfaceC27309OooOoO interfaceC27309OooOoO2 = c27387o0000o04.f95429OooO0Oo;
                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                c27405o000Oo.f95641OooOo = str7;
                c27405o000Oo.f95644OooOoO0 = str6;
                c27405o000Oo.f95646OooOoo = 10;
                objOooO0oO = interfaceC27309OooOoO2.OooOO0o(str6, c27405o000Oo);
                if (objOooO0oO != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 10:
                str6 = c27405o000Oo.f95644OooOoO0;
                str7 = c27405o000Oo.f95641OooOo;
                c27387o0000o04 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooO0oO);
                String activatedPageLayerId2 = ((NoteContent) objOooO0oO).getActivatedPageLayerId();
                C26515OooooO0 c26515OooooO022 = c27387o0000o04.f95440OooOOOo;
                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                c27405o000Oo.f95641OooOo = str7;
                c27405o000Oo.f95644OooOoO0 = str6;
                c27405o000Oo.f95643OooOoO = activatedPageLayerId2;
                c27405o000Oo.f95646OooOoo = 11;
                objOooOO0 = c26515OooooO022.OooOO0(str6, c27405o000Oo);
                if (objOooOO0 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 11:
                String str14 = (String) c27405o000Oo.f95643OooOoO;
                String str15 = c27405o000Oo.f95644OooOoO0;
                String str16 = c27405o000Oo.f95641OooOo;
                C27387o0000o0 c27387o0000o07 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                str8 = str14;
                str6 = str15;
                str7 = str16;
                c27387o0000o04 = c27387o0000o07;
                arrayList2 = new ArrayList();
                while (r3.hasNext()) {
                }
                c26596o00O0o0 = c27387o0000o04.f95436OooOO0o;
                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                c27405o000Oo.f95641OooOo = str7;
                c27405o000Oo.f95644OooOoO0 = str6;
                c27405o000Oo.f95643OooOoO = null;
                c27405o000Oo.f95646OooOoo = 12;
                if (c26596o00O0o0.OooO0O0(arrayList2, str6, false, c27405o000Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 12:
                str6 = c27405o000Oo.f95644OooOoO0;
                str7 = c27405o000Oo.f95641OooOo;
                c27387o0000o04 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C26515OooooO0 c26515OooooO032 = c27387o0000o04.f95440OooOOOo;
                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                c27405o000Oo.f95641OooOo = str7;
                c27405o000Oo.f95644OooOoO0 = str6;
                c27405o000Oo.f95646OooOoo = 13;
                C26501Oooo0oO c26501Oooo0oO2 = c26515OooooO032.f91177OooO0O0;
                c26501Oooo0oO2.getClass();
                objOooO00o3 = c26501Oooo0oO2.OooO00o(str6, new C26493OooOooo(str6, null));
                enumC32485OooO00o3 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o3 != enumC32485OooO00o3) {
                }
                if (objOooO00o3 != enumC32485OooO00o3) {
                }
                if (objOooO00o3 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 13:
                str6 = c27405o000Oo.f95644OooOoO0;
                str7 = c27405o000Oo.f95641OooOo;
                c27387o0000o04 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C26515OooooO0 c26515OooooO042 = c27387o0000o04.f95440OooOOOo;
                c27405o000Oo.f95642OooOo0o = c27387o0000o04;
                c27405o000Oo.f95641OooOo = str7;
                c27405o000Oo.f95644OooOoO0 = str6;
                c27405o000Oo.f95646OooOoo = 14;
                C26691ooOO c26691ooOO2 = c26515OooooO042.f91176OooO00o;
                c26691ooOO2.getClass();
                objOooO00o4 = c26691ooOO2.OooO00o(str6, new C26517OooooOo(str6, null));
                enumC32485OooO00o4 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o4 != enumC32485OooO00o4) {
                }
                if (objOooO00o4 != enumC32485OooO00o4) {
                }
                if (objOooO00o4 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 14:
                str6 = c27405o000Oo.f95644OooOoO0;
                str7 = c27405o000Oo.f95641OooOo;
                c27387o0000o04 = c27405o000Oo.f95642OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                InterfaceC27292OooO0oO interfaceC27292OooO0oO2 = c27387o0000o04.f95443OooOOoo;
                c27405o000Oo.f95642OooOo0o = null;
                c27405o000Oo.f95641OooOo = null;
                c27405o000Oo.f95644OooOoO0 = null;
                c27405o000Oo.f95646OooOoo = 15;
                break;
            case 15:
                C32446OooOOOo.OooO0O0(objOooO0oO);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
    
        if (r5 == r4) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x035a -> B:112:0x0362). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo(C27387o0000o0 c27387o0000o0, File file, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27417o000o000 c27417o000o000;
        C27388OooO0Oo c27388OooO0OoOoooO0O;
        Object objOooOo00;
        C27387o0000o0 c27387o0000o02;
        Iterator it;
        String str2;
        C27417o000o000 c27417o000o0002;
        List list;
        C27388OooO0Oo c27388OooO0Oo;
        Object next;
        Iterator it2;
        C27417o000o000 c27417o000o0003;
        String str3;
        Object next2;
        C27388OooO0Oo c27388OooO0Oo2;
        C27387o0000o0 c27387o0000o03;
        String str4;
        Map map;
        Iterator<Map.Entry<String, List<Label>>> it3;
        Iterator it4;
        List list2;
        List<Label> list3;
        String str5;
        Iterator<Map.Entry<String, List<Label>>> it5;
        C27387o0000o0 c27387o0000o04;
        C27417o000o000 c27417o000o0004;
        String key;
        Map map2;
        Iterator it6;
        Iterator it7;
        C27417o000o000 c27417o000o0005;
        String str6;
        String str7;
        Iterator it8;
        Object next3;
        Iterator<Map.Entry<String, List<Label>>> it9;
        Object next4;
        C27387o0000o0 c27387o0000o05 = c27387o0000o0;
        String str8 = str;
        c27387o0000o05.getClass();
        if (abstractC32479OooO0OO instanceof C27417o000o000) {
            c27417o000o000 = (C27417o000o000) abstractC32479OooO0OO;
            int i = c27417o000o000.f95714Oooo00O;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27417o000o000.f95714Oooo00O = i - Integer.MIN_VALUE;
            } else {
                c27417o000o000 = new C27417o000o000(c27387o0000o05, abstractC32479OooO0OO);
            }
        }
        Object objOooOo002 = c27417o000o000.f95712OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27417o000o000.f95714Oooo00O;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooOo002);
                c27388OooO0OoOoooO0O = OoooO0O(file);
                if (c27388OooO0OoOoooO0O == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                C27808OooOOo c27808OooOOoOooO0O0 = c27387o0000o05.f95448OooOo0o.OooO0O0(str8);
                c27417o000o000.f95705OooOo0o = c27387o0000o05;
                c27417o000o000.f95704OooOo = str8;
                c27417o000o000.f95707OooOoO0 = c27388OooO0OoOoooO0O;
                c27417o000o000.f95714Oooo00O = 1;
                objOooOo00 = C25252OooO0Oo.OooOo00(c27808OooOOoOooO0O0, c27417o000o000);
                break;
                break;
            case 1:
                C27388OooO0Oo c27388OooO0Oo3 = (C27388OooO0Oo) c27417o000o000.f95707OooOoO0;
                str8 = c27417o000o000.f95704OooOo;
                C27387o0000o0 c27387o0000o06 = c27417o000o000.f95705OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo002);
                c27388OooO0OoOoooO0O = c27388OooO0Oo3;
                c27387o0000o05 = c27387o0000o06;
                objOooOo00 = objOooOo002;
                List list4 = (List) objOooOo00;
                if (list4 == null) {
                    list4 = c34434OooOoO;
                }
                List<Label> listOooO00o = c27388OooO0OoOoooO0O.OooO00o();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listOooO00o) {
                    Label label = (Label) obj;
                    Iterator it10 = list4.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next = it10.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(C33599OooOo0O.Oooooo0(((Label) next).getName()).toString(), C33599OooOo0O.Oooooo0(label.getName()).toString())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    if (next == null) {
                        arrayList.add(obj);
                    }
                }
                c27387o0000o02 = c27387o0000o05;
                it = arrayList.iterator();
                str2 = str8;
                c27417o000o0002 = c27417o000o000;
                list = list4;
                c27388OooO0Oo = c27388OooO0OoOoooO0O;
                while (it.hasNext()) {
                    Label label2 = (Label) it.next();
                    int value = LabelType.NOTE.getValue();
                    c27417o000o0002.f95705OooOo0o = c27387o0000o02;
                    c27417o000o0002.f95704OooOo = str2;
                    c27417o000o0002.f95707OooOoO0 = c27388OooO0Oo;
                    c27417o000o0002.f95706OooOoO = list;
                    c27417o000o0002.f95708OooOoOO = it;
                    c27417o000o0002.f95714Oooo00O = 2;
                    if (c27387o0000o02.Oooo0o(label2, str2, value, "", c27417o000o0002) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    Label label3 = (Label) obj2;
                    Iterator<T> it11 = c27388OooO0Oo.OooO00o().iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            next2 = it11.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(C33599OooOo0O.Oooooo0(((Label) next2).getName()).toString(), C33599OooOo0O.Oooooo0(label3.getName()).toString())) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    if (next2 == null) {
                        arrayList2.add(obj2);
                    }
                }
                it2 = arrayList2.iterator();
                c27417o000o0003 = c27417o000o0002;
                str3 = str2;
                while (true) {
                    if (!it2.hasNext()) {
                        o0OOOO00.OooOOO0 oooOOO0OooO0OO = c27387o0000o02.f95448OooOo0o.OooO0OO(str3, oOo000Oo.OooOo.o0ooOO0(c27388OooO0Oo.OooO0O0().keySet()));
                        c27417o000o0003.f95705OooOo0o = c27387o0000o02;
                        c27417o000o0003.f95704OooOo = str3;
                        c27417o000o0003.f95707OooOoO0 = c27388OooO0Oo;
                        c27417o000o0003.f95706OooOoO = null;
                        c27417o000o0003.f95708OooOoOO = null;
                        c27417o000o0003.f95714Oooo00O = 4;
                        objOooOo002 = C25252OooO0Oo.OooOo00(oooOOO0OooO0OO, c27417o000o0003);
                        if (objOooOo002 != enumC32485OooO00o) {
                            c27388OooO0Oo2 = c27388OooO0Oo;
                            c27387o0000o03 = c27387o0000o02;
                            str4 = str3;
                            c27417o000o000 = c27417o000o0003;
                        }
                        break;
                    } else {
                        Label label4 = (Label) it2.next();
                        C27799OooO0oO c27799OooO0oO = c27387o0000o02.f95450OooOoO0;
                        long id = label4.getId();
                        int value2 = LabelType.NOTE.getValue();
                        c27417o000o0003.f95705OooOo0o = c27387o0000o02;
                        c27417o000o0003.f95704OooOo = str3;
                        c27417o000o0003.f95707OooOoO0 = c27388OooO0Oo;
                        c27417o000o0003.f95706OooOoO = it2;
                        c27417o000o0003.f95708OooOoOO = null;
                        c27417o000o0003.f95714Oooo00O = 3;
                        if (c27799OooO0oO.OooO0O0(value2, id, str3, "", c27417o000o0003) == enumC32485OooO00o) {
                        }
                    }
                }
                return enumC32485OooO00o;
            case 2:
                it = (Iterator) c27417o000o000.f95708OooOoOO;
                list = (List) c27417o000o000.f95706OooOoO;
                c27388OooO0Oo = (C27388OooO0Oo) c27417o000o000.f95707OooOoO0;
                String str9 = c27417o000o000.f95704OooOo;
                C27387o0000o0 c27387o0000o07 = c27417o000o000.f95705OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo002);
                c27417o000o0002 = c27417o000o000;
                str2 = str9;
                c27387o0000o02 = c27387o0000o07;
                while (it.hasNext()) {
                }
                ArrayList arrayList22 = new ArrayList();
                while (r1.hasNext()) {
                }
                it2 = arrayList22.iterator();
                c27417o000o0003 = c27417o000o0002;
                str3 = str2;
                while (true) {
                    if (!it2.hasNext()) {
                    }
                }
                return enumC32485OooO00o;
            case 3:
                it2 = (Iterator) c27417o000o000.f95706OooOoO;
                C27388OooO0Oo c27388OooO0Oo4 = (C27388OooO0Oo) c27417o000o000.f95707OooOoO0;
                String str10 = c27417o000o000.f95704OooOo;
                c27387o0000o02 = c27417o000o000.f95705OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo002);
                c27417o000o0003 = c27417o000o000;
                str3 = str10;
                c27388OooO0Oo = c27388OooO0Oo4;
                while (true) {
                    if (!it2.hasNext()) {
                    }
                }
                return enumC32485OooO00o;
            case 4:
                c27388OooO0Oo2 = (C27388OooO0Oo) c27417o000o000.f95707OooOoO0;
                str4 = c27417o000o000.f95704OooOo;
                c27387o0000o03 = c27417o000o000.f95705OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo002);
                map = (Map) objOooOo002;
                if (map == null) {
                    map = C34436OooOoOO.f123455OooOo0o;
                }
                it3 = c27388OooO0Oo2.OooO0O0().entrySet().iterator();
                if (!it3.hasNext()) {
                    Map.Entry<String, List<Label>> next5 = it3.next();
                    key = next5.getKey();
                    List<Label> value3 = next5.getValue();
                    List list5 = (List) map.get(key);
                    if (list5 == null) {
                        list5 = c34434OooOoO;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : value3) {
                        Label label5 = (Label) obj3;
                        Iterator it12 = list5.iterator();
                        while (true) {
                            if (it12.hasNext()) {
                                next4 = it12.next();
                                it9 = it3;
                                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(C33599OooOo0O.Oooooo0(((Label) next4).getName()).toString(), C33599OooOo0O.Oooooo0(label5.getName()).toString())) {
                                    it3 = it9;
                                }
                            } else {
                                it9 = it3;
                                next4 = null;
                            }
                        }
                        if (next4 == null) {
                            arrayList3.add(obj3);
                        }
                        it3 = it9;
                    }
                    Iterator<Map.Entry<String, List<Label>>> it13 = it3;
                    it4 = arrayList3.iterator();
                    str5 = str4;
                    c27417o000o0004 = c27417o000o000;
                    c27387o0000o04 = c27387o0000o03;
                    list3 = value3;
                    list2 = list5;
                    map2 = map;
                    it5 = it13;
                    while (it4.hasNext()) {
                        Label label6 = (Label) it4.next();
                        int value4 = LabelType.PAGE.getValue();
                        c27417o000o0004.f95705OooOo0o = c27387o0000o04;
                        c27417o000o0004.f95704OooOo = str5;
                        c27417o000o0004.f95707OooOoO0 = map2;
                        c27417o000o0004.f95706OooOoO = it5;
                        c27417o000o0004.f95708OooOoOO = key;
                        c27417o000o0004.f95710OooOoo0 = list3;
                        c27417o000o0004.f95709OooOoo = list2;
                        c27417o000o0004.f95711OooOooO = it4;
                        c27417o000o0004.f95714Oooo00O = 5;
                        if (c27387o0000o04.Oooo0o(label6, key, value4, str5, c27417o000o0004) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    it6 = list2.iterator();
                    while (it6.hasNext()) {
                        Object next6 = it6.next();
                        Label label7 = (Label) next6;
                        Iterator<T> it14 = list3.iterator();
                        while (true) {
                            if (it14.hasNext()) {
                                next3 = it14.next();
                                it8 = it6;
                                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(C33599OooOo0O.Oooooo0(((Label) next3).getName()).toString(), C33599OooOo0O.Oooooo0(label7.getName()).toString())) {
                                    it6 = it8;
                                }
                            } else {
                                it8 = it6;
                                next3 = null;
                            }
                        }
                        if (next3 == null) {
                            arrayList4.add(next6);
                        }
                        it6 = it8;
                    }
                    it7 = arrayList4.iterator();
                    c27387o0000o03 = c27387o0000o04;
                    c27417o000o0005 = c27417o000o0004;
                    str6 = str5;
                    str7 = key;
                    while (it7.hasNext()) {
                        Label label8 = (Label) it7.next();
                        C27799OooO0oO c27799OooO0oO2 = c27387o0000o03.f95450OooOoO0;
                        long id2 = label8.getId();
                        int value5 = LabelType.PAGE.getValue();
                        c27417o000o0005.f95705OooOo0o = c27387o0000o03;
                        c27417o000o0005.f95704OooOo = str6;
                        c27417o000o0005.f95707OooOoO0 = map2;
                        c27417o000o0005.f95706OooOoO = it5;
                        c27417o000o0005.f95708OooOoOO = str7;
                        c27417o000o0005.f95710OooOoo0 = it7;
                        c27417o000o0005.f95709OooOoo = null;
                        c27417o000o0005.f95711OooOooO = null;
                        c27417o000o0005.f95714Oooo00O = 6;
                        if (c27799OooO0oO2.OooO0O0(value5, id2, str7, str6, c27417o000o0005) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    it3 = it5;
                    map = map2;
                    str4 = str6;
                    c27417o000o000 = c27417o000o0005;
                    if (!it3.hasNext()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                break;
            case 5:
                it4 = c27417o000o000.f95711OooOooO;
                list2 = c27417o000o000.f95709OooOoo;
                list3 = (List) c27417o000o000.f95710OooOoo0;
                String str11 = (String) c27417o000o000.f95708OooOoOO;
                Iterator<Map.Entry<String, List<Label>>> it15 = (Iterator) c27417o000o000.f95706OooOoO;
                Map map3 = (Map) c27417o000o000.f95707OooOoO0;
                str5 = c27417o000o000.f95704OooOo;
                C27387o0000o0 c27387o0000o08 = c27417o000o000.f95705OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo002);
                it5 = it15;
                c27387o0000o04 = c27387o0000o08;
                c27417o000o0004 = c27417o000o000;
                key = str11;
                map2 = map3;
                while (it4.hasNext()) {
                }
                ArrayList arrayList42 = new ArrayList();
                it6 = list2.iterator();
                while (it6.hasNext()) {
                }
                it7 = arrayList42.iterator();
                c27387o0000o03 = c27387o0000o04;
                c27417o000o0005 = c27417o000o0004;
                str6 = str5;
                str7 = key;
                while (it7.hasNext()) {
                }
                it3 = it5;
                map = map2;
                str4 = str6;
                c27417o000o000 = c27417o000o0005;
                if (!it3.hasNext()) {
                }
                break;
            case 6:
                it7 = (Iterator) c27417o000o000.f95710OooOoo0;
                String str12 = (String) c27417o000o000.f95708OooOoOO;
                Iterator<Map.Entry<String, List<Label>>> it16 = (Iterator) c27417o000o000.f95706OooOoO;
                Map map4 = (Map) c27417o000o000.f95707OooOoO0;
                String str13 = c27417o000o000.f95704OooOo;
                C27387o0000o0 c27387o0000o09 = c27417o000o000.f95705OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOo002);
                str7 = str12;
                c27417o000o0005 = c27417o000o000;
                it5 = it16;
                map2 = map4;
                str6 = str13;
                c27387o0000o03 = c27387o0000o09;
                while (it7.hasNext()) {
                }
                it3 = it5;
                map = map2;
                str4 = str6;
                c27417o000o000 = c27417o000o0005;
                if (!it3.hasNext()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(final C27387o0000o0 c27387o0000o0, final ArrayList arrayList, final String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27410o000OoOO c27410o000OoOO;
        ArrayList arrayList2;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof C27410o000OoOO) {
            c27410o000OoOO = (C27410o000OoOO) abstractC32479OooO0OO;
            int i = c27410o000OoOO.f95665OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27410o000OoOO.f95665OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27410o000OoOO = new C27410o000OoOO(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object obj = c27410o000OoOO.f95664OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27410o000OoOO.f95665OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: o0OOo0o.o0000OO
                @Override // oO0O000o.OooO00o
                public final Object invoke() throws C27387o0000o0.OooO0O0 {
                    for (File file : arrayList) {
                        String name = file.getName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                        String strOooOo0O = C33595OooOOo.OooOo0O(name, "note_database_", "");
                        File file2 = new File(c27387o0000o0.f95452OooOoo0.getDataDir() + "/databases/" + strOooOo0O);
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteInFileUseCase");
                        boolean zExists = file2.exists();
                        StringBuilder sb = new StringBuilder("restoreDatabaseFiles: restoring database file, noteId: ");
                        OooOO0.OooO0OO.OooO0o0(sb, str, ", dstFile: ", strOooOo0O, ", existed: ");
                        sb.append(zExists);
                        c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
                        int i3 = Build.VERSION.SDK_INT;
                        c20358OooO00o.OooO00o(C21532OooOOo.OooO0OO(i3, "moveFileSafelyBySDKVersion, sdk version: "), new Object[0]);
                        boolean zOooooO0 = i3 <= 29 ? C27387o0000o0.OooooO0(file, file2) : C27387o0000o0.OoooOo0(file, file2);
                        c20358OooO00o.OooOOO0("NoteInFileUseCase");
                        String name2 = file.getName();
                        String strOooO0OO = file2.exists() ? C31430OooO00o.OooO0OO(file2.length()) : "0B";
                        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("restoreDatabaseFiles: copy ", name2, " -> ", strOooOo0O, ", result=");
                        sbOooO0O0.append(zOooooO0);
                        sbOooO0O0.append(", size=");
                        sbOooO0O0.append(strOooO0OO);
                        c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                        if (!zOooooO0) {
                            throw new C27387o0000o0.OooO0O0(LoginErrorCode.ERROR_CODE_CAN_NOT_UNBIND_ACCOUNT, "copy db file failed, srcFile: " + file + ", dstFile: " + file2);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            };
            c27410o000OoOO.f95662OooOo0o = c27387o0000o0;
            c27410o000OoOO.f95661OooOo = str;
            c27410o000OoOO.f95665OooOoOO = 1;
            C26454OooO0Oo c26454OooO0Oo = c27387o0000o0.f95446OooOo00;
            ReentrantReadWriteLock reentrantReadWriteLock = c26454OooO0Oo.f90923OooO0o0;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                ReentrantReadWriteLock reentrantReadWriteLock2 = c26454OooO0Oo.f90922OooO0Oo;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
                int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i4 = 0; i4 < readHoldCount2; i4++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    NoteContentDatabase noteContentDatabaseRemove = c26454OooO0Oo.f90921OooO0OO.remove(str);
                    if (noteContentDatabaseRemove != null) {
                        noteContentDatabaseRemove.OooO0Oo();
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                    for (int i5 = 0; i5 < readHoldCount2; i5++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                    oooO00o.invoke();
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    for (int i6 = 0; i6 < readHoldCount; i6++) {
                        lock.lock();
                    }
                    writeLock.unlock();
                    if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } catch (Throwable th) {
                    for (int i7 = 0; i7 < readHoldCount2; i7++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                for (int i8 = 0; i8 < readHoldCount; i8++) {
                    lock.lock();
                }
                writeLock.unlock();
                throw th2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c27410o000OoOO.f95661OooOo;
            c27387o0000o0 = c27410o000OoOO.f95662OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        File[] fileArrListFiles = new File(c27387o0000o0.f95452OooOoo0.getDataDir() + "/databases").listFiles();
        if (fileArrListFiles != null) {
            arrayList2 = new ArrayList();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                if (C33599OooOo0O.OooOoOO(name, str, false)) {
                    arrayList2.add(file);
                }
            }
        } else {
            arrayList2 = null;
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteInFileUseCase", "restoreDatabaseFiles: FAILED - noteId: ", str, ", no database files found in databases directory after restore!"), new Object[0]);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInFileUseCase");
            int size = arrayList3.size();
            String strO000oOoO = oOo000Oo.OooOo.o000oOoO(arrayList3, null, null, null, new C26305OooooO0(1), 31);
            StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(size, "restoreDatabaseFiles: noteId: ", str, ", verified ", " files restored: ");
            sbOooO0OO.append(strO000oOoO);
            c20358OooO00o2.OooO0o0(sbOooO0OO.toString(), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x02eb, code lost:
    
        if (r2.OooOOOO(r6, r3) == r4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x034a, code lost:
    
        if (r2 != r4) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x038a  */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.io.File[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x03f0 -> B:115:0x042d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0429 -> B:114:0x042b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0299 -> B:77:0x02ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x02eb -> B:77:0x02ef). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOooO(C27387o0000o0 c27387o0000o0, File[] fileArr, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws OooO0O0 {
        C27416o000o00 c27416o000o00;
        Object objOoooO00;
        String str2;
        ?? r1;
        Object objOooOO0;
        C27387o0000o0 c27387o0000o02;
        List list;
        ?? r5;
        String str3;
        int length;
        int i;
        List list2;
        String str4;
        Iterator it;
        ?? r15;
        File file;
        List list3;
        File file2;
        String str5;
        ?? r152;
        File file3;
        Iterator it2;
        File file4;
        List list4;
        C27387o0000o0 c27387o0000o03;
        Iterator it3;
        Object obj;
        DualLinkRef dualLinkRef;
        ?? r153;
        String str6;
        C27387o0000o0 c27387o0000o04;
        String str7;
        ?? r52;
        Object obj2;
        ?? r154;
        List list5;
        ?? r53;
        String str8;
        Iterator it4;
        String str9;
        File file5;
        List list6;
        String str10;
        Object obj3;
        Iterator it5;
        List list7;
        C27387o0000o0 c27387o0000o05 = c27387o0000o0;
        c27387o0000o05.getClass();
        if (abstractC32479OooO0OO instanceof C27416o000o00) {
            c27416o000o00 = (C27416o000o00) abstractC32479OooO0OO;
            int i2 = c27416o000o00.f95703Oooo00O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27416o000o00.f95703Oooo00O = i2 - Integer.MIN_VALUE;
            } else {
                c27416o000o00 = new C27416o000o00(c27387o0000o05, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27416o000o00.f95701OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        String str11 = "note_audio_";
        switch (c27416o000o00.f95703Oooo00O) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO00o);
                c27416o000o00.f95694OooOo0o = c27387o0000o05;
                c27416o000o00.f95693OooOo = fileArr;
                c27416o000o00.f95696OooOoO0 = str;
                c27416o000o00.f95703Oooo00O = 1;
                objOoooO00 = c27387o0000o05.OoooO00(str, c27416o000o00);
                if (objOoooO00 != enumC32485OooO00o) {
                    str2 = str;
                    r1 = fileArr;
                    List list8 = (List) objOoooO00;
                    c27416o000o00.f95694OooOo0o = c27387o0000o05;
                    c27416o000o00.f95693OooOo = r1;
                    c27416o000o00.f95696OooOoO0 = str2;
                    c27416o000o00.f95695OooOoO = list8;
                    c27416o000o00.f95703Oooo00O = 2;
                    objOooOO0 = c27387o0000o05.f95440OooOOOo.OooOO0(str2, c27416o000o00);
                    if (objOooOO0 != enumC32485OooO00o) {
                        c27387o0000o02 = c27387o0000o05;
                        list = list8;
                        r5 = r1;
                        str3 = str2;
                        objOooO00o = objOooOO0;
                        List list9 = (List) objOooO00o;
                        File fileOooO = c27387o0000o02.f95436OooOO0o.OooO(str3);
                        ArrayList arrayList = new ArrayList();
                        length = r5.length;
                        i = 0;
                        while (i < length) {
                            List list10 = list;
                            ?? r0 = r5[i];
                            String str12 = str3;
                            String name = r0.getName();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                            List list11 = list9;
                            if (C33595OooOOo.OooOoO0(name, "note_image_", false)) {
                                arrayList.add(r0);
                            }
                            i++;
                            list = list10;
                            str3 = str12;
                            list9 = list11;
                        }
                        List list12 = list;
                        Iterator it6 = arrayList.iterator();
                        list2 = list12;
                        str4 = str3;
                        it = it6;
                        r15 = r5;
                        file = fileOooO;
                        list3 = list9;
                        if (!it.hasNext()) {
                            File file6 = (File) it.next();
                            str5 = str11;
                            String name2 = file6.getName();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                            file3 = new File(file, C33599OooOo0O.OoooO0(name2, "note_image_"));
                            c27387o0000o02.getClass();
                            if (!OoooOo0(file6, file3)) {
                                throw new OooO0O0("10005", "copy image file failed, srcFile: " + file6 + ", dstFile: " + file3);
                            }
                            Iterator it7 = list2.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    Object next = it7.next();
                                    Image image = (Image) next;
                                    Iterator it8 = it7;
                                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(new File(image.getUri()).getName(), file3.getName()) || kotlin.jvm.internal.OooOOO0.OooO0O0(image.getUri(), file3.getAbsolutePath())) {
                                        it7 = it8;
                                    } else {
                                        obj2 = next;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            Image image2 = (Image) obj2;
                            r152 = r15;
                            if (image2 != null) {
                                String absolutePath = file3.getAbsolutePath();
                                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(Image.copy$default(image2, null, null, absolutePath, null, null, 0.0f, 0L, 0L, false, 507, null));
                                c27416o000o00.f95694OooOo0o = c27387o0000o02;
                                c27416o000o00.f95693OooOo = r15;
                                c27416o000o00.f95696OooOoO0 = str4;
                                c27416o000o00.f95695OooOoO = list2;
                                c27416o000o00.f95697OooOoOO = list3;
                                c27416o000o00.f95699OooOoo0 = file;
                                c27416o000o00.f95698OooOoo = it;
                                c27416o000o00.f95700OooOooO = file3;
                                c27416o000o00.f95703Oooo00O = 3;
                                if (c27387o0000o02.f95436OooOO0o.OooOOoo(str4, listOooO0oO, c27416o000o00) != enumC32485OooO00o) {
                                    file2 = file3;
                                    r153 = r15;
                                    file3 = file2;
                                    r152 = r153;
                                    it2 = it;
                                    file4 = file;
                                    list4 = list3;
                                    c27387o0000o03 = c27387o0000o02;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj4 : list4) {
                                        File file7 = file3;
                                        if (((DualLinkRef) obj4).getItem() != null) {
                                            arrayList2.add(obj4);
                                        }
                                        file3 = file7;
                                    }
                                    File file8 = file3;
                                    it3 = arrayList2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            Object next2 = it3.next();
                                            DualLinkRef dualLinkRef2 = (DualLinkRef) next2;
                                            Iterator it9 = it3;
                                            Image item = dualLinkRef2.getItem();
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(item);
                                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(new File(item.getUri()).getName(), file8.getName())) {
                                                Image item2 = dualLinkRef2.getItem();
                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(item2);
                                                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(item2.getUri(), file8.getAbsolutePath())) {
                                                    obj = next2;
                                                }
                                            }
                                            it3 = it9;
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    dualLinkRef = (DualLinkRef) obj;
                                    r154 = r152;
                                    if (dualLinkRef != null) {
                                        C26515OooooO0 c26515OooooO0 = c27387o0000o03.f95440OooOOOo;
                                        Image item3 = dualLinkRef.getItem();
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(item3);
                                        String absolutePath2 = file8.getAbsolutePath();
                                        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
                                        DualLinkRef dualLinkRefCopy$default = DualLinkRef.copy$default(dualLinkRef, null, null, null, null, Image.copy$default(item3, null, null, absolutePath2, null, null, 0.0f, 0L, 0L, false, 507, null), null, false, 0L, 0L, 495, null);
                                        c27416o000o00.f95694OooOo0o = c27387o0000o03;
                                        c27416o000o00.f95693OooOo = r152;
                                        c27416o000o00.f95696OooOoO0 = str4;
                                        c27416o000o00.f95695OooOoO = list2;
                                        c27416o000o00.f95697OooOoOO = list4;
                                        c27416o000o00.f95699OooOoo0 = file4;
                                        c27416o000o00.f95698OooOoo = it2;
                                        c27416o000o00.f95700OooOooO = null;
                                        c27416o000o00.f95703Oooo00O = 4;
                                        r154 = r152;
                                    }
                                    c27387o0000o02 = c27387o0000o03;
                                    list3 = list4;
                                    file = file4;
                                    it = it2;
                                    str11 = str5;
                                    r15 = r154;
                                    if (!it.hasNext()) {
                                        str6 = str11;
                                        c27416o000o00.f95694OooOo0o = c27387o0000o02;
                                        c27416o000o00.f95693OooOo = r15;
                                        c27416o000o00.f95696OooOoO0 = str4;
                                        c27416o000o00.f95695OooOoO = null;
                                        c27416o000o00.f95697OooOoOO = null;
                                        c27416o000o00.f95699OooOoo0 = null;
                                        c27416o000o00.f95698OooOoo = null;
                                        c27416o000o00.f95700OooOooO = null;
                                        c27416o000o00.f95703Oooo00O = 5;
                                        objOooO00o = c27387o0000o02.f95443OooOOoo.OooO00o(str4, c27416o000o00);
                                        if (objOooO00o != enumC32485OooO00o) {
                                            c27387o0000o04 = c27387o0000o02;
                                            str7 = str4;
                                            r52 = r15;
                                            list5 = (List) objOooO00o;
                                            InterfaceC27292OooO0oO interfaceC27292OooO0oO = c27387o0000o04.f95443OooOOoo;
                                            c27416o000o00.f95694OooOo0o = c27387o0000o04;
                                            c27416o000o00.f95693OooOo = r52;
                                            c27416o000o00.f95696OooOoO0 = str7;
                                            c27416o000o00.f95695OooOoO = list5;
                                            c27416o000o00.f95703Oooo00O = 6;
                                            objOooO00o = interfaceC27292OooO0oO.OooOOOo(str7, c27416o000o00);
                                            r53 = r52;
                                        }
                                        break;
                                    }
                                }
                                break;
                            } else {
                                it2 = it;
                                file4 = file;
                                list4 = list3;
                                c27387o0000o03 = c27387o0000o02;
                                ArrayList arrayList22 = new ArrayList();
                                while (r6.hasNext()) {
                                }
                                File file82 = file3;
                                it3 = arrayList22.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                    }
                                    it3 = it9;
                                }
                                dualLinkRef = (DualLinkRef) obj;
                                r154 = r152;
                                if (dualLinkRef != null) {
                                }
                                c27387o0000o02 = c27387o0000o03;
                                list3 = list4;
                                file = file4;
                                it = it2;
                                str11 = str5;
                                r15 = r154;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                String str13 = (String) c27416o000o00.f95696OooOoO0;
                File[] fileArr2 = (File[]) c27416o000o00.f95693OooOo;
                C27387o0000o0 c27387o0000o06 = c27416o000o00.f95694OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                str2 = str13;
                c27387o0000o05 = c27387o0000o06;
                objOoooO00 = objOooO00o;
                r1 = fileArr2;
                List list82 = (List) objOoooO00;
                c27416o000o00.f95694OooOo0o = c27387o0000o05;
                c27416o000o00.f95693OooOo = r1;
                c27416o000o00.f95696OooOoO0 = str2;
                c27416o000o00.f95695OooOoO = list82;
                c27416o000o00.f95703Oooo00O = 2;
                objOooOO0 = c27387o0000o05.f95440OooOOOo.OooOO0(str2, c27416o000o00);
                if (objOooOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                list = (List) c27416o000o00.f95695OooOoO;
                str3 = (String) c27416o000o00.f95696OooOoO0;
                File[] fileArr3 = (File[]) c27416o000o00.f95693OooOo;
                c27387o0000o02 = c27416o000o00.f95694OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                r5 = fileArr3;
                List list92 = (List) objOooO00o;
                File fileOooO2 = c27387o0000o02.f95436OooOO0o.OooO(str3);
                ArrayList arrayList3 = new ArrayList();
                length = r5.length;
                i = 0;
                while (i < length) {
                }
                List list122 = list;
                Iterator it62 = arrayList3.iterator();
                list2 = list122;
                str4 = str3;
                it = it62;
                r15 = r5;
                file = fileOooO2;
                list3 = list92;
                if (!it.hasNext()) {
                }
                return enumC32485OooO00o;
            case 3:
                file2 = c27416o000o00.f95700OooOooO;
                it = c27416o000o00.f95698OooOoo;
                file = c27416o000o00.f95699OooOoo0;
                list3 = (List) c27416o000o00.f95697OooOoOO;
                list2 = (List) c27416o000o00.f95695OooOoO;
                str4 = (String) c27416o000o00.f95696OooOoO0;
                File[] fileArr4 = (File[]) c27416o000o00.f95693OooOo;
                c27387o0000o02 = c27416o000o00.f95694OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                str5 = "note_audio_";
                r153 = fileArr4;
                file3 = file2;
                r152 = r153;
                it2 = it;
                file4 = file;
                list4 = list3;
                c27387o0000o03 = c27387o0000o02;
                ArrayList arrayList222 = new ArrayList();
                while (r6.hasNext()) {
                }
                File file822 = file3;
                it3 = arrayList222.iterator();
                while (true) {
                    if (it3.hasNext()) {
                    }
                    it3 = it9;
                }
                dualLinkRef = (DualLinkRef) obj;
                r154 = r152;
                if (dualLinkRef != null) {
                }
                c27387o0000o02 = c27387o0000o03;
                list3 = list4;
                file = file4;
                it = it2;
                str11 = str5;
                r15 = r154;
                if (!it.hasNext()) {
                }
                return enumC32485OooO00o;
            case 4:
                it2 = c27416o000o00.f95698OooOoo;
                file4 = c27416o000o00.f95699OooOoo0;
                list4 = (List) c27416o000o00.f95697OooOoOO;
                list2 = (List) c27416o000o00.f95695OooOoO;
                str4 = (String) c27416o000o00.f95696OooOoO0;
                File[] fileArr5 = (File[]) c27416o000o00.f95693OooOo;
                c27387o0000o03 = c27416o000o00.f95694OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                str5 = "note_audio_";
                r154 = fileArr5;
                c27387o0000o02 = c27387o0000o03;
                list3 = list4;
                file = file4;
                it = it2;
                str11 = str5;
                r15 = r154;
                if (!it.hasNext()) {
                }
                return enumC32485OooO00o;
            case 5:
                String str14 = (String) c27416o000o00.f95696OooOoO0;
                File[] fileArr6 = (File[]) c27416o000o00.f95693OooOo;
                C27387o0000o0 c27387o0000o07 = c27416o000o00.f95694OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                c27387o0000o04 = c27387o0000o07;
                str6 = "note_audio_";
                r52 = fileArr6;
                str7 = str14;
                list5 = (List) objOooO00o;
                InterfaceC27292OooO0oO interfaceC27292OooO0oO2 = c27387o0000o04.f95443OooOOoo;
                c27416o000o00.f95694OooOo0o = c27387o0000o04;
                c27416o000o00.f95693OooOo = r52;
                c27416o000o00.f95696OooOoO0 = str7;
                c27416o000o00.f95695OooOoO = list5;
                c27416o000o00.f95703Oooo00O = 6;
                objOooO00o = interfaceC27292OooO0oO2.OooOOOo(str7, c27416o000o00);
                r53 = r52;
                break;
            case 6:
                list5 = (List) c27416o000o00.f95695OooOoO;
                str7 = (String) c27416o000o00.f95696OooOoO0;
                File[] fileArr7 = (File[]) c27416o000o00.f95693OooOo;
                c27387o0000o04 = c27416o000o00.f95694OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                str6 = "note_audio_";
                r53 = fileArr7;
                File file9 = (File) objOooO00o;
                ArrayList arrayList4 = new ArrayList();
                int length2 = r53.length;
                int i3 = 0;
                while (i3 < length2) {
                    ?? r14 = r53[i3];
                    String name3 = r14.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name3, "getName(...)");
                    List list13 = list5;
                    String str15 = str6;
                    if (C33595OooOOo.OooOoO0(name3, str15, false)) {
                        arrayList4.add(r14);
                    }
                    i3++;
                    str6 = str15;
                    list5 = list13;
                }
                List list14 = list5;
                str8 = str6;
                it4 = arrayList4.iterator();
                str9 = str7;
                file5 = file9;
                list6 = list14;
                if (it4.hasNext()) {
                    File file10 = (File) it4.next();
                    String name4 = file10.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name4, "getName(...)");
                    File file11 = new File(file5, C33599OooOo0O.OoooO0(name4, str8));
                    c27387o0000o04.getClass();
                    if (!OoooOo0(file10, file11)) {
                        throw new OooO0O0(PerfConstants.CodeMarkerConstants.ACQUIRE_TOKEN_DCF_COMMAND_EXECUTION_START, "copy audio file failed, srcFile: " + file10 + ", dstFile: " + file11);
                    }
                    Iterator it10 = list6.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            Object next3 = it10.next();
                            AudioFile audioFile = (AudioFile) next3;
                            str10 = str8;
                            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(new File(audioFile.getFilePath()).getName(), file11.getName()) || kotlin.jvm.internal.OooOOO0.OooO0O0(audioFile.getFilePath(), file11.getAbsolutePath())) {
                                str8 = str10;
                            } else {
                                obj3 = next3;
                            }
                        } else {
                            str10 = str8;
                            obj3 = null;
                        }
                    }
                    AudioFile audioFile2 = (AudioFile) obj3;
                    if (audioFile2 != null) {
                        String absolutePath3 = file11.getAbsolutePath();
                        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath3, "getAbsolutePath(...)");
                        List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(AudioFile.copy$default(audioFile2, null, absolutePath3, null, 0L, 0.0f, 0L, 0L, 125, null));
                        c27416o000o00.f95694OooOo0o = c27387o0000o04;
                        c27416o000o00.f95693OooOo = str9;
                        c27416o000o00.f95696OooOoO0 = list6;
                        c27416o000o00.f95695OooOoO = file5;
                        c27416o000o00.f95697OooOoOO = it4;
                        c27416o000o00.f95703Oooo00O = 7;
                        if (c27387o0000o04.f95443OooOOoo.OooOO0(str9, listOooO0oO2, c27416o000o00) != enumC32485OooO00o) {
                            it5 = it4;
                            list7 = list6;
                            list6 = list7;
                            it4 = it5;
                        }
                        return enumC32485OooO00o;
                    }
                    str8 = str10;
                    if (it4.hasNext()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                break;
            case 7:
                it5 = (Iterator) c27416o000o00.f95697OooOoOO;
                file5 = (File) c27416o000o00.f95695OooOoO;
                list7 = (List) c27416o000o00.f95696OooOoO0;
                str9 = (String) c27416o000o00.f95693OooOo;
                c27387o0000o04 = c27416o000o00.f95694OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                str10 = "note_audio_";
                list6 = list7;
                it4 = it5;
                str8 = str10;
                if (it4.hasNext()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:29:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOooo(C27387o0000o0 c27387o0000o0, File[] fileArr, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws OooO0O0 {
        C27421o000o0O0 c27421o000o0O0;
        Iterator it;
        String str2;
        C24030OooOoo c24030OooOoo;
        File file;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof C27421o000o0O0) {
            c27421o000o0O0 = (C27421o000o0O0) abstractC32479OooO0OO;
            int i = c27421o000o0O0.f95751OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27421o000o0O0.f95751OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27421o000o0O0 = new C27421o000o0O0(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object obj = c27421o000o0O0.f95750OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27421o000o0O0.f95751OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24030OooOoo c24030OooOoo2 = new C24030OooOoo();
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArr) {
                String name = file2.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                if (C33595OooOOo.OooOoO0(name, "note_pdf_", false)) {
                    String name2 = file2.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                    if (!C33595OooOOo.OooOoO0(name2, "note_pdf_set_uri_theme_", false)) {
                        arrayList.add(file2);
                    }
                }
            }
            it = arrayList.iterator();
            str2 = str;
            c24030OooOoo = c24030OooOoo2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            File file3 = c27421o000o0O0.f95748OooOoOO;
            it = c27421o000o0O0.f95746OooOoO;
            c24030OooOoo = c27421o000o0O0.f95747OooOoO0;
            String str3 = c27421o000o0O0.f95744OooOo;
            C27387o0000o0 c27387o0000o02 = c27421o000o0O0.f95745OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            File file4 = file3;
            c27387o0000o0 = c27387o0000o02;
            C27421o000o0O0 c27421o000o0O02 = c27421o000o0O0;
            String str4 = str3;
            String str5 = (String) obj;
            if (str5 != null && str5.length() != 0) {
                c24030OooOoo.f80938OooOo0o = true;
                file = new File(str5);
                c27387o0000o0.getClass();
                if (!Oooo0OO(file4, file)) {
                    throw new OooO0O0("10002", "copy pdf file failed, srcFile: " + file4 + ", dstFile: " + str5);
                }
            }
            str2 = str4;
            c27421o000o0O0 = c27421o000o0O02;
            if (it.hasNext()) {
                file4 = (File) it.next();
                c27421o000o0O0.f95745OooOo0o = c27387o0000o0;
                c27421o000o0O0.f95744OooOo = str2;
                c27421o000o0O0.f95747OooOoO0 = c24030OooOoo;
                c27421o000o0O0.f95746OooOoO = it;
                c27421o000o0O0.f95748OooOoOO = file4;
                c27421o000o0O0.f95751OooOooO = 1;
                Object objOoooOO0 = c27387o0000o0.OoooOO0(str2, c27421o000o0O0);
                if (objOoooOO0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                C27421o000o0O0 c27421o000o0O03 = c27421o000o0O0;
                str4 = str2;
                obj = objOoooOO0;
                c27421o000o0O02 = c27421o000o0O03;
                String str52 = (String) obj;
                if (str52 != null) {
                    c24030OooOoo.f80938OooOo0o = true;
                    file = new File(str52);
                    c27387o0000o0.getClass();
                    if (!Oooo0OO(file4, file)) {
                    }
                }
                str2 = str4;
                c27421o000o0O0 = c27421o000o0O02;
                if (it.hasNext()) {
                    return Boolean.valueOf(c24030OooOoo.f80938OooOo0o);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Oooo0(C27387o0000o0 c27387o0000o0, Uri uri, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27422o000o0OO c27422o000o0OO;
        String str2;
        Uri uri2 = uri;
        c27387o0000o0.getClass();
        if (abstractC32479OooO0OO instanceof C27422o000o0OO) {
            c27422o000o0OO = (C27422o000o0OO) abstractC32479OooO0OO;
            int i = c27422o000o0OO.f95756OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27422o000o0OO.f95756OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27422o000o0OO = new C27422o000o0OO(c27387o0000o0, abstractC32479OooO0OO);
            }
        }
        Object obj = c27422o000o0OO.f95755OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27422o000o0OO.f95756OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27422o000o0OO.f95753OooOo0o = uri2;
            c27422o000o0OO.f95752OooOo = str;
            c27422o000o0OO.f95756OooOoOO = 1;
            Object objOooo = c27387o0000o0.Oooo(uri2, c27422o000o0OO);
            if (objOooo == obj2) {
                return obj2;
            }
            obj = objOooo;
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c27422o000o0OO.f95752OooOo;
            uri2 = c27422o000o0OO.f95753OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        File file = (File) obj;
        if (file == null) {
            throw new OooO0O0("10007", C21559Oooo0oO.OooO00o(uri2, "unzip src uri failed. srcUri: "));
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        File[] fileArr = fileArrListFiles;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteInFileUseCase");
        c20358OooO00o.OooO0o0(C22237OooO0o0.OooO00o("restoreNoteByNoteFile, noteId: ", str2, ", unzippedFiles: ", oOo000Oo.OooOOO.Oooo0O0(fileArr, null, null, null, new C22976OooO0Oo(2), 31)), new Object[0]);
        for (File file2 : fileArr) {
            String name = file2.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
            if (C33595OooOOo.OooOoO0(name, "note_database_", false)) {
                ArrayList arrayList = new ArrayList();
                for (File file3 : fileArr) {
                    String name2 = file3.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                    if (C33595OooOOo.OooOoO0(name2, "note_database_", false)) {
                        String name3 = file3.getName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(name3, "getName(...)");
                        if (C33599OooOo0O.OooOoOO(name3, str2, false)) {
                            arrayList.add(file3);
                        }
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteInFileUseCase");
                c20358OooO00o2.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList.size(), "restoreNoteByNoteFile: filtered ", " database files: ", oOo000Oo.OooOo.o000oOoO(arrayList, null, null, null, new C22977OooO0o0(1), 31)), new Object[0]);
                return new OooO0o(file, fileArr, arrayList);
            }
        }
        throw new OooO0O0("10001", "The target file is not a valid notein file.");
    }

    public static final void Oooo000(C27387o0000o0 c27387o0000o0, File[] fileArr) throws OooO0O0 {
        File file;
        File file2;
        c27387o0000o0.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file3 : fileArr) {
            String name = file3.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
            if (C33595OooOOo.OooOoO0(name, "note_local_uri_theme_", false)) {
                arrayList.add(file3);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            boolean zHasNext = it.hasNext();
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c27387o0000o0.f95452OooOoo0;
            if (!zHasNext) {
                ArrayList<File> arrayList2 = new ArrayList();
                for (File file4 : fileArr) {
                    String name2 = file4.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                    if (C33595OooOOo.OooOoO0(name2, "note_pdf_set_uri_theme_", false)) {
                        arrayList2.add(file4);
                    }
                }
                for (File file5 : arrayList2) {
                    File file6 = new File(abstractApplicationC26277OooOoOO.getFilesDir(), "theme");
                    String name3 = file5.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name3, "getName(...)");
                    File file7 = new File(file6, C33599OooOo0O.OoooO0(name3, "note_pdf_set_uri_theme_"));
                    if (!Oooo0OO(file5, file7)) {
                        throw new OooO0O0(NoteFile.ERROR_NOT_WIFI, "copy pdfSetUri file failed, srcFile: " + file5 + ", dstFile: " + file7);
                    }
                }
                return;
            }
            file = (File) it.next();
            File file8 = new File(abstractApplicationC26277OooOoOO.getFilesDir(), "documents");
            String name4 = file.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name4, "getName(...)");
            file2 = new File(file8, C33599OooOo0O.OoooO0(name4, "note_local_uri_theme_"));
        } while (Oooo0OO(file, file2));
        throw new OooO0O0(NoteFile.ERROR_REMOTE_HAS_CONFLICT_WITH_LOCAL, "copy paperLocalUri file failed, srcFile: " + file + ", dstFile: " + file2);
    }

    public static final long Oooo00O(C27387o0000o0 c27387o0000o0, Collection collection) {
        c27387o0000o0.getClass();
        Iterator it = collection.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += ((File) it.next()).length();
        }
        return length;
    }

    public static final /* synthetic */ boolean Oooo00o(C27387o0000o0 c27387o0000o0, File file, File file2) {
        c27387o0000o0.getClass();
        return OooooO0(file, file2);
    }

    public static void Oooo0O0(C27387o0000o0 c27387o0000o0) {
        c27387o0000o0.getClass();
        File file = new File(c27387o0000o0.f95452OooOoo0.getFilesDir(), "cloud_sync");
        if (file.exists()) {
            final long j = C18250l0.g.f55493g;
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: o0OOo0o.o0000OO0
                @Override // oO0O000o.InterfaceC32507OooOO0o
                public final Object invoke(Object obj) {
                    File dir = (File) obj;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(dir, "dir");
                    for (File file2 : C31190OooO0oo.OooOo00(dir, false)) {
                        ArrayList arrayListOooOo00 = C31190OooO0oo.OooOo00(file2, false);
                        boolean zIsEmpty = arrayListOooOo00.isEmpty();
                        long j2 = j;
                        if (zIsEmpty) {
                            C34406OooO00o.f123390OooO00o.OooO00o("clearExpiredFiles, dirWithId is empty, delete it: " + file2 + ", " + file2.lastModified() + "}", new Object[0]);
                            if (System.currentTimeMillis() - file2.lastModified() > j2) {
                                C31190OooO0oo.OooO0oo(file2);
                            }
                        } else {
                            Iterator it = arrayListOooOo00.iterator();
                            if (!it.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            long jLastModified = ((File) it.next()).lastModified();
                            while (it.hasNext()) {
                                long jLastModified2 = ((File) it.next()).lastModified();
                                if (jLastModified < jLastModified2) {
                                    jLastModified = jLastModified2;
                                }
                            }
                            if (System.currentTimeMillis() - jLastModified > j2) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                long jLastModified3 = file2.lastModified();
                                StringBuilder sb = new StringBuilder("clearExpiredFiles, dirWithId lastModified: ");
                                sb.append(jLastModified);
                                sb.append(", delete it: ");
                                sb.append(file2);
                                c20358OooO00o.OooO00o(com.facebook.soloader.OooO0OO.OooO00o(jLastModified3, ", ", "}", sb), new Object[0]);
                                C31190OooO0oo.OooO0oo(file2);
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            };
            File file2 = new File(file, "download");
            if (file2.exists()) {
                interfaceC32507OooOO0o.invoke(file2);
            }
            File file3 = new File(file, "upload");
            if (file3.exists()) {
                interfaceC32507OooOO0o.invoke(file3);
            }
            File file4 = new File(file, "unzip");
            if (file4.exists()) {
                interfaceC32507OooOO0o.invoke(file4);
            }
        }
    }

    public static boolean Oooo0OO(File file, File file2) {
        if (file2.exists() && C31190OooO0oo.OooOOO(file).equals(C31190OooO0oo.OooOOO(file2))) {
            return true;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            C31190OooO0oo.OooO0o(parentFile);
        }
        return OoooOo0(file, file2);
    }

    public static Object Oooo0oO(C27387o0000o0 c27387o0000o0, String str, OooO0OO oooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO, int i) {
        if ((i & 2) != 0) {
            boolean z = false;
            oooO0OO = new OooO0OO(31, z, z, z);
        }
        OooO0OO oooO0OO2 = oooO0OO;
        c27387o0000o0.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000(c27387o0000o0, str, null, oooO0OO2, null), abstractC32479OooO0OO);
    }

    public static File Oooo0oo(String str) {
        if (str.length() == 0) {
            return null;
        }
        File file = new File(str);
        if (C31190OooO0oo.OooOOo(file)) {
            return file;
        }
        return null;
    }

    public static Set OoooO(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaperTheme paperTheme = ((Page) it.next()).getPaperTheme();
            String uri = paperTheme instanceof LocalUriPaperTheme ? ((LocalUriPaperTheme) paperTheme).getUri() : paperTheme instanceof PdfPaperTheme ? ((PdfPaperTheme) paperTheme).getPdfInfo().getPdfPath() : null;
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        return oOo000Oo.OooOo.o0OO00O(arrayList);
    }

    public static C27388OooO0Oo OoooO0O(File file) {
        try {
            return (C27388OooO0Oo) C28028OooO0o.OooO00o().fromJson(C32501OooO0oO.OooO0oo(file), C27388OooO0Oo.class);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooO0Oo(e, "getNoteLabelInfoByFile failed.", new Object[0]);
            return null;
        }
    }

    public static boolean OoooOo0(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
            return true;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooO0Oo(e, "moveFileSafely failed", new Object[0]);
            return false;
        }
    }

    public static boolean OooooO0(File file, File file2) throws IOException {
        try {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(file.getAbsolutePath(), file2.getAbsolutePath())) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteInFileUseCase");
                c20358OooO00o.OooOO0O("transferFile skipped, src and dst are same file: " + file.getAbsolutePath(), new Object[0]);
                return false;
            }
            if (!C31190OooO0oo.OooO0oO(file2)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteInFileUseCase");
                c20358OooO00o2.OooO0OO("transferFile failed, cannot create dst file: " + file2, new Object[0]);
                return false;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    FileChannel channel2 = fileOutputStream.getChannel();
                    long size = channel.size();
                    long j = 0;
                    while (j < size) {
                        long jTransferFrom = channel2.transferFrom(channel, j, size - j);
                        if (jTransferFrom <= 0) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("NoteInFileUseCase");
                            c20358OooO00o3.OooO0OO("transferFile stalled, src: " + file + ", dst: " + file2 + ", position: " + j + ", size: " + size, new Object[0]);
                            fileOutputStream.close();
                            fileInputStream.close();
                            return false;
                        }
                        j += jTransferFrom;
                    }
                    channel2.force(true);
                    if (channel2.size() == size) {
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        fileOutputStream.close();
                        fileInputStream.close();
                        return true;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o4.OooO0OO("transferFile size mismatch, src: " + file + ", dst: " + file2 + ", expected: " + size + ", actual: " + channel2.size(), new Object[0]);
                    fileOutputStream.close();
                    fileInputStream.close();
                    return false;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("NoteInFileUseCase");
            c20358OooO00o5.OooO0Oo(e, "transferFile failed", new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo(Uri uri, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o000O00 o000o002;
        C27387o0000o0 c27387o0000o0;
        if (abstractC32479OooO0OO instanceof o000O00) {
            o000o002 = (o000O00) abstractC32479OooO0OO;
            int i = o000o002.f95543OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o002.f95543OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o000o002 = new o000O00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o000o002.f95542OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000o002.f95543OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000o002.f95540OooOo0o = this;
            o000o002.f95539OooOo = uri;
            o000o002.f95543OooOoOO = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27393o0000oO0(this, false, null), o000o002);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o == obj2) {
                return obj2;
            }
            c27387o0000o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = o000o002.f95539OooOo;
            c27387o0000o0 = o000o002.f95540OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        File file = new File(c27387o0000o0.f95452OooOoo0.getFilesDir(), "notein_files");
        C31190OooO0oo.OooO0o(file);
        File file2 = new File(file, "import");
        C31190OooO0oo.OooO0o(file2);
        File file3 = new File(file2, UUID.randomUUID().toString());
        C31190OooO0oo.OooO0o(file3);
        File file4 = new File(file3, "temp.zip");
        if (!C31190OooO0oo.OooO0O0(c27387o0000o0.f95452OooOoo0, uri, file4)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooOO0O("getFinalImportDir failed, copy srcUri to " + file4 + " failed.", new Object[0]);
            return null;
        }
        File file5 = new File(file3, "unzip");
        C31190OooO0oo.OooO0o(file5);
        try {
            C31193OooOOo.OooO0OO(file4, file5);
            C34406OooO00o.f123390OooO00o.OooO00o(C21638OooO0Oo.OooO00o(file5, "getFinalImportDir, importUnzipDir: "), new Object[0]);
            return file5;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInFileUseCase");
            c20358OooO00o2.OooO0Oo(e, "getFinalImportDir, unzip importFile error.", new Object[0]);
            C32501OooO0oO.OooO0Oo(file5);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r1.OooO0O0(r12, r3, r11, r6, r7) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0o(Label label, String str, int i, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27397o0000oo0 c27397o0000oo0;
        Object obj;
        String str3;
        C27387o0000o0 c27387o0000o0;
        int i2;
        String str4;
        String str5;
        long id;
        String str6;
        if (abstractC32479OooO0OO instanceof C27397o0000oo0) {
            c27397o0000oo0 = (C27397o0000oo0) abstractC32479OooO0OO;
            int i3 = c27397o0000oo0.f95528OooOooO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c27397o0000oo0.f95528OooOooO = i3 - Integer.MIN_VALUE;
            } else {
                c27397o0000oo0 = new C27397o0000oo0(this, abstractC32479OooO0OO);
            }
        }
        C27397o0000oo0 c27397o0000oo02 = c27397o0000oo0;
        Object obj2 = c27397o0000oo02.f95527OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c27397o0000oo02.f95528OooOooO;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            String name = label.getName();
            c27397o0000oo02.f95522OooOo0o = this;
            c27397o0000oo02.f95521OooOo = label;
            c27397o0000oo02.f95524OooOoO0 = str;
            c27397o0000oo02.f95523OooOoO = str2;
            c27397o0000oo02.f95525OooOoOO = i;
            c27397o0000oo02.f95528OooOooO = 1;
            Object objOooOOo0 = this.f95448OooOo0o.f98267OooO00o.OooOOo0(name, c27397o0000oo02);
            if (objOooOOo0 != enumC32485OooO00o) {
                obj = objOooOOo0;
                str3 = str2;
                c27387o0000o0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i4 == 1) {
            i = c27397o0000oo02.f95525OooOoOO;
            String str7 = c27397o0000oo02.f95523OooOoO;
            str = c27397o0000oo02.f95524OooOoO0;
            label = (Label) c27397o0000oo02.f95521OooOo;
            C27387o0000o0 c27387o0000o02 = c27397o0000oo02.f95522OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            str3 = str7;
            c27387o0000o0 = c27387o0000o02;
            obj = obj2;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
                return C32460OooOooO.f116667OooO00o;
            }
            i2 = c27397o0000oo02.f95525OooOoOO;
            str5 = c27397o0000oo02.f95524OooOoO0;
            str4 = (String) c27397o0000oo02.f95521OooOo;
            c27387o0000o0 = c27397o0000oo02.f95522OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            id = ((Number) obj2).longValue();
            str6 = str5;
            str = str4;
            i = i2;
            C27798OooO0o0 c27798OooO0o0 = c27387o0000o0.f95444OooOo;
            c27397o0000oo02.f95522OooOo0o = null;
            c27397o0000oo02.f95521OooOo = null;
            c27397o0000oo02.f95524OooOoO0 = null;
            c27397o0000oo02.f95523OooOoO = null;
            c27397o0000oo02.f95528OooOooO = 3;
        }
        Label label2 = (Label) obj;
        if (label2 == null) {
            C27798OooO0o0 c27798OooO0o02 = c27387o0000o0.f95444OooOo;
            String name2 = label.getName();
            int color = label.getColor();
            c27397o0000oo02.f95522OooOo0o = c27387o0000o0;
            c27397o0000oo02.f95521OooOo = str;
            c27397o0000oo02.f95524OooOoO0 = str3;
            c27397o0000oo02.f95523OooOoO = null;
            c27397o0000oo02.f95525OooOoOO = i;
            c27397o0000oo02.f95528OooOooO = 2;
            Object objOooO0Oo = c27798OooO0o02.OooO0Oo(color, name2, c27397o0000oo02);
            if (objOooO0Oo != enumC32485OooO00o) {
                String str8 = str3;
                obj2 = objOooO0Oo;
                i2 = i;
                str4 = str;
                str5 = str8;
                id = ((Number) obj2).longValue();
                str6 = str5;
                str = str4;
                i = i2;
                C27798OooO0o0 c27798OooO0o03 = c27387o0000o0.f95444OooOo;
                c27397o0000oo02.f95522OooOo0o = null;
                c27397o0000oo02.f95521OooOo = null;
                c27397o0000oo02.f95524OooOoO0 = null;
                c27397o0000oo02.f95523OooOoO = null;
                c27397o0000oo02.f95528OooOooO = 3;
            }
            return enumC32485OooO00o;
        }
        id = label2.getId();
        str6 = str3;
        C27798OooO0o0 c27798OooO0o032 = c27387o0000o0.f95444OooOo;
        c27397o0000oo02.f95522OooOo0o = null;
        c27397o0000oo02.f95521OooOo = null;
        c27397o0000oo02.f95524OooOoO0 = null;
        c27397o0000oo02.f95523OooOoO = null;
        c27397o0000oo02.f95528OooOooO = 3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:58)|(1:(1:(1:(4:13|14|45|46)(2:18|19))(6:20|21|22|41|(3:44|45|46)|43))(3:23|24|25))(5:26|60|27|(3:30|(1:33)|43)|55)|56|34|(2:36|55)(2:37|(2:39|43)(4:40|41|(0)|43))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014d, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0162, code lost:
    
        o0oo000O.C31190OooO0oo.OooO(r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0o0(Folder folder, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27395o0000oOo c27395o0000oOo;
        File fileOoooOOo;
        C27387o0000o0 c27387o0000o0;
        File file;
        File file2;
        Object objOooO0o;
        Folder folder2;
        File file3;
        File file4;
        Folder folder3 = folder;
        if (abstractC32479OooO0OO instanceof C27395o0000oOo) {
            c27395o0000oOo = (C27395o0000oOo) abstractC32479OooO0OO;
            int i = c27395o0000oOo.f95502OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27395o0000oOo.f95502OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27395o0000oOo = new C27395o0000oOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o2 = c27395o0000oOo.f95501OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r7 = c27395o0000oOo.f95502OooOooO;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (r7 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o2);
            try {
                fileOoooOOo = OoooOOo(folder3.getId());
                if (fileOoooOOo != null) {
                    c27395o0000oOo.f95496OooOo0o = this;
                    c27395o0000oOo.f95495OooOo = folder3;
                    c27395o0000oOo.f95498OooOoO0 = fileOoooOOo;
                    c27395o0000oOo.f95497OooOoO = fileOoooOOo;
                    c27395o0000oOo.f95502OooOooO = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000O00O(folder3, fileOoooOOo, null), c27395o0000oOo);
                    if (objOooO0o2 != enumC32485OooO00o) {
                        c27387o0000o0 = this;
                        file = fileOoooOOo;
                    }
                    return enumC32485OooO00o;
                }
            } catch (Exception e2) {
                e = e2;
                r7 = 0;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "NoteInFileUseCase", "getFolderFile failed, error: ", e), new Object[0]);
                if (r7 != 0) {
                }
            }
            return null;
        }
        if (r7 != 1) {
            if (r7 != 2) {
                if (r7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file3 = c27395o0000oOo.f95499OooOoOO;
                file2 = c27395o0000oOo.f95497OooOoO;
                file4 = c27395o0000oOo.f95498OooOoO0;
                File file5 = (File) c27395o0000oOo.f95495OooOo;
                folder2 = (Folder) c27395o0000oOo.f95496OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o2);
                r7 = file5;
                final File file6 = new File(file4.getAbsolutePath(), "folder_" + folder2.getId() + "_zip");
                C31190OooO0oo.OooO0oO(file6);
                C31193OooOOo.OooO0o(oOo000Oo.OooOOO.OooOoO(new File[]{file2, file3, (File) objOooO0o2}), file6);
                C31190OooO0oo.OooOO0O(file4, new FileFilter() { // from class: o0OOo0o.o0000Oo
                    @Override // java.io.FileFilter
                    public final boolean accept(File file7) {
                        return !kotlin.jvm.internal.OooOOO0.OooO0O0(file7, file6);
                    }
                });
                return file6;
            }
            File file7 = c27395o0000oOo.f95499OooOoOO;
            File file8 = c27395o0000oOo.f95497OooOoO;
            File file9 = c27395o0000oOo.f95498OooOoO0;
            Folder folder4 = (Folder) c27395o0000oOo.f95495OooOo;
            C27387o0000o0 c27387o0000o02 = (C27387o0000o0) c27395o0000oOo.f95496OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o2);
            c27387o0000o0 = c27387o0000o02;
            file = file9;
            fileOoooOOo = file8;
            file2 = file7;
            folder3 = folder4;
            File file10 = (File) objOooO0o2;
            c27395o0000oOo.f95496OooOo0o = folder3;
            c27395o0000oOo.f95495OooOo = file;
            c27395o0000oOo.f95498OooOoO0 = fileOoooOOo;
            c27395o0000oOo.f95497OooOoO = file2;
            c27395o0000oOo.f95499OooOoOO = file10;
            c27395o0000oOo.f95502OooOooO = 3;
            c27387o0000o0.getClass();
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000O0(folder3, fileOoooOOo, null, c27387o0000o0), c27395o0000oOo);
            if (objOooO0o != enumC32485OooO00o) {
                folder2 = folder3;
                file3 = file10;
                objOooO0o2 = objOooO0o;
                file4 = fileOoooOOo;
                r7 = file;
                final File file62 = new File(file4.getAbsolutePath(), "folder_" + folder2.getId() + "_zip");
                C31190OooO0oo.OooO0oO(file62);
                C31193OooOOo.OooO0o(oOo000Oo.OooOOO.OooOoO(new File[]{file2, file3, (File) objOooO0o2}), file62);
                C31190OooO0oo.OooOO0O(file4, new FileFilter() { // from class: o0OOo0o.o0000Oo
                    @Override // java.io.FileFilter
                    public final boolean accept(File file72) {
                        return !kotlin.jvm.internal.OooOOO0.OooO0O0(file72, file62);
                    }
                });
                return file62;
            }
            return enumC32485OooO00o;
        }
        File file11 = c27395o0000oOo.f95497OooOoO;
        File file12 = c27395o0000oOo.f95498OooOoO0;
        Folder folder5 = (Folder) c27395o0000oOo.f95495OooOo;
        c27387o0000o0 = (C27387o0000o0) c27395o0000oOo.f95496OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o2);
        fileOoooOOo = file11;
        folder3 = folder5;
        file = file12;
        File file13 = (File) objOooO0o2;
        if (file13 == null) {
            return null;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("NoteInFileUseCase");
        c20358OooO00o2.OooO0o0("get folderFile, folderJson: " + folder3, new Object[0]);
        c27395o0000oOo.f95496OooOo0o = c27387o0000o0;
        c27395o0000oOo.f95495OooOo = folder3;
        c27395o0000oOo.f95498OooOoO0 = file;
        c27395o0000oOo.f95497OooOoO = fileOoooOOo;
        c27395o0000oOo.f95499OooOoOO = file13;
        c27395o0000oOo.f95502OooOooO = 2;
        c27387o0000o0.getClass();
        C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27394o0000oOO(folder3, fileOoooOOo, null, c27387o0000o0), c27395o0000oOo);
        if (objOooO0o3 == enumC32485OooO00o) {
            return enumC32485OooO00o;
        }
        file2 = file13;
        objOooO0o2 = objOooO0o3;
        File file102 = (File) objOooO0o2;
        c27395o0000oOo.f95496OooOo0o = folder3;
        c27395o0000oOo.f95495OooOo = file;
        c27395o0000oOo.f95498OooOoO0 = fileOoooOOo;
        c27395o0000oOo.f95497OooOoO = file2;
        c27395o0000oOo.f95499OooOoOO = file102;
        c27395o0000oOo.f95502OooOooO = 3;
        c27387o0000o0.getClass();
        C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000O0(folder3, fileOoooOOo, null, c27387o0000o0), c27395o0000oOo);
        if (objOooO0o != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:29:0x008a, B:31:0x008e, B:34:0x0096, B:36:0x009e, B:52:0x00ec, B:54:0x010d, B:40:0x00b1, B:42:0x00b5, B:43:0x00c7, B:45:0x00cb, B:47:0x00da, B:49:0x00e4, B:56:0x0142), top: B:65:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:29:0x008a, B:31:0x008e, B:34:0x0096, B:36:0x009e, B:52:0x00ec, B:54:0x010d, B:40:0x00b1, B:42:0x00b5, B:43:0x00c7, B:45:0x00cb, B:47:0x00da, B:49:0x00e4, B:56:0x0142), top: B:65:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:29:0x008a, B:31:0x008e, B:34:0x0096, B:36:0x009e, B:52:0x00ec, B:54:0x010d, B:40:0x00b1, B:42:0x00b5, B:43:0x00c7, B:45:0x00cb, B:47:0x00da, B:49:0x00e4, B:56:0x0142), top: B:65:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooO0(MyTemplate myTemplate, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27400o000O0o0 c27400o000O0o0;
        File file;
        File fileOoooOOo;
        Object objOooO0o;
        C27387o0000o0 c27387o0000o0;
        File file2;
        File file3;
        PaperTheme paperTheme;
        File fileOooo0oo;
        String path;
        File file4;
        MyTemplate myTemplate2 = myTemplate;
        if (abstractC32479OooO0OO instanceof C27400o000O0o0) {
            c27400o000O0o0 = (C27400o000O0o0) abstractC32479OooO0OO;
            int i = c27400o000O0o0.f95583OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27400o000O0o0.f95583OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27400o000O0o0 = new C27400o000O0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27400o000O0o0.f95582OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27400o000O0o0.f95583OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            try {
                fileOoooOOo = OoooOOo(myTemplate2.getId());
                if (fileOoooOOo == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o.OooO0OO("getMyTemplateFile error: getUploadDir is null", new Object[0]);
                    return null;
                }
                try {
                    c27400o000O0o0.f95579OooOo0o = this;
                    c27400o000O0o0.f95578OooOo = myTemplate2;
                    c27400o000O0o0.f95581OooOoO0 = fileOoooOOo;
                    c27400o000O0o0.f95580OooOoO = fileOoooOOo;
                    c27400o000O0o0.f95583OooOoo = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000OOO(this, myTemplate2, fileOoooOOo, null), c27400o000O0o0);
                    if (objOooO0o == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    c27387o0000o0 = this;
                    file2 = fileOoooOOo;
                    file3 = (File) objOooO0o;
                    if (file3 != null) {
                        paperTheme = myTemplate2.getPaperTheme();
                        if (!(paperTheme instanceof LocalUriPaperTheme)) {
                        }
                        if (fileOooo0oo == null) {
                        }
                        final File file5 = new File(fileOoooOOo.getAbsolutePath(), "template_" + myTemplate2.getId() + "_zip");
                        C31190OooO0oo.OooO0oO(file5);
                        C31193OooOOo.OooO0o(oOo000Oo.OooOOO.OooOoO(new File[]{file3, file4}), file5);
                        C31190OooO0oo.OooOO0O(fileOoooOOo, new FileFilter() { // from class: o0OOo0o.o0000Oo0
                            @Override // java.io.FileFilter
                            public final boolean accept(File file6) {
                                return !kotlin.jvm.internal.OooOOO0.OooO0O0(file6, file5);
                            }
                        });
                        return file5;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o2.OooO0OO("getMyTemplateFile error: getTemplateJsonFile is null", new Object[0]);
                    return null;
                } catch (Exception e) {
                    e = e;
                    file = fileOoooOOo;
                }
            } catch (Exception e2) {
                e = e2;
                file = null;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            File file6 = c27400o000O0o0.f95580OooOoO;
            file = c27400o000O0o0.f95581OooOoO0;
            MyTemplate myTemplate3 = c27400o000O0o0.f95578OooOo;
            C27387o0000o0 c27387o0000o02 = c27400o000O0o0.f95579OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                fileOoooOOo = file6;
                myTemplate2 = myTemplate3;
                file2 = file;
                c27387o0000o0 = c27387o0000o02;
                objOooO0o = obj;
                try {
                    file3 = (File) objOooO0o;
                    if (file3 != null && file3.exists()) {
                        paperTheme = myTemplate2.getPaperTheme();
                        if (!(paperTheme instanceof LocalUriPaperTheme)) {
                            String uri = ((LocalUriPaperTheme) paperTheme).getUri();
                            c27387o0000o0.getClass();
                            fileOooo0oo = Oooo0oo(uri);
                        } else if (paperTheme instanceof PdfPaperTheme) {
                            String pdfPath = ((PdfPaperTheme) paperTheme).getPdfInfo().getPdfPath();
                            c27387o0000o0.getClass();
                            fileOooo0oo = Oooo0oo(pdfPath);
                        } else {
                            fileOooo0oo = ((paperTheme instanceof PdfSetPaperTheme) && kotlin.jvm.internal.OooOOO0.OooO0O0(((PdfSetPaperTheme) paperTheme).getDownloadable(), Boolean.TRUE) && (path = ((PdfSetPaperTheme) paperTheme).getPath(c27387o0000o0.f95452OooOoo0)) != null) ? Oooo0oo(path) : null;
                        }
                        if (fileOooo0oo == null) {
                            file4 = new File(fileOoooOOo.getAbsolutePath(), "template_res_" + fileOooo0oo.getName());
                            c27387o0000o0.getClass();
                            OooooO0(fileOooo0oo, file4);
                        } else {
                            file4 = null;
                        }
                        final File file52 = new File(fileOoooOOo.getAbsolutePath(), "template_" + myTemplate2.getId() + "_zip");
                        C31190OooO0oo.OooO0oO(file52);
                        C31193OooOOo.OooO0o(oOo000Oo.OooOOO.OooOoO(new File[]{file3, file4}), file52);
                        C31190OooO0oo.OooOO0O(fileOoooOOo, new FileFilter() { // from class: o0OOo0o.o0000Oo0
                            @Override // java.io.FileFilter
                            public final boolean accept(File file62) {
                                return !kotlin.jvm.internal.OooOOO0.OooO0O0(file62, file52);
                            }
                        });
                        return file52;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o22.OooO0OO("getMyTemplateFile error: getTemplateJsonFile is null", new Object[0]);
                    return null;
                } catch (Exception e3) {
                    e = e3;
                    file = file2;
                }
            } catch (Exception e4) {
                e = e4;
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("NoteInFileUseCase");
        c20358OooO00o3.OooO0Oo(e, "getMyTemplateFile error", new Object[0]);
        if (file != null) {
            C31190OooO0oo.OooO(file);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooO00(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000O0O0 o000o0o02;
        C27387o0000o0 c27387o0000o0;
        if (abstractC32479OooO0OO instanceof o000O0O0) {
            o000o0o02 = (o000O0O0) abstractC32479OooO0OO;
            int i = o000o0o02.f95554OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o0o02.f95554OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o000o0o02 = new o000O0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = o000o0o02.f95553OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000o0o02.f95554OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            o000o0o02.f95551OooOo0o = this;
            o000o0o02.f95550OooOo = str;
            o000o0o02.f95554OooOoOO = 1;
            objOooO0o0 = this.f95430OooO0o.OooO0o0(str, o000o0o02);
            if (objOooO0o0 != obj) {
                c27387o0000o0 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o0);
            return objOooO0o0;
        }
        str = o000o0o02.f95550OooOo;
        c27387o0000o0 = o000o0o02.f95551OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o0);
        Set setO0OO00O = oOo000Oo.OooOo.o0OO00O((List) objOooO0o0);
        o000o0o02.f95551OooOo0o = null;
        o000o0o02.f95550OooOo = null;
        o000o0o02.f95554OooOoOO = 2;
        Object objOooOOO = c27387o0000o0.f95436OooOO0o.OooOOO(str, setO0OO00O, o000o0o02);
        return objOooOOO == obj ? obj : objOooOOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000O o000o;
        C27387o0000o0 c27387o0000o0;
        PdfInfo pdfInfo;
        String id;
        if (abstractC32479OooO0OO instanceof o000O) {
            o000o = (o000O) abstractC32479OooO0OO;
            int i = o000o.f95534OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o.f95534OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o000o = new o000O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0o = o000o.f95533OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000o.f95534OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0o);
            o000o.f95531OooOo0o = this;
            o000o.f95530OooOo = str;
            o000o.f95534OooOoOO = 1;
            objOooOO0o = this.f95429OooO0Oo.OooOO0o(str, o000o);
            if (objOooOO0o != enumC32485OooO00o) {
                c27387o0000o0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOO0o);
            PdfInfo pdfInfo2 = (PdfInfo) objOooOO0o;
            if (pdfInfo2 != null) {
                return pdfInfo2.getPdfPath();
            }
            return null;
        }
        str = o000o.f95530OooOo;
        c27387o0000o0 = o000o.f95531OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0o);
        NoteContent noteContent = (NoteContent) objOooOO0o;
        if (noteContent != null && (pdfInfo = noteContent.getPdfInfo()) != null && (id = pdfInfo.getId()) != null) {
            C26427Oooo0O0 c26427Oooo0O0 = c27387o0000o0.f95431OooO0o0;
            o000o.f95531OooOo0o = null;
            o000o.f95530OooOo = null;
            o000o.f95534OooOoOO = 2;
            objOooOO0o = c26427Oooo0O0.OooO0OO(id, str, o000o);
        }
        return null;
    }

    public final File OoooOOO(String str) {
        Oooo0O0(this);
        File file = new File(this.f95452OooOoo0.getFilesDir(), "cloud_sync");
        if (!C31190OooO0oo.OooO0o(file)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooO0OO("getUnZipDir createCloudSyncDirResult failed", new Object[0]);
            return null;
        }
        File file2 = new File(file, "unzip");
        if (!C31190OooO0oo.OooO0o(file2)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInFileUseCase");
            c20358OooO00o2.OooO0OO("getUnZipDir createUnzipDirResult failed", new Object[0]);
            return null;
        }
        File file3 = new File(file2, str);
        if (C31190OooO0oo.OooO0o(file3)) {
            C31190OooO0oo.OooO(file3);
            return file3;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("NoteInFileUseCase");
        c20358OooO00o3.OooO0OO("getUnZipDir createUnzipWithIdDirResult failed", new Object[0]);
        return null;
    }

    public final File OoooOOo(String str) {
        Oooo0O0(this);
        File file = new File(this.f95452OooOoo0.getFilesDir(), "cloud_sync");
        if (!C31190OooO0oo.OooO0o(file)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooO0OO("getUploadDir createOrExistsDir failed", new Object[0]);
            return null;
        }
        File file2 = new File(file, "upload");
        if (!C31190OooO0oo.OooO0o(file2)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInFileUseCase");
            c20358OooO00o2.OooO0OO("getUploadDir createUploadDirResult failed", new Object[0]);
            return null;
        }
        File file3 = new File(file2, str);
        if (C31190OooO0oo.OooO0o(file3)) {
            C31190OooO0oo.OooO(file3);
            return file3;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("NoteInFileUseCase");
        c20358OooO00o3.OooO0OO("getUploadDir createUploadWithIdDirResult failed", new Object[0]);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:13:0x003b, B:69:0x0169, B:70:0x0172, B:72:0x0178, B:76:0x018e, B:79:0x019b, B:65:0x014a, B:50:0x00e3, B:51:0x010e, B:53:0x0114, B:57:0x0127, B:59:0x012b), top: B:94:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOoO(File file, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27411o000OoOo c27411o000OoOo;
        Object next;
        Folder folder;
        Object next2;
        C27387o0000o0 c27387o0000o0;
        ?? r13;
        String str2;
        Folder folder2;
        List list;
        String str3;
        ?? r4;
        C28009OooOOOO c28009OooOOOO;
        List list2;
        C27387o0000o0 c27387o0000o02;
        List list3;
        Iterator it;
        Object next3;
        File file2;
        File externalFilesDir;
        if (abstractC32479OooO0OO instanceof C27411o000OoOo) {
            c27411o000OoOo = (C27411o000OoOo) abstractC32479OooO0OO;
            int i = c27411o000OoOo.f95673OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27411o000OoOo.f95673OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27411o000OoOo = new C27411o000OoOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27411o000OoOo.f95672OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? allBytes = c27411o000OoOo.f95673OooOooO;
        boolean z = false;
        ?? r11 = 2;
        try {
            if (allBytes == 0) {
                C32446OooOOOo.OooO0O0(obj);
                try {
                    File fileOoooOOO = OoooOOO(str);
                    if (fileOoooOOO == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteInFileUseCase");
                        c20358OooO00o.OooO0OO("recoverFolderByFile failed, unZipDir is null", new Object[0]);
                        return Boolean.FALSE;
                    }
                    C31193OooOOo.OooO0OO(file, fileOoooOOO);
                    ArrayList arrayListOooOo00 = C31190OooO0oo.OooOo00(fileOoooOOO, false);
                    Iterator it2 = arrayListOooOo00.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        File file3 = (File) next;
                        String name = file3.getName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                        if (C33595OooOOo.OooOoO0(name, "folder_", false)) {
                            String name2 = file3.getName();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                            if (!C33595OooOOo.OooOoO0(name2, "folder_tn_", false) && !file3.getName().equals("folder_labels.json")) {
                                break;
                            }
                        }
                    }
                    File file4 = (File) next;
                    if (file4 != null) {
                        allBytes = Files.readAllBytes(Paths.get(file4.getAbsolutePath(), new String[0]));
                        try {
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(allBytes);
                            String str4 = new String((byte[]) allBytes, C33580OooO00o.f121231OooO0O0);
                            folder = (Folder) C28028OooO0o.OooO00o().fromJson(str4, Folder.class);
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("NoteInFileUseCase");
                            c20358OooO00o2.OooO0o0("recoverFolderByFile createFolder: " + folder, new Object[0]);
                            Iterator it3 = arrayListOooOo00.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((File) next2).getName(), "folder_labels.json")) {
                                    break;
                                }
                            }
                            File file5 = (File) next2;
                            if (file5 == null) {
                                c27387o0000o0 = this;
                                r4 = allBytes;
                                str3 = str4;
                                list = arrayListOooOo00;
                                c28009OooOOOO = c27387o0000o0.f95449OooOoO;
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(folder);
                                c27411o000OoOo.f95667OooOo0o = c27387o0000o0;
                                c27411o000OoOo.f95666OooOo = str3;
                                c27411o000OoOo.f95669OooOoO0 = r4;
                                c27411o000OoOo.f95668OooOoO = list;
                                c27411o000OoOo.f95670OooOoOO = null;
                                c27411o000OoOo.f95673OooOooO = 2;
                                if (c28009OooOOOO.OooO00o(folder, c27411o000OoOo) != enumC32485OooO00o) {
                                }
                                return enumC32485OooO00o;
                            }
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(folder);
                            c27411o000OoOo.f95667OooOo0o = this;
                            c27411o000OoOo.f95666OooOo = str4;
                            c27411o000OoOo.f95669OooOoO0 = allBytes;
                            c27411o000OoOo.f95668OooOoO = arrayListOooOo00;
                            c27411o000OoOo.f95670OooOoOO = folder;
                            c27411o000OoOo.f95673OooOooO = 1;
                            if (Ooooo00(file5, folder, c27411o000OoOo) == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                            c27387o0000o0 = this;
                            r13 = allBytes;
                            str2 = str4;
                            folder2 = folder;
                            list3 = arrayListOooOo00;
                            folder = folder2;
                            r4 = r13;
                            str3 = str2;
                            list = list3;
                            c28009OooOOOO = c27387o0000o0.f95449OooOoO;
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(folder);
                            c27411o000OoOo.f95667OooOo0o = c27387o0000o0;
                            c27411o000OoOo.f95666OooOo = str3;
                            c27411o000OoOo.f95669OooOoO0 = r4;
                            c27411o000OoOo.f95668OooOoO = list;
                            c27411o000OoOo.f95670OooOoOO = null;
                            c27411o000OoOo.f95673OooOooO = 2;
                            if (c28009OooOOOO.OooO00o(folder, c27411o000OoOo) != enumC32485OooO00o) {
                            }
                            return enumC32485OooO00o;
                        } catch (Exception e) {
                            e = e;
                            r11 = 0;
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("NoteInFileUseCase");
                            if (allBytes == 0) {
                            }
                            if (allBytes == 0) {
                            }
                            c20358OooO00o3.OooO0Oo(e, "recoverFolderByFile failed, folderBytes: " + (allBytes == 0 ? new Integer(allBytes.length) : null) + " " + (allBytes == 0 ? oOo000Oo.OooOOO.Oooo00o(allBytes, null, new o0000O(0), 31) : null) + ", folderJson: " + r11, new Object[0]);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    allBytes = 0;
                }
            } else if (allBytes == 1) {
                folder2 = c27411o000OoOo.f95670OooOoOO;
                List list4 = c27411o000OoOo.f95668OooOoO;
                byte[] bArr = c27411o000OoOo.f95669OooOoO0;
                String str5 = c27411o000OoOo.f95666OooOo;
                c27387o0000o0 = c27411o000OoOo.f95667OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    list3 = list4;
                    r13 = bArr;
                    str2 = str5;
                    folder = folder2;
                    r4 = r13;
                    str3 = str2;
                    list = list3;
                    c28009OooOOOO = c27387o0000o0.f95449OooOoO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(folder);
                    c27411o000OoOo.f95667OooOo0o = c27387o0000o0;
                    c27411o000OoOo.f95666OooOo = str3;
                    c27411o000OoOo.f95669OooOoO0 = r4;
                    c27411o000OoOo.f95668OooOoO = list;
                    c27411o000OoOo.f95670OooOoOO = null;
                    c27411o000OoOo.f95673OooOooO = 2;
                    if (c28009OooOOOO.OooO00o(folder, c27411o000OoOo) != enumC32485OooO00o) {
                        list2 = list;
                        c27387o0000o02 = c27387o0000o0;
                        allBytes = r4;
                        r11 = str3;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(list2);
                        it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        file2 = (File) next3;
                        externalFilesDir = c27387o0000o02.f95452OooOoo0.getExternalFilesDir(null);
                        if (file2 != null) {
                            String absolutePath = externalFilesDir.getAbsolutePath();
                            String name3 = file2.getName();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name3, "getName(...)");
                            OooooO0(file2, new File(absolutePath, C33595OooOOo.OooOo0O(name3, "folder_tn_", "")));
                        }
                    }
                    return enumC32485OooO00o;
                } catch (Exception e3) {
                    e = e3;
                    allBytes = bArr;
                    r11 = str5;
                    C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o32.OooOOO0("NoteInFileUseCase");
                    c20358OooO00o32.OooO0Oo(e, "recoverFolderByFile failed, folderBytes: " + (allBytes == 0 ? new Integer(allBytes.length) : null) + " " + (allBytes == 0 ? oOo000Oo.OooOOO.Oooo00o(allBytes, null, new o0000O(0), 31) : null) + ", folderJson: " + r11, new Object[0]);
                }
            } else {
                if (allBytes != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list5 = c27411o000OoOo.f95668OooOoO;
                byte[] bArr2 = c27411o000OoOo.f95669OooOoO0;
                String str6 = c27411o000OoOo.f95666OooOo;
                c27387o0000o02 = c27411o000OoOo.f95667OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list2 = list5;
                allBytes = bArr2;
                r11 = str6;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(list2);
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                    String name4 = ((File) next3).getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name4, "getName(...)");
                    if (C33595OooOOo.OooOoO0(name4, "folder_tn_", false)) {
                        break;
                    }
                }
                file2 = (File) next3;
                externalFilesDir = c27387o0000o02.f95452OooOoo0.getExternalFilesDir(null);
                if (file2 != null && externalFilesDir != null) {
                    String absolutePath2 = externalFilesDir.getAbsolutePath();
                    String name32 = file2.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name32, "getName(...)");
                    OooooO0(file2, new File(absolutePath2, C33595OooOOo.OooOo0O(name32, "folder_tn_", "")));
                }
            }
            z = true;
        } catch (Exception e4) {
            e = e4;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOoo(Folder folder, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27414o000OooO c27414o000OooO;
        Folder folder2;
        List list2;
        Object objOooOo00;
        C27387o0000o0 c27387o0000o0;
        List list3;
        C27414o000OooO c27414o000OooO2;
        C27387o0000o0 c27387o0000o02;
        List list4;
        Iterator it;
        Object next;
        Folder folder3;
        Iterator it2;
        C27387o0000o0 c27387o0000o03;
        C27414o000OooO c27414o000OooO3;
        Object next2;
        if (abstractC32479OooO0OO instanceof C27414o000OooO) {
            c27414o000OooO = (C27414o000OooO) abstractC32479OooO0OO;
            int i = c27414o000OooO.f95692OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27414o000OooO.f95692OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27414o000OooO = new C27414o000OooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27414o000OooO.f95691OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27414o000OooO.f95692OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String folderId = folder.getId();
            C27819OooOoo c27819OooOoo = this.f95448OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(folderId, "folderId");
            C27807OooOOOo c27807OooOOOo = new C27807OooOOOo(c27819OooOoo.f98267OooO00o.OooOOOO(com.facebook.soloader.OooOo.OooO0oO(folderId)), folderId);
            c27414o000OooO.f95686OooOo0o = this;
            folder2 = folder;
            c27414o000OooO.f95685OooOo = folder2;
            list2 = list;
            c27414o000OooO.f95688OooOoO0 = list2;
            c27414o000OooO.f95692OooOooO = 1;
            objOooOo00 = C25252OooO0Oo.OooOo00(c27807OooOOOo, c27414o000OooO);
            if (objOooOo00 != enumC32485OooO00o) {
                c27387o0000o0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) c27414o000OooO.f95688OooOoO0;
                folder3 = c27414o000OooO.f95685OooOo;
                c27387o0000o03 = c27414o000OooO.f95686OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27414o000OooO3 = c27414o000OooO;
                while (it2.hasNext()) {
                    Label label = (Label) it2.next();
                    C27799OooO0oO c27799OooO0oO = c27387o0000o03.f95450OooOoO0;
                    long id = label.getId();
                    String id2 = folder3.getId();
                    int value = LabelType.FOLDER.getValue();
                    c27414o000OooO3.f95686OooOo0o = c27387o0000o03;
                    c27414o000OooO3.f95685OooOo = folder3;
                    c27414o000OooO3.f95688OooOoO0 = it2;
                    c27414o000OooO3.f95687OooOoO = null;
                    c27414o000OooO3.f95689OooOoOO = null;
                    c27414o000OooO3.f95692OooOooO = 3;
                    if (c27799OooO0oO.OooO0O0(value, id, id2, "", c27414o000OooO3) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            it = c27414o000OooO.f95689OooOoOO;
            list3 = c27414o000OooO.f95687OooOoO;
            list4 = (List) c27414o000OooO.f95688OooOoO0;
            Folder folder4 = c27414o000OooO.f95685OooOo;
            C27387o0000o0 c27387o0000o04 = c27414o000OooO.f95686OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c27414o000OooO2 = c27414o000OooO;
            folder2 = folder4;
            c27387o0000o02 = c27387o0000o04;
            while (it.hasNext()) {
                Label label2 = (Label) it.next();
                String id3 = folder2.getId();
                int value2 = LabelType.FOLDER.getValue();
                c27414o000OooO2.f95686OooOo0o = c27387o0000o02;
                c27414o000OooO2.f95685OooOo = folder2;
                c27414o000OooO2.f95688OooOoO0 = list4;
                c27414o000OooO2.f95687OooOoO = list3;
                c27414o000OooO2.f95689OooOoOO = it;
                c27414o000OooO2.f95692OooOooO = 2;
                if (c27387o0000o02.Oooo0o(label2, id3, value2, "", c27414o000OooO2) == enumC32485OooO00o) {
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list3) {
                Label label3 = (Label) obj2;
                Iterator it3 = list4.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(C33599OooOo0O.Oooooo0(((Label) next2).getName()).toString(), C33599OooOo0O.Oooooo0(label3.getName()).toString())) {
                        break;
                    }
                }
                if (next2 == null) {
                    arrayList.add(obj2);
                }
            }
            folder3 = folder2;
            it2 = arrayList.iterator();
            c27387o0000o03 = c27387o0000o02;
            c27414o000OooO3 = c27414o000OooO2;
            while (it2.hasNext()) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        list2 = (List) c27414o000OooO.f95688OooOoO0;
        Folder folder5 = c27414o000OooO.f95685OooOo;
        c27387o0000o0 = c27414o000OooO.f95686OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooOo00 = obj;
        folder2 = folder5;
        list3 = (List) objOooOo00;
        if (list3 == null) {
            list3 = C34434OooOoO.f123453OooOo0o;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            Label label4 = (Label) obj3;
            Iterator it4 = list3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(C33599OooOo0O.Oooooo0(((Label) next).getName()).toString(), C33599OooOo0O.Oooooo0(label4.getName()).toString())) {
                    break;
                }
            }
            if (next == null) {
                arrayList2.add(obj3);
            }
        }
        c27414o000OooO2 = c27414o000OooO;
        c27387o0000o02 = c27387o0000o0;
        list4 = list2;
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList3 = new ArrayList();
        while (r4.hasNext()) {
        }
        folder3 = folder2;
        it2 = arrayList3.iterator();
        c27387o0000o03 = c27387o0000o02;
        c27414o000OooO3 = c27414o000OooO2;
        while (it2.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ooooo00(File file, Folder folder, AbstractC32479OooO0OO abstractC32479OooO0OO) throws IOException {
        C27413o000Ooo0 c27413o000Ooo0;
        if (abstractC32479OooO0OO instanceof C27413o000Ooo0) {
            c27413o000Ooo0 = (C27413o000Ooo0) abstractC32479OooO0OO;
            int i = c27413o000Ooo0.f95684OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27413o000Ooo0.f95684OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27413o000Ooo0 = new C27413o000Ooo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27413o000Ooo0.f95683OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27413o000Ooo0.f95684OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Object objFromJson = C28028OooO0o.OooO00o().fromJson(C32501OooO0oO.OooO0oo(file), new C27415o000Oooo().getType());
                kotlin.jvm.internal.OooOOO0.OooO0o(objFromJson, "fromJson(...)");
                c27413o000Ooo0.f95684OooOoO0 = 1;
                if (OoooOoo(folder, (List) objFromJson, c27413o000Ooo0) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteInFileUseCase");
            c20358OooO00o.OooO0Oo(e, "restoreFolderLabels failed.", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0159, code lost:
    
        if (r14.f95441OooOOo.OooO00o(new com.orion.notein.domain.models.papertheme.MyTemplate[]{r0}, r3) == r4) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:14:0x003d, B:52:0x015c, B:53:0x0165, B:55:0x016b, B:58:0x0180, B:60:0x0184, B:22:0x005c, B:45:0x0129, B:49:0x0143, B:25:0x007c, B:27:0x0082, B:29:0x008f, B:30:0x009c, B:32:0x00a2, B:34:0x00b8, B:38:0x00c7, B:40:0x00cb), top: B:65:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0184 A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #0 {Exception -> 0x0042, blocks: (B:14:0x003d, B:52:0x015c, B:53:0x0165, B:55:0x016b, B:58:0x0180, B:60:0x0184, B:22:0x005c, B:45:0x0129, B:49:0x0143, B:25:0x007c, B:27:0x0082, B:29:0x008f, B:30:0x009c, B:32:0x00a2, B:34:0x00b8, B:38:0x00c7, B:40:0x00cb), top: B:65:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180 A[EDGE_INSN: B:66:0x0180->B:58:0x0180 BREAK  A[LOOP:0: B:53:0x0165->B:68:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ooooo0o(File file, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27420o000o0O c27420o000o0O;
        Object next;
        List list;
        MyTemplate myTemplate;
        C27387o0000o0 c27387o0000o0;
        List list2;
        C27387o0000o0 c27387o0000o02;
        Iterator it;
        File file2;
        if (abstractC32479OooO0OO instanceof C27420o000o0O) {
            c27420o000o0O = (C27420o000o0O) abstractC32479OooO0OO;
            int i = c27420o000o0O.f95743OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27420o000o0O.f95743OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27420o000o0O = new C27420o000o0O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27420o000o0O.f95740OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27420o000o0O.f95743OooOoo0;
        boolean z = false;
        Object obj2 = null;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "NoteInFileUseCase", "recoverTemplateByFile failed, error: ", e), new Object[0]);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteInFileUseCase");
            c20358OooO00o2.OooO0o0(androidx.core.database.OooO00o.OooO00o("recoverTemplateByFile, start, file: ", file.getName(), ", templateId: ", str, "."), new Object[0]);
            File fileOoooOOO = OoooOOO(str);
            if (fileOoooOOO == null) {
                c20358OooO00o2.OooOOO0("NoteInFileUseCase");
                c20358OooO00o2.OooO0OO("recoverTemplateByFile failed, unZipDir is null", new Object[0]);
                return Boolean.FALSE;
            }
            C31193OooOOo.OooO0OO(file, fileOoooOOO);
            ArrayList arrayListOooOo00 = C31190OooO0oo.OooOo00(fileOoooOOO, false);
            Iterator it2 = arrayListOooOo00.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                File file3 = (File) next;
                String name = file3.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                if (C33595OooOOo.OooOoO0(name, "template_", false)) {
                    String name2 = file3.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name2, "getName(...)");
                    if (!C33595OooOOo.OooOoO0(name2, "template_res_", false)) {
                        break;
                    }
                }
            }
            File file4 = (File) next;
            if (file4 != null) {
                byte[] allBytes = Files.readAllBytes(Paths.get(file4.getAbsolutePath(), new String[0]));
                kotlin.jvm.internal.OooOOO0.OooO0Oo(allBytes);
                MyTemplate myTemplate2 = this.f95451OooOoOO.toMyTemplate((MyTemplateEntity) C28028OooO0o.OooO00o().fromJson(new String(allBytes, C33580OooO00o.f121231OooO0O0), MyTemplateEntity.class));
                C34406OooO00o.f123390OooO00o.OooO00o("recoverTemplateByFile template: " + myTemplate2, new Object[0]);
                C27095OooOo0O c27095OooOo0O = this.f95441OooOOo;
                String id = myTemplate2.getId();
                c27420o000o0O.f95739OooOo0o = this;
                c27420o000o0O.f95738OooOo = arrayListOooOo00;
                c27420o000o0O.f95741OooOoO0 = myTemplate2;
                c27420o000o0O.f95743OooOoo0 = 1;
                Object objOooOO0o = c27095OooOo0O.OooOO0o(id, c27420o000o0O);
                if (objOooOO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                list = arrayListOooOo00;
                myTemplate = myTemplate2;
                obj = objOooOO0o;
                c27387o0000o0 = this;
            }
            z = true;
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = c27420o000o0O.f95738OooOo;
            c27387o0000o02 = c27420o000o0O.f95739OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(list2);
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                String name3 = ((File) next2).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name3, "getName(...)");
                if (C33595OooOOo.OooOoO0(name3, "template_res_", false)) {
                    obj2 = next2;
                    break;
                }
            }
            file2 = (File) obj2;
            if (file2 != null) {
                File file5 = new File(c27387o0000o02.f95452OooOoo0.getFilesDir(), "documents");
                C31190OooO0oo.OooO0o(file5);
                String absolutePath = file5.getAbsolutePath();
                String name4 = file2.getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name4, "getName(...)");
                OooooO0(file2, new File(absolutePath, C33595OooOOo.OooOo0O(name4, "template_res_", "")));
            }
            z = true;
            return Boolean.valueOf(z);
        }
        myTemplate = c27420o000o0O.f95741OooOoO0;
        list = c27420o000o0O.f95738OooOo;
        c27387o0000o0 = c27420o000o0O.f95739OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        if (obj != null) {
            C27095OooOo0O c27095OooOo0O2 = c27387o0000o0.f95441OooOOo;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(myTemplate);
            c27420o000o0O.f95739OooOo0o = c27387o0000o0;
            c27420o000o0O.f95738OooOo = list;
            c27420o000o0O.f95741OooOoO0 = null;
            c27420o000o0O.f95743OooOoo0 = 2;
            if (c27095OooOo0O2.OooOOo(myTemplate, c27420o000o0O) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            list2 = list;
            c27387o0000o02 = c27387o0000o0;
        } else {
            c27420o000o0O.f95739OooOo0o = c27387o0000o0;
            c27420o000o0O.f95738OooOo = list;
            c27420o000o0O.f95741OooOoO0 = null;
            c27420o000o0O.f95743OooOoo0 = 3;
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(list2);
        it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        file2 = (File) obj2;
        if (file2 != null) {
        }
        z = true;
        return Boolean.valueOf(z);
    }

    public final Set<String> o000oOoO(List<Page> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            PaperTheme paperTheme = ((Page) it.next()).getPaperTheme();
            String path = null;
            if (paperTheme instanceof PdfSetPaperTheme) {
                PdfSetPaperTheme pdfSetPaperTheme = (PdfSetPaperTheme) paperTheme;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(pdfSetPaperTheme.getDownloadable(), Boolean.TRUE)) {
                    path = pdfSetPaperTheme.getPath(this.f95452OooOoo0);
                }
            }
            if (path != null) {
                arrayList.add(path);
            }
        }
        return oOo000Oo.OooOo.o0OO00O(arrayList);
    }
}
