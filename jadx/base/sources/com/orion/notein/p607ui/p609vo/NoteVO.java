package com.orion.notein.p607ui.p609vo;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21036OooOOo0;
import OoooooO.C21445Oooo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.aspose.words.WarningType;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.p607ui.label.ItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o0OOoooO.C27996OooO00o;
import o0oOoOo.C31076OoooOOO;
import oO0o0O0o.C33588OooOO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b.\b\u0087\b\u0018\u0000 \u008e\u00012\u00020\u0001:\u0002\u008f\u0001Bµ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u000e\u0012\b\b\u0002\u0010!\u001a\u00020\u000e\u0012\b\b\u0002\u0010\"\u001a\u00020\u0010\u0012\b\b\u0002\u0010#\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\b\b\u0002\u0010'\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\t¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00109J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u00109J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u00109J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u00109J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u00109J\u0010\u0010?\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b?\u00107J\u0010\u0010@\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b@\u00107J\u0010\u0010A\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bG\u0010FJ\u0010\u0010H\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bH\u0010DJ\u0010\u0010I\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bI\u0010DJ\u0010\u0010J\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bJ\u0010DJ\u0010\u0010K\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bK\u00107J\u0010\u0010L\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bL\u00107J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00109J\u0012\u0010N\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00109J\u0012\u0010Q\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bQ\u0010OJ\u0012\u0010R\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bR\u0010OJ\u0012\u0010S\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bU\u00107J\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u00109J\u0010\u0010W\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bW\u0010DJ\u0010\u0010X\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bX\u0010DJ\u0010\u0010Y\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bY\u0010FJ\u0010\u0010Z\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bZ\u0010DJ\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020%0$HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b]\u0010DJÞ\u0002\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\u000e2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0002\u0010'\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b`\u00109J\u0010\u0010a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\ba\u00107J\u001a\u0010d\u001a\u00020\u000e2\b\u0010c\u001a\u0004\u0018\u00010bHÖ\u0003¢\u0006\u0004\bd\u0010eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010f\u001a\u0004\bg\u00109R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010f\u001a\u0004\bh\u00109R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010f\u001a\u0004\bi\u00109R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010f\u001a\u0004\bj\u00109R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010f\u001a\u0004\bk\u00109R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010f\u001a\u0004\bl\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010m\u001a\u0004\bn\u00107R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010m\u001a\u0004\bo\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010p\u001a\u0004\bq\u0010BR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010r\u001a\u0004\b\u000f\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010s\u001a\u0004\bt\u0010FR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010s\u001a\u0004\bu\u0010FR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010r\u001a\u0004\bv\u0010DR\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010r\u001a\u0004\b\u0014\u0010DR\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010r\u001a\u0004\b\u0015\u0010DR\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010m\u001a\u0004\bw\u00107R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010m\u001a\u0004\bx\u00107R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010f\u001a\u0004\by\u00109R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010z\u001a\u0004\b{\u0010OR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010f\u001a\u0004\b|\u00109R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010z\u001a\u0004\b}\u0010OR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010z\u001a\u0004\b~\u0010OR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\r\n\u0004\b\u001d\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010TR\u0018\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\r\n\u0004\b\u001e\u0010m\u001a\u0005\b\u0081\u0001\u00107R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\b\u001f\u0010f\u001a\u0005\b\u0082\u0001\u00109R\u0018\u0010 \u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\b \u0010r\u001a\u0005\b\u0083\u0001\u0010DR\u0018\u0010!\u001a\u00020\u000e8\u0006¢\u0006\r\n\u0004\b!\u0010r\u001a\u0005\b\u0084\u0001\u0010DR\u0018\u0010\"\u001a\u00020\u00108\u0006¢\u0006\r\n\u0004\b\"\u0010s\u001a\u0005\b\u0085\u0001\u0010FR$\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010r\u001a\u0004\b#\u0010D\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b&\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010\\\"\u0006\b\u008a\u0001\u0010\u008b\u0001R%\u0010'\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b'\u0010r\u001a\u0005\b\u008c\u0001\u0010D\"\u0006\b\u008d\u0001\u0010\u0087\u0001¨\u0006\u0090\u0001"}, m80612d2 = {"Lcom/orion/notein/ui/vo/NoteVO;", "Landroid/os/Parcelable;", "", "id", "pageNoteId", CommonConstant.KEY_UID, "name", NoteMeta.PROPERTY_PARENT_ID, "tnPath", "", "width", "height", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "orientation", "", "isPdf", "", C17625c.f52155b, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "inSelectMode", "isSelected", "isFavorite", "totalPages", C18437z2.f56754h, "highLightText", "placeHolderState", "toUpdateFileId", "sortKey", "importProgress", "unboundedNote", "folderCoverColor", "creationTimeStr", "lockAdded", "locked", "lastOpenedTime", "isImportedFromFileManager", "", "Lcom/orion/notein/ui/vo/ItemLabelVO;", "labelList", "showMoreBtn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/orion/notein/domain/models/page/PaperOrientation;ZJJZZZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;ILjava/lang/String;ZZJZLjava/util/List;Z)V", "Lcom/orion/notein/ui/label/ItemData;", "getItemData", "()Lcom/orion/notein/ui/label/ItemData;", "Lo0oOoOo/OoooOOO;", "mapToSortVO", "()Lo0oOoOo/OoooOOO;", "Landroid/os/Parcel;", "dest", "flags", "LoO00ooO/OooOooO;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "component10", "()Z", "component11", "()J", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/lang/Integer;", "component20", "component21", "component22", "component23", "()Ljava/lang/Boolean;", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "()Ljava/util/List;", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/orion/notein/domain/models/page/PaperOrientation;ZJJZZZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;ILjava/lang/String;ZZJZLjava/util/List;Z)Lcom/orion/notein/ui/vo/NoteVO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getPageNoteId", "getUid", "getName", "getParentId", "getTnPath", "I", "getWidth", "getHeight", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getOrientation", "Z", "J", "getCreationTime", "getLastModificationTime", "getInSelectMode", "getTotalPages", "getType", "getHighLightText", "Ljava/lang/Integer;", "getPlaceHolderState", "getToUpdateFileId", "getSortKey", "getImportProgress", "Ljava/lang/Boolean;", "getUnboundedNote", "getFolderCoverColor", "getCreationTimeStr", "getLockAdded", "getLocked", "getLastOpenedTime", "setImportedFromFileManager", "(Z)V", "Ljava/util/List;", "getLabelList", "setLabelList", "(Ljava/util/List;)V", "getShowMoreBtn", "setShowMoreBtn", "Companion", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteVO implements Parcelable {
    public static final int FOLDER = 1;
    public static final int NOTE = 0;
    public static final int NOTE_PLACEHOLDER = 3;
    public static final int PAGE = 2;
    public static final int SYNC_STATUS_CLEAN = 0;
    public static final int SYNC_STATUS_ERROR = 2;
    public static final int SYNC_STATUS_NONE = -1;
    public static final int SYNC_STATUS_SYNCING = 1;
    private final long creationTime;
    private final String creationTimeStr;
    private final int folderCoverColor;
    private final int height;
    private final String highLightText;
    private final String id;
    private final Integer importProgress;
    private final boolean inSelectMode;
    private final boolean isFavorite;
    private boolean isImportedFromFileManager;
    private final boolean isPdf;
    private final boolean isSelected;
    private List<ItemLabelVO> labelList;
    private final long lastModificationTime;
    private final long lastOpenedTime;
    private final boolean lockAdded;
    private final boolean locked;
    private final String name;
    private final PaperOrientation orientation;
    private final String pageNoteId;
    private final String parentId;
    private final Integer placeHolderState;
    private boolean showMoreBtn;
    private final Integer sortKey;
    private final String tnPath;
    private final String toUpdateFileId;
    private final int totalPages;
    private final int type;
    private final String uid;
    private final Boolean unboundedNote;
    private final int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<NoteVO> CREATOR = new OooO0O0();
    private static final C33588OooOO0 nameDigitExtractor = new C33588OooOO0("(\\d+)|(\\D+)");

    /* JADX INFO: renamed from: com.orion.notein.ui.vo.NoteVO$OooO00o, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.orion.notein.ui.vo.NoteVO$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C19581OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final /* synthetic */ int[] f80084OooO00o;

            static {
                int[] iArr = new int[SyncPhase.values().length];
                try {
                    iArr[SyncPhase.CLEAN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SyncPhase.CONFLICT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SyncPhase.RESOLVING_CONFLICT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f80084OooO00o = iArr;
            }
        }
    }

    public static final class OooO0O0 implements Parcelable.Creator<NoteVO> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final NoteVO createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            Boolean boolValueOf;
            OooOOO0.OooO0oO(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            PaperOrientation paperOrientationValueOf = PaperOrientation.valueOf(parcel.readString());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            boolean z3 = parcel.readInt() != 0 ? true : z;
            boolean z4 = parcel.readInt() != 0 ? true : z;
            boolean z5 = parcel.readInt() != 0 ? true : z;
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                boolValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                boolValueOf = null;
            }
            String string8 = parcel.readString();
            Comparable comparableValueOf = parcel.readInt() == 0 ? boolValueOf : Integer.valueOf(parcel.readInt());
            Comparable comparableValueOf2 = parcel.readInt() == 0 ? boolValueOf : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z);
            }
            int i5 = parcel.readInt();
            String string9 = parcel.readString();
            boolean z6 = parcel.readInt() != 0 ? true : z;
            boolean z7 = parcel.readInt() != 0 ? true : z;
            long j3 = parcel.readLong();
            boolean z8 = parcel.readInt() != 0 ? true : z;
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            int i7 = 0;
            while (i7 != i6) {
                arrayList.add(ItemLabelVO.CREATOR.createFromParcel(parcel));
                i7++;
                i6 = i6;
            }
            return new NoteVO(string, string2, string3, string4, string5, string6, i, i2, paperOrientationValueOf, z2, j, j2, z3, z4, z5, i3, i4, string7, numValueOf, string8, comparableValueOf, comparableValueOf2, boolValueOf, i5, string9, z6, z7, j3, z8, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final NoteVO[] newArray(int i) {
            return new NoteVO[i];
        }
    }

    public NoteVO(String id, String str, String uid, String name, String str2, String tnPath, int i, int i2, PaperOrientation orientation, boolean z, long j, long j2, boolean z2, boolean z3, boolean z4, int i3, int i4, String str3, Integer num, String str4, Integer num2, Integer num3, Boolean bool, int i5, String str5, boolean z5, boolean z6, long j3, boolean z7, List<ItemLabelVO> labelList, boolean z8) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(uid, "uid");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(labelList, "labelList");
        this.id = id;
        this.pageNoteId = str;
        this.uid = uid;
        this.name = name;
        this.parentId = str2;
        this.tnPath = tnPath;
        this.width = i;
        this.height = i2;
        this.orientation = orientation;
        this.isPdf = z;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.inSelectMode = z2;
        this.isSelected = z3;
        this.isFavorite = z4;
        this.totalPages = i3;
        this.type = i4;
        this.highLightText = str3;
        this.placeHolderState = num;
        this.toUpdateFileId = str4;
        this.sortKey = num2;
        this.importProgress = num3;
        this.unboundedNote = bool;
        this.folderCoverColor = i5;
        this.creationTimeStr = str5;
        this.lockAdded = z5;
        this.locked = z6;
        this.lastOpenedTime = j3;
        this.isImportedFromFileManager = z7;
        this.labelList = labelList;
        this.showMoreBtn = z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoteVO copy$default(NoteVO noteVO, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, PaperOrientation paperOrientation, boolean z, long j, long j2, boolean z2, boolean z3, boolean z4, int i3, int i4, String str7, Integer num, String str8, Integer num2, Integer num3, Boolean bool, int i5, String str9, boolean z5, boolean z6, long j3, boolean z7, List list, boolean z8, int i6, Object obj) {
        boolean z9;
        boolean z10;
        int i7;
        int i8;
        String str10;
        Integer num4;
        String str11;
        Integer num5;
        Integer num6;
        Boolean bool2;
        int i9;
        String str12;
        boolean z11;
        boolean z12;
        long j4;
        List list2;
        String str13;
        String str14;
        String str15;
        String str16;
        int i10;
        int i11;
        PaperOrientation paperOrientation2;
        boolean z13;
        long j5;
        boolean z14;
        boolean z15;
        boolean z16;
        String str17;
        String str18 = (i6 & 1) != 0 ? noteVO.id : str;
        String str19 = (i6 & 2) != 0 ? noteVO.pageNoteId : str2;
        String str20 = (i6 & 4) != 0 ? noteVO.uid : str3;
        String str21 = (i6 & 8) != 0 ? noteVO.name : str4;
        String str22 = (i6 & 16) != 0 ? noteVO.parentId : str5;
        String str23 = (i6 & 32) != 0 ? noteVO.tnPath : str6;
        int i12 = (i6 & 64) != 0 ? noteVO.width : i;
        int i13 = (i6 & 128) != 0 ? noteVO.height : i2;
        PaperOrientation paperOrientation3 = (i6 & 256) != 0 ? noteVO.orientation : paperOrientation;
        boolean z17 = (i6 & 512) != 0 ? noteVO.isPdf : z;
        long j6 = (i6 & 1024) != 0 ? noteVO.creationTime : j;
        long j7 = (i6 & 2048) != 0 ? noteVO.lastModificationTime : j2;
        String str24 = str18;
        boolean z18 = (i6 & 4096) != 0 ? noteVO.inSelectMode : z2;
        boolean z19 = (i6 & 8192) != 0 ? noteVO.isSelected : z3;
        boolean z20 = (i6 & 16384) != 0 ? noteVO.isFavorite : z4;
        int i14 = (i6 & 32768) != 0 ? noteVO.totalPages : i3;
        int i15 = (i6 & 65536) != 0 ? noteVO.type : i4;
        String str25 = (i6 & 131072) != 0 ? noteVO.highLightText : str7;
        Integer num7 = (i6 & 262144) != 0 ? noteVO.placeHolderState : num;
        String str26 = (i6 & 524288) != 0 ? noteVO.toUpdateFileId : str8;
        Integer num8 = (i6 & 1048576) != 0 ? noteVO.sortKey : num2;
        Integer num9 = (i6 & 2097152) != 0 ? noteVO.importProgress : num3;
        Boolean bool3 = (i6 & 4194304) != 0 ? noteVO.unboundedNote : bool;
        int i16 = (i6 & 8388608) != 0 ? noteVO.folderCoverColor : i5;
        String str27 = (i6 & 16777216) != 0 ? noteVO.creationTimeStr : str9;
        boolean z21 = (i6 & 33554432) != 0 ? noteVO.lockAdded : z5;
        boolean z22 = (i6 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? noteVO.locked : z6;
        boolean z23 = z20;
        long j8 = (i6 & 134217728) != 0 ? noteVO.lastOpenedTime : j3;
        boolean z24 = (i6 & WarningType.HINT) != 0 ? noteVO.isImportedFromFileManager : z7;
        List list3 = (i6 & 536870912) != 0 ? noteVO.labelList : list;
        if ((i6 & 1073741824) != 0) {
            z10 = z24;
            z9 = noteVO.showMoreBtn;
            i8 = i15;
            str10 = str25;
            num4 = num7;
            str11 = str26;
            num5 = num8;
            num6 = num9;
            bool2 = bool3;
            i9 = i16;
            str12 = str27;
            z11 = z21;
            z12 = z22;
            j4 = j8;
            list2 = list3;
            str14 = str21;
            str15 = str22;
            str16 = str23;
            i10 = i12;
            i11 = i13;
            paperOrientation2 = paperOrientation3;
            z13 = z17;
            j5 = j6;
            z14 = z18;
            z15 = z19;
            i7 = i14;
            z16 = z23;
            str17 = str19;
            str13 = str20;
        } else {
            z9 = z8;
            z10 = z24;
            i7 = i14;
            i8 = i15;
            str10 = str25;
            num4 = num7;
            str11 = str26;
            num5 = num8;
            num6 = num9;
            bool2 = bool3;
            i9 = i16;
            str12 = str27;
            z11 = z21;
            z12 = z22;
            j4 = j8;
            list2 = list3;
            str13 = str20;
            str14 = str21;
            str15 = str22;
            str16 = str23;
            i10 = i12;
            i11 = i13;
            paperOrientation2 = paperOrientation3;
            z13 = z17;
            j5 = j6;
            z14 = z18;
            z15 = z19;
            z16 = z23;
            str17 = str19;
        }
        return noteVO.copy(str24, str17, str13, str14, str15, str16, i10, i11, paperOrientation2, z13, j5, j7, z14, z15, z16, i7, i8, str10, num4, str11, num5, num6, bool2, i9, str12, z11, z12, j4, z10, list2, z9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsPdf() {
        return this.isPdf;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getInSelectMode() {
        return this.inSelectMode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getHighLightText() {
        return this.highLightText;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getPlaceHolderState() {
        return this.placeHolderState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageNoteId() {
        return this.pageNoteId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getToUpdateFileId() {
        return this.toUpdateFileId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getSortKey() {
        return this.sortKey;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getImportProgress() {
        return this.importProgress;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getUnboundedNote() {
        return this.unboundedNote;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getFolderCoverColor() {
        return this.folderCoverColor;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getCreationTimeStr() {
        return this.creationTimeStr;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getLockAdded() {
        return this.lockAdded;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final long getLastOpenedTime() {
        return this.lastOpenedTime;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getIsImportedFromFileManager() {
        return this.isImportedFromFileManager;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    public final List<ItemLabelVO> component30() {
        return this.labelList;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final boolean getShowMoreBtn() {
        return this.showMoreBtn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTnPath() {
        return this.tnPath;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    public final NoteVO copy(String id, String pageNoteId, String uid, String name, String parentId, String tnPath, int width, int height, PaperOrientation orientation, boolean isPdf, long creationTime, long lastModificationTime, boolean inSelectMode, boolean isSelected, boolean isFavorite, int totalPages, int type, String highLightText, Integer placeHolderState, String toUpdateFileId, Integer sortKey, Integer importProgress, Boolean unboundedNote, int folderCoverColor, String creationTimeStr, boolean lockAdded, boolean locked, long lastOpenedTime, boolean isImportedFromFileManager, List<ItemLabelVO> labelList, boolean showMoreBtn) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(uid, "uid");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(labelList, "labelList");
        return new NoteVO(id, pageNoteId, uid, name, parentId, tnPath, width, height, orientation, isPdf, creationTime, lastModificationTime, inSelectMode, isSelected, isFavorite, totalPages, type, highLightText, placeHolderState, toUpdateFileId, sortKey, importProgress, unboundedNote, folderCoverColor, creationTimeStr, lockAdded, locked, lastOpenedTime, isImportedFromFileManager, labelList, showMoreBtn);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteVO)) {
            return false;
        }
        NoteVO noteVO = (NoteVO) other;
        return OooOOO0.OooO0O0(this.id, noteVO.id) && OooOOO0.OooO0O0(this.pageNoteId, noteVO.pageNoteId) && OooOOO0.OooO0O0(this.uid, noteVO.uid) && OooOOO0.OooO0O0(this.name, noteVO.name) && OooOOO0.OooO0O0(this.parentId, noteVO.parentId) && OooOOO0.OooO0O0(this.tnPath, noteVO.tnPath) && this.width == noteVO.width && this.height == noteVO.height && this.orientation == noteVO.orientation && this.isPdf == noteVO.isPdf && this.creationTime == noteVO.creationTime && this.lastModificationTime == noteVO.lastModificationTime && this.inSelectMode == noteVO.inSelectMode && this.isSelected == noteVO.isSelected && this.isFavorite == noteVO.isFavorite && this.totalPages == noteVO.totalPages && this.type == noteVO.type && OooOOO0.OooO0O0(this.highLightText, noteVO.highLightText) && OooOOO0.OooO0O0(this.placeHolderState, noteVO.placeHolderState) && OooOOO0.OooO0O0(this.toUpdateFileId, noteVO.toUpdateFileId) && OooOOO0.OooO0O0(this.sortKey, noteVO.sortKey) && OooOOO0.OooO0O0(this.importProgress, noteVO.importProgress) && OooOOO0.OooO0O0(this.unboundedNote, noteVO.unboundedNote) && this.folderCoverColor == noteVO.folderCoverColor && OooOOO0.OooO0O0(this.creationTimeStr, noteVO.creationTimeStr) && this.lockAdded == noteVO.lockAdded && this.locked == noteVO.locked && this.lastOpenedTime == noteVO.lastOpenedTime && this.isImportedFromFileManager == noteVO.isImportedFromFileManager && OooOOO0.OooO0O0(this.labelList, noteVO.labelList) && this.showMoreBtn == noteVO.showMoreBtn;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getCreationTimeStr() {
        return this.creationTimeStr;
    }

    public final int getFolderCoverColor() {
        return this.folderCoverColor;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getHighLightText() {
        return this.highLightText;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getImportProgress() {
        return this.importProgress;
    }

    public final boolean getInSelectMode() {
        return this.inSelectMode;
    }

    public final ItemData getItemData() {
        int i = this.type;
        if (i == 0) {
            return new ItemData(null, this.id, null, 0, 5);
        }
        if (i == 1) {
            return new ItemData(this.id, null, null, 1, 6);
        }
        if (i == 2) {
            return new ItemData(null, this.pageNoteId, this.id, 2, 1);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteVO");
        c20358OooO00o.OooO0OO("getItemData: type is invalid", new Object[0]);
        return null;
    }

    public final List<ItemLabelVO> getLabelList() {
        return this.labelList;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final long getLastOpenedTime() {
        return this.lastOpenedTime;
    }

    public final boolean getLockAdded() {
        return this.lockAdded;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final String getName() {
        return this.name;
    }

    public final PaperOrientation getOrientation() {
        return this.orientation;
    }

    public final String getPageNoteId() {
        return this.pageNoteId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final Integer getPlaceHolderState() {
        return this.placeHolderState;
    }

    public final boolean getShowMoreBtn() {
        return this.showMoreBtn;
    }

    public final Integer getSortKey() {
        return this.sortKey;
    }

    public final String getTnPath() {
        return this.tnPath;
    }

    public final String getToUpdateFileId() {
        return this.toUpdateFileId;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUid() {
        return this.uid;
    }

    public final Boolean getUnboundedNote() {
        return this.unboundedNote;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.pageNoteId;
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.uid), 31, this.name);
        String str2 = this.parentId;
        int iOooO00o = C20785Oooo00o.OooO00o(this.type, C20785Oooo00o.OooO00o(this.totalPages, o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0((this.orientation.hashCode() + C20785Oooo00o.OooO00o(this.height, C20785Oooo00o.OooO00o(this.width, OooO00o.OooO0O0((iOooO0O0 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.tnPath), 31), 31)) * 31, 31, this.isPdf), 31, this.creationTime), 31, this.lastModificationTime), 31, this.inSelectMode), 31, this.isSelected), 31, this.isFavorite), 31), 31);
        String str3 = this.highLightText;
        int iHashCode2 = (iOooO00o + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.placeHolderState;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.toUpdateFileId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.sortKey;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.importProgress;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.unboundedNote;
        int iOooO00o2 = C20785Oooo00o.OooO00o(this.folderCoverColor, (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str5 = this.creationTimeStr;
        return Boolean.hashCode(this.showMoreBtn) + C21445Oooo.OooO00o(this.labelList, o00000.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0(o00000.OooO0O0((iOooO00o2 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.lockAdded), 31, this.locked), 31, this.lastOpenedTime), 31, this.isImportedFromFileManager), 31);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final boolean isImportedFromFileManager() {
        return this.isImportedFromFileManager;
    }

    public final boolean isPdf() {
        return this.isPdf;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final C31076OoooOOO mapToSortVO() {
        return new C31076OoooOOO(this.creationTime, this.lastModificationTime, Long.valueOf(this.lastOpenedTime), this.name, this.sortKey, this.parentId, Integer.valueOf(this.type), 0, 128);
    }

    public final void setImportedFromFileManager(boolean z) {
        this.isImportedFromFileManager = z;
    }

    public final void setLabelList(List<ItemLabelVO> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.labelList = list;
    }

    public final void setShowMoreBtn(boolean z) {
        this.showMoreBtn = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pageNoteId;
        String str3 = this.uid;
        String str4 = this.name;
        String str5 = this.parentId;
        String str6 = this.tnPath;
        int i = this.width;
        int i2 = this.height;
        PaperOrientation paperOrientation = this.orientation;
        boolean z = this.isPdf;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        boolean z2 = this.inSelectMode;
        boolean z3 = this.isSelected;
        boolean z4 = this.isFavorite;
        int i3 = this.totalPages;
        int i4 = this.type;
        String str7 = this.highLightText;
        Integer num = this.placeHolderState;
        String str8 = this.toUpdateFileId;
        Integer num2 = this.sortKey;
        Integer num3 = this.importProgress;
        Boolean bool = this.unboundedNote;
        int i5 = this.folderCoverColor;
        String str9 = this.creationTimeStr;
        boolean z5 = this.lockAdded;
        boolean z6 = this.locked;
        long j3 = this.lastOpenedTime;
        boolean z7 = this.isImportedFromFileManager;
        List<ItemLabelVO> list = this.labelList;
        boolean z8 = this.showMoreBtn;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteVO(id=", str, ", pageNoteId=", str2, ", uid=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", name=", str4, ", parentId=");
        OooO0OO.OooO0o0(sbOooO0O0, str5, ", tnPath=", str6, ", width=");
        C24472OooOoo.OooO0O0(sbOooO0O0, ", height=", ", orientation=", i, i2);
        sbOooO0O0.append(paperOrientation);
        sbOooO0O0.append(", isPdf=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", inSelectMode=", sbOooO0O0);
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", isSelected=");
        sbOooO0O0.append(z3);
        sbOooO0O0.append(", isFavorite=");
        sbOooO0O0.append(z4);
        sbOooO0O0.append(", totalPages=");
        sbOooO0O0.append(i3);
        sbOooO0O0.append(", type=");
        C21036OooOOo0.OooO0Oo(i4, ", highLightText=", str7, ", placeHolderState=", sbOooO0O0);
        sbOooO0O0.append(num);
        sbOooO0O0.append(", toUpdateFileId=");
        sbOooO0O0.append(str8);
        sbOooO0O0.append(", sortKey=");
        sbOooO0O0.append(num2);
        sbOooO0O0.append(", importProgress=");
        sbOooO0O0.append(num3);
        sbOooO0O0.append(", unboundedNote=");
        sbOooO0O0.append(bool);
        sbOooO0O0.append(", folderCoverColor=");
        sbOooO0O0.append(i5);
        sbOooO0O0.append(", creationTimeStr=");
        sbOooO0O0.append(str9);
        sbOooO0O0.append(", lockAdded=");
        sbOooO0O0.append(z5);
        sbOooO0O0.append(", locked=");
        sbOooO0O0.append(z6);
        sbOooO0O0.append(", lastOpenedTime=");
        sbOooO0O0.append(j3);
        sbOooO0O0.append(", isImportedFromFileManager=");
        sbOooO0O0.append(z7);
        sbOooO0O0.append(", labelList=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", showMoreBtn=");
        sbOooO0O0.append(z8);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.pageNoteId);
        dest.writeString(this.uid);
        dest.writeString(this.name);
        dest.writeString(this.parentId);
        dest.writeString(this.tnPath);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeString(this.orientation.name());
        dest.writeInt(this.isPdf ? 1 : 0);
        dest.writeLong(this.creationTime);
        dest.writeLong(this.lastModificationTime);
        dest.writeInt(this.inSelectMode ? 1 : 0);
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeInt(this.isFavorite ? 1 : 0);
        dest.writeInt(this.totalPages);
        dest.writeInt(this.type);
        dest.writeString(this.highLightText);
        Integer num = this.placeHolderState;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.toUpdateFileId);
        Integer num2 = this.sortKey;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.importProgress;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Boolean bool = this.unboundedNote;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.folderCoverColor);
        dest.writeString(this.creationTimeStr);
        dest.writeInt(this.lockAdded ? 1 : 0);
        dest.writeInt(this.locked ? 1 : 0);
        dest.writeLong(this.lastOpenedTime);
        dest.writeInt(this.isImportedFromFileManager ? 1 : 0);
        List<ItemLabelVO> list = this.labelList;
        dest.writeInt(list.size());
        Iterator<ItemLabelVO> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.showMoreBtn ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoteVO(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, PaperOrientation paperOrientation, boolean z, long j, long j2, boolean z2, boolean z3, boolean z4, int i3, int i4, String str7, Integer num, String str8, Integer num2, Integer num3, Boolean bool, int i5, String str9, boolean z5, boolean z6, long j3, boolean z7, List list, boolean z8, int i6, C24018OooO0oo c24018OooO0oo) {
        int i7;
        String str10 = (i6 & 2) != 0 ? null : str2;
        String str11 = (i6 & 131072) != 0 ? null : str7;
        Integer num4 = (i6 & 262144) != 0 ? null : num;
        String str12 = (i6 & 524288) != 0 ? null : str8;
        Integer num5 = (i6 & 1048576) != 0 ? null : num2;
        Integer num6 = (i6 & 2097152) != 0 ? null : num3;
        Boolean bool2 = (i6 & 4194304) != 0 ? Boolean.FALSE : bool;
        if ((i6 & 8388608) != 0) {
            int i8 = C27996OooO00o.f99274OooO00o;
            i7 = C27996OooO00o.f99274OooO00o;
        } else {
            i7 = i5;
        }
        this(str, str10, str3, str4, str5, str6, i, i2, paperOrientation, z, j, j2, z2, z3, z4, i3, i4, str11, num4, str12, num5, num6, bool2, i7, (i6 & 16777216) != 0 ? null : str9, (i6 & 33554432) != 0 ? false : z5, (i6 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? false : z6, (i6 & 134217728) != 0 ? 0L : j3, (i6 & WarningType.HINT) != 0 ? false : z7, (i6 & 536870912) != 0 ? C34434OooOoO.f123453OooOo0o : list, (i6 & 1073741824) != 0 ? true : z8);
    }
}
