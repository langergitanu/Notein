package com.orion.notein.domain.models.page;

import OooO.OooO00o;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0.o000000O;
import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.o0Oo0oo;
import OooooO0.C21289OooO0o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.aspose.words.StyleIdentifier;
import com.huawei.agconnect.credential.obs.C17625c;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.DualLinkSourceInfo;
import com.orion.penkit.models.HyperLinkInfo;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.SizeF;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0O0oOo0.C26146OooO00o;
import o0O0oOo0.C26147OooO0O0;
import o0O0oo00.OooO0O0;
import o0oo000O.C31192OooOOOo;
import o0oo0OOo.C31237OooO0O0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b@\b\u0086\b\u0018\u0000 ½\u00012\u00020\u0001:\u0004¾\u0001½\u0001BÙ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120'¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120'¢\u0006\u0004\b*\u0010)J\u001b\u0010,\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010'¢\u0006\u0004\b,\u0010)J\u001b\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010'¢\u0006\u0004\b-\u0010)J\r\u0010.\u001a\u00020\r¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\r¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\r¢\u0006\u0004\b4\u0010/J\r\u00105\u001a\u00020\u0002¢\u0006\u0004\b5\u0010$J\r\u00106\u001a\u00020\u0002¢\u0006\u0004\b6\u0010$J\u0019\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120'¢\u0006\u0004\b7\u0010)J\u0019\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120'¢\u0006\u0004\b8\u0010)J/\u0010>\u001a\u000201\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<¢\u0006\u0004\b>\u0010?JM\u0010C\u001a\u000201\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020\u00122\n\b\u0002\u00100\u001a\u0004\u0018\u00010+¢\u0006\u0004\bC\u0010DJI\u0010C\u001a\u000201\"\u0004\b\u0000\u001092\u0006\u0010F\u001a\u00020E2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020\u0012¢\u0006\u0004\bC\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bI\u0010JJ/\u0010L\u001a\u00020H2\u0006\u0010A\u001a\u00020@2\u0006\u0010F\u001a\u00020E2\u0006\u0010K\u001a\u00020+2\b\b\u0002\u0010B\u001a\u00020\u0012¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u0010¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u000b¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u001f¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bT\u0010$J\u0010\u0010U\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bU\u0010$J\u0010\u0010V\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bX\u0010&J\u0012\u0010Y\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b[\u0010QJ\u0010\u0010\\\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\\\u0010$J\u0010\u0010]\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b]\u0010OJ\u0010\u0010^\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bb\u0010aJ\u0010\u0010c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bc\u0010$J\u0010\u0010d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bd\u0010$J\u0010\u0010e\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\be\u0010_J\u0010\u0010f\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bf\u0010OJ\u0018\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0018\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bi\u0010hJ\u0010\u0010j\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bj\u0010SJâ\u0001\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00102\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fHÆ\u0001¢\u0006\u0004\bk\u0010lJ\u0010\u0010m\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\bm\u0010_J\u001a\u0010o\u001a\u00020\u00102\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bo\u0010pJ?\u0010q\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0'\"\u0004\b\u0000\u001092\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010F\u001a\u00020E2\u0006\u0010K\u001a\u00020+H\u0002¢\u0006\u0004\bq\u0010rJ7\u0010s\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0'\"\u0004\b\u0000\u001092\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bs\u0010tJ-\u0010w\u001a\b\u0012\u0004\u0012\u00020E0\u001b2\u0006\u0010u\u001a\u00020+2\u0006\u0010v\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020EH\u0002¢\u0006\u0004\bw\u0010xJC\u0010|\u001a\u00020{2\u0006\u0010u\u001a\u00020+2\u0006\u0010v\u001a\u00020+2\u0006\u0010K\u001a\u00020+2\u0006\u0010y\u001a\u00020+2\u0012\u0010z\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0'H\u0002¢\u0006\u0004\b|\u0010}JK\u0010~\u001a\u000201\"\u0004\b\u0000\u001092\u0006\u0010F\u001a\u00020E2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020\u0012H\u0002¢\u0006\u0004\b~\u0010GJ]\u0010\u0081\u0001\u001a\u000201\"\u0004\b\u0000\u001092\u0006\u0010F\u001a\u00020E2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010A\u001a\u00020@2\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0\u001b2\b\b\u0002\u0010B\u001a\u00020\u0012H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0083\u0001\u001a\u00020\rHÂ\u0003¢\u0006\u0005\b\u0083\u0001\u0010/R&\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0003\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010$\"\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0004\u0010\u0084\u0001\u001a\u0005\b\u0088\u0001\u0010$\"\u0006\b\u0089\u0001\u0010\u0087\u0001R&\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0006\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010W\"\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\b\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010&\"\u0006\b\u0090\u0001\u0010\u0091\u0001R(\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\n\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010Z\"\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\f\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010Q\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u009a\u0001R&\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u000f\u0010\u0084\u0001\u001a\u0005\b\u009b\u0001\u0010$\"\u0006\b\u009c\u0001\u0010\u0087\u0001R&\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0011\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010O\"\u0006\b\u009f\u0001\u0010 \u0001R&\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0013\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010_\"\u0006\b£\u0001\u0010¤\u0001R&\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0015\u0010¥\u0001\u001a\u0005\b¦\u0001\u0010a\"\u0006\b§\u0001\u0010¨\u0001R&\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0016\u0010¥\u0001\u001a\u0005\b©\u0001\u0010a\"\u0006\bª\u0001\u0010¨\u0001R&\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0017\u0010\u0084\u0001\u001a\u0005\b«\u0001\u0010$\"\u0006\b¬\u0001\u0010\u0087\u0001R&\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0018\u0010\u0084\u0001\u001a\u0005\b\u00ad\u0001\u0010$\"\u0006\b®\u0001\u0010\u0087\u0001R&\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0019\u0010¡\u0001\u001a\u0005\b¯\u0001\u0010_\"\u0006\b°\u0001\u0010¤\u0001R&\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001a\u0010\u009d\u0001\u001a\u0005\b±\u0001\u0010O\"\u0006\b²\u0001\u0010 \u0001R.\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001c\u0010³\u0001\u001a\u0005\b´\u0001\u0010h\"\u0006\bµ\u0001\u0010¶\u0001R.\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001e\u0010³\u0001\u001a\u0005\b·\u0001\u0010h\"\u0006\b¸\u0001\u0010¶\u0001R&\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b \u0010¹\u0001\u001a\u0005\bº\u0001\u0010S\"\u0006\b»\u0001\u0010¼\u0001¨\u0006¿\u0001"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/Page;", "", "", "id", NoteMeta.PROPERTY_NOTE_ID, "Lcom/orion/notein/domain/models/page/PaperSpec;", "paperSpec", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "paperOrientation", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "paperTheme", "Lcom/orion/notein/domain/models/page/PagePaddingStyle;", "paddingStyle", "Landroid/graphics/Rect;", "paperPadding", "tnPath", "", "unbounded", "", "source", "", C17625c.f52155b, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "recoverNoteId", "recoverNoteTitle", "recoverIndex", NoteMeta.PROPERTY_IN_TRASH_BIN, "", "historyPageIdList", "Lcom/orion/notein/domain/models/page/LayeredDisplayItems;", "displayItemsIfSet", "Lcom/orion/notein/domain/models/page/Page$RotationDirection;", "rotationDirection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/page/PaperSpec;Lcom/orion/notein/domain/models/page/PaperOrientation;Lcom/orion/notein/domain/models/papertheme/PaperTheme;Lcom/orion/notein/domain/models/page/PagePaddingStyle;Landroid/graphics/Rect;Ljava/lang/String;ZIJJLjava/lang/String;Ljava/lang/String;IZLjava/util/List;Ljava/util/List;Lcom/orion/notein/domain/models/page/Page$RotationDirection;)V", "toString", "()Ljava/lang/String;", "getOrientation", "()Lcom/orion/notein/domain/models/page/PaperOrientation;", "LoO00ooO/OooOOO;", "getUnrotatedPageSize", "()LoO00ooO/OooOOO;", "getRotatedPageSize", "", "getUnrotatedPrecisePageSize", "getRotatedPrecisePageSize", "getUnrotatedPaperPadding", "()Landroid/graphics/Rect;", "padding", "LoO00ooO/OooOooO;", "setOriginPaperPadding", "(Landroid/graphics/Rect;)V", "getRotatedPaperPadding", "getTnPathForNavigator", "getTnNameForNavigator", "getOriginTnSize", "getTnSize", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "drawPagePaddingOnExport", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;)V", "Landroid/content/Context;", "context", "flag", "drawPage", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;Landroid/content/Context;ILjava/lang/Float;)V", "Landroid/graphics/RectF;", "bounds", "(Landroid/graphics/RectF;Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;Landroid/content/Context;I)V", "Landroid/graphics/Bitmap;", "createTnBitmap", "(Landroid/content/Context;)Landroid/graphics/Bitmap;", "scale", "createTnBitmapWithBounds", "(Landroid/content/Context;Landroid/graphics/RectF;FI)Landroid/graphics/Bitmap;", "hasValidPagePadding", "()Z", "getEffectivePaddingStyle", "()Lcom/orion/notein/domain/models/page/PagePaddingStyle;", "inversePageRotationDirection", "()Lcom/orion/notein/domain/models/page/Page$RotationDirection;", "component1", "component2", "component3", "()Lcom/orion/notein/domain/models/page/PaperSpec;", "component4", "component5", "()Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "component6", "component8", "component9", "component10", "()I", "component11", "()J", "component12", "component13", "component14", "component15", "component16", "component17", "()Ljava/util/List;", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/page/PaperSpec;Lcom/orion/notein/domain/models/page/PaperOrientation;Lcom/orion/notein/domain/models/papertheme/PaperTheme;Lcom/orion/notein/domain/models/page/PagePaddingStyle;Landroid/graphics/Rect;Ljava/lang/String;ZIJJLjava/lang/String;Ljava/lang/String;IZLjava/util/List;Ljava/util/List;Lcom/orion/notein/domain/models/page/Page$RotationDirection;)Lcom/orion/notein/domain/models/page/Page;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "getOffset", "(Lo0O0oo00/OooO0O0;Landroid/graphics/RectF;F)LoO00ooO/OooOOO;", "getScale", "(Lo0O0oo00/OooO0O0;Landroid/graphics/RectF;)LoO00ooO/OooOOO;", "pageWidth", "pageHeight", "createPagePaddingRectList", "(FFLandroid/graphics/RectF;)Ljava/util/List;", "rotation", "offset", "Landroid/graphics/Matrix;", "createPdfExportMatrix", "(FFFFLoO00ooO/OooOOO;)Landroid/graphics/Matrix;", "drawPaperTheme", "Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "noteinDisplayItems", "drawDisplayItems", "(Landroid/graphics/RectF;Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;Landroid/content/Context;Ljava/util/List;I)V", "component7", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getNoteId", "setNoteId", "Lcom/orion/notein/domain/models/page/PaperSpec;", "getPaperSpec", "setPaperSpec", "(Lcom/orion/notein/domain/models/page/PaperSpec;)V", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "getPaperOrientation", "setPaperOrientation", "(Lcom/orion/notein/domain/models/page/PaperOrientation;)V", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "getPaperTheme", "setPaperTheme", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;)V", "Lcom/orion/notein/domain/models/page/PagePaddingStyle;", "getPaddingStyle", "setPaddingStyle", "(Lcom/orion/notein/domain/models/page/PagePaddingStyle;)V", "Landroid/graphics/Rect;", "getTnPath", "setTnPath", "Z", "getUnbounded", "setUnbounded", "(Z)V", "I", "getSource", "setSource", "(I)V", "J", "getCreationTime", "setCreationTime", "(J)V", "getLastModificationTime", "setLastModificationTime", "getRecoverNoteId", "setRecoverNoteId", "getRecoverNoteTitle", "setRecoverNoteTitle", "getRecoverIndex", "setRecoverIndex", "getInTrashBin", "setInTrashBin", "Ljava/util/List;", "getHistoryPageIdList", "setHistoryPageIdList", "(Ljava/util/List;)V", "getDisplayItemsIfSet", "setDisplayItemsIfSet", "Lcom/orion/notein/domain/models/page/Page$RotationDirection;", "getRotationDirection", "setRotationDirection", "(Lcom/orion/notein/domain/models/page/Page$RotationDirection;)V", "Companion", "RotationDirection", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Page {
    private static final boolean DEBUG = true;
    public static final int DEFAULT_RENDER_FLAG = 255;
    public static final boolean ENABLE_CROP_FOR_UNBOUNDED_TN = true;
    public static final int EXPORT_FLAG_INCLUDE_INVISIBLE_LAYER = 8;
    public static final int EXPORT_FLAG_INCLUDE_OUTLINE_AND_COMMENT = 2;
    public static final int EXPORT_FLAG_INCLUDE_PAGE_ELEMENTS = 4;
    public static final int EXPORT_FLAG_INCLUDE_PAGE_PADDING = 16;
    public static final int EXPORT_FLAG_INCLUDE_PAPER_THEME = 1;
    public static final int EXPORT_PDF_RENDER_FLAG = 31;
    public static final int PAGE_SOURCE_COVER = -1;
    public static final int PAGE_SOURCE_TEMPLATE = 1;
    public static final int PAGE_SOURCE_UNKNOWN = 0;
    public static final int PAGE_SOURCE_USER = 2;
    public static final int RENDER_FLAG_HL_STROKE = 4;
    public static final int RENDER_FLAG_HYPERLINK = 32;
    public static final int RENDER_FLAG_IMAGE = 1;
    public static final int RENDER_FLAG_PADDING_STYLE = 128;
    public static final int RENDER_FLAG_QUOTE = 16;
    public static final int RENDER_FLAG_STROKE = 2;
    public static final int RENDER_FLAG_TEXT = 8;
    public static final int RENDER_FLAG_THEME = 64;
    private static final String TAG = "Page";
    private long creationTime;
    private List<LayeredDisplayItems> displayItemsIfSet;
    private List<String> historyPageIdList;
    private String id;
    private boolean inTrashBin;
    private long lastModificationTime;
    private String noteId;
    private PagePaddingStyle paddingStyle;
    private PaperOrientation paperOrientation;
    private Rect paperPadding;
    private PaperSpec paperSpec;
    private PaperTheme paperTheme;
    private int recoverIndex;
    private String recoverNoteId;
    private String recoverNoteTitle;
    private RotationDirection rotationDirection;
    private int source;
    private String tnPath;
    private boolean unbounded;
    private static final int TN_LONG_SIDE = o000000O.OooO0o(130);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/Page$RotationDirection;", "", "<init>", "(Ljava/lang/String;I)V", "ROTATION_0", "CLOCKWISE_90", "ROTATION_180", "CLOCKWISE_270", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class RotationDirection {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ RotationDirection[] $VALUES;
        public static final RotationDirection ROTATION_0 = new RotationDirection("ROTATION_0", 0);
        public static final RotationDirection CLOCKWISE_90 = new RotationDirection("CLOCKWISE_90", 1);
        public static final RotationDirection ROTATION_180 = new RotationDirection("ROTATION_180", 2);
        public static final RotationDirection CLOCKWISE_270 = new RotationDirection("CLOCKWISE_270", 3);

        private static final /* synthetic */ RotationDirection[] $values() {
            return new RotationDirection[]{ROTATION_0, CLOCKWISE_90, ROTATION_180, CLOCKWISE_270};
        }

        static {
            RotationDirection[] rotationDirectionArr$values = $values();
            $VALUES = rotationDirectionArr$values;
            $ENTRIES = OooO00o.OooO0O0(rotationDirectionArr$values);
        }

        private RotationDirection(String str, int i) {
        }

        public static InterfaceC34452OooO00o<RotationDirection> getEntries() {
            return $ENTRIES;
        }

        public static RotationDirection valueOf(String str) {
            return (RotationDirection) Enum.valueOf(RotationDirection.class, str);
        }

        public static RotationDirection[] values() {
            return (RotationDirection[]) $VALUES.clone();
        }
    }

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RotationDirection.values().length];
            try {
                iArr[RotationDirection.ROTATION_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RotationDirection.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RotationDirection.CLOCKWISE_90.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RotationDirection.CLOCKWISE_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Page() {
        this(null, null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524287, null);
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final Rect getPaperPadding() {
        return this.paperPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Page copy$default(Page page, String str, String str2, PaperSpec paperSpec, PaperOrientation paperOrientation, PaperTheme paperTheme, PagePaddingStyle pagePaddingStyle, Rect rect, String str3, boolean z, int i, long j, long j2, String str4, String str5, int i2, boolean z2, List list, List list2, RotationDirection rotationDirection, int i3, Object obj) {
        RotationDirection rotationDirection2;
        List list3;
        String str6 = (i3 & 1) != 0 ? page.id : str;
        String str7 = (i3 & 2) != 0 ? page.noteId : str2;
        PaperSpec paperSpec2 = (i3 & 4) != 0 ? page.paperSpec : paperSpec;
        PaperOrientation paperOrientation2 = (i3 & 8) != 0 ? page.paperOrientation : paperOrientation;
        PaperTheme paperTheme2 = (i3 & 16) != 0 ? page.paperTheme : paperTheme;
        PagePaddingStyle pagePaddingStyle2 = (i3 & 32) != 0 ? page.paddingStyle : pagePaddingStyle;
        Rect rect2 = (i3 & 64) != 0 ? page.paperPadding : rect;
        String str8 = (i3 & 128) != 0 ? page.tnPath : str3;
        boolean z3 = (i3 & 256) != 0 ? page.unbounded : z;
        int i4 = (i3 & 512) != 0 ? page.source : i;
        long j3 = (i3 & 1024) != 0 ? page.creationTime : j;
        long j4 = (i3 & 2048) != 0 ? page.lastModificationTime : j2;
        String str9 = str6;
        String str10 = (i3 & 4096) != 0 ? page.recoverNoteId : str4;
        String str11 = (i3 & 8192) != 0 ? page.recoverNoteTitle : str5;
        int i5 = (i3 & 16384) != 0 ? page.recoverIndex : i2;
        boolean z4 = (i3 & 32768) != 0 ? page.inTrashBin : z2;
        List list4 = (i3 & 65536) != 0 ? page.historyPageIdList : list;
        List list5 = (i3 & 131072) != 0 ? page.displayItemsIfSet : list2;
        if ((i3 & 262144) != 0) {
            list3 = list5;
            rotationDirection2 = page.rotationDirection;
        } else {
            rotationDirection2 = rotationDirection;
            list3 = list5;
        }
        return page.copy(str9, str7, paperSpec2, paperOrientation2, paperTheme2, pagePaddingStyle2, rect2, str8, z3, i4, j3, j4, str10, str11, i5, z4, list4, list3, rotationDirection2);
    }

    private final List<RectF> createPagePaddingRectList(float pageWidth, float pageHeight, RectF paperPadding) {
        return C34429OooOOo0.OooOO0o(new RectF(0.0f, 0.0f, paperPadding.left, pageHeight), new RectF(pageWidth - paperPadding.right, 0.0f, pageWidth, pageHeight), new RectF(0.0f, 0.0f, pageWidth, paperPadding.top), new RectF(0.0f, pageHeight - paperPadding.bottom, pageWidth, pageHeight));
    }

    private final Matrix createPdfExportMatrix(float pageWidth, float pageHeight, float scale, float rotation, C32443OooOOO<Float, Float> offset) {
        float f = (pageWidth / 2.0f) * scale;
        float f2 = (pageHeight / 2.0f) * scale;
        Matrix matrix = new Matrix();
        matrix.postScale(scale, scale);
        if (rotation != 0.0f) {
            matrix.postRotate(-rotation, f, f2);
        }
        RectF rectF = new RectF(0.0f, 0.0f, pageWidth, pageHeight);
        matrix.mapRect(rectF);
        matrix.postTranslate(-rectF.left, -rectF.top);
        matrix.postTranslate(offset.f116638OooOo0o.floatValue(), -offset.f116637OooOo.floatValue());
        return matrix;
    }

    public static /* synthetic */ Bitmap createTnBitmapWithBounds$default(Page page, Context context, RectF rectF, float f, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 255;
        }
        return page.createTnBitmapWithBounds(context, rectF, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> void drawDisplayItems(RectF bounds, o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, Context context, List<? extends INoteinDisplayItem> noteinDisplayItems, int flag) {
        C32443OooOOO<Float, Float> scale = getScale(renderTarget, bounds);
        float fMin = Math.min(scale.f116638OooOo0o.floatValue(), scale.f116637OooOo.floatValue());
        C32443OooOOO<Float, Float> offset = getOffset(renderTarget, bounds, fMin);
        float fFloatValue = offset.f116638OooOo0o.floatValue();
        float fFloatValue2 = offset.f116637OooOo.floatValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("drawLayer: scale=", fMin, ", dx=", fFloatValue, ", dy=");
        sbOooO0Oo.append(fFloatValue2);
        c20358OooO00o.OooO00o(sbOooO0Oo.toString(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = noteinDisplayItems.iterator();
        while (it.hasNext()) {
            InterfaceC31284OooO0O0 displayItem = ((INoteinDisplayItem) it.next()).toDisplayItem(context);
            if (displayItem == null) {
                displayItem = null;
            } else {
                Rect rect = this.paperPadding;
                displayItem.offset(rect.left * 1.0f, rect.top * 1.0f);
                if (RectF.intersects(displayItem.getBoundingBox(1.0f), bounds)) {
                    displayItem.scale(fMin, true);
                    displayItem.offset(fFloatValue, fFloatValue2);
                }
            }
            if (displayItem != null) {
                arrayList.add(displayItem);
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "drawPage: t1 = "), new Object[0]);
        if ((flag & 1) != 0) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof ImageInfo) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((ImageInfo) it2.next()).render(renderEngine, renderTarget, fMin);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 instanceof DualLinkSourceInfo) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((DualLinkSourceInfo) it3.next()).render(renderEngine, renderTarget, fMin);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof DualLinkRefInfo) {
                    arrayList4.add(obj3);
                }
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ((DualLinkRefInfo) it4.next()).render(renderEngine, renderTarget, fMin);
            }
        }
        if ((flag & 32) != 0) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (obj4 instanceof HyperLinkInfo) {
                    arrayList5.add(obj4);
                }
            }
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                HyperLinkInfo.renderLinkIcon$default((HyperLinkInfo) it5.next(), renderEngine, renderTarget, fMin, null, 8, null);
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "drawPage: t2 = "), new Object[0]);
        if ((flag & 8) != 0) {
            ArrayList<TextBoxInfo> arrayList6 = new ArrayList();
            for (Object obj5 : arrayList) {
                if (obj5 instanceof TextBoxInfo) {
                    arrayList6.add(obj5);
                }
            }
            for (TextBoxInfo textBoxInfo : arrayList6) {
                if (fMin != 0.0f) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = textBoxInfo.deepCopy(textBoxInfo.getId());
                    OooOOO0.OooO0o0(interfaceC31284OooO0O0DeepCopy, "null cannot be cast to non-null type com.orion.penkit.models.TextBoxInfo");
                    TextBoxInfo textBoxInfo2 = (TextBoxInfo) interfaceC31284OooO0O0DeepCopy;
                    textBoxInfo2.offset(-fFloatValue, -fFloatValue2);
                    textBoxInfo2.scale(1.0f / fMin, true);
                    float fMax = Math.max(textBoxInfo2.getBounds().width(), textBoxInfo2.getBounds().height());
                    if (fMax < 2048.0f) {
                        textBoxInfo2.scale(2048.0f / fMax, true);
                    }
                    C31237OooO0O0.f111407OooO0O0.getClass();
                    textBoxInfo.render(renderEngine, renderTarget, C31237OooO0O0.OooO0O0(context, textBoxInfo2), fMin);
                }
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o("drawPage: t3 = " + System.currentTimeMillis() + ", stroke count = " + arrayList.size(), new Object[0]);
        if ((flag & 2) != 0) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj6 : arrayList) {
                if (obj6 instanceof DrawRecord) {
                    arrayList7.add(obj6);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj7 : arrayList7) {
                DrawRecord drawRecord = (DrawRecord) obj7;
                if (drawRecord.getPenType() != 2 && drawRecord.getPenType() != 9 && drawRecord.getPenType() != 6) {
                    arrayList8.add(obj7);
                }
            }
            Iterator it6 = arrayList8.iterator();
            while (it6.hasNext()) {
                ((DrawRecord) it6.next()).render(renderEngine, renderTarget, fMin);
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj8 : arrayList) {
                if (obj8 instanceof InkStrokeInfo) {
                    arrayList9.add(obj8);
                }
            }
            Iterator it7 = arrayList9.iterator();
            while (it7.hasNext()) {
                ((InkStrokeInfo) it7.next()).render(renderEngine, renderTarget, 1.0f);
            }
            ArrayList arrayList10 = new ArrayList();
            for (Object obj9 : arrayList) {
                if (obj9 instanceof ShapeInfo) {
                    arrayList10.add(obj9);
                }
            }
            ArrayList arrayList11 = new ArrayList();
            for (Object obj10 : arrayList10) {
                if (((ShapeInfo) obj10).getBlendMode() == -1) {
                    arrayList11.add(obj10);
                }
            }
            Iterator it8 = arrayList11.iterator();
            while (it8.hasNext()) {
                ((ShapeInfo) it8.next()).render(renderEngine, renderTarget, fMin);
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "drawPage: t4 = "), new Object[0]);
        if ((flag & 4) != 0) {
            ArrayList arrayList12 = new ArrayList();
            for (Object obj11 : arrayList) {
                if (obj11 instanceof DrawRecord) {
                    arrayList12.add(obj11);
                }
            }
            ArrayList arrayList13 = new ArrayList();
            for (Object obj12 : arrayList12) {
                DrawRecord drawRecord2 = (DrawRecord) obj12;
                if (drawRecord2.getPenType() == 2 || drawRecord2.getPenType() == 9 || drawRecord2.getPenType() == 6) {
                    arrayList13.add(obj12);
                }
            }
            Iterator it9 = arrayList13.iterator();
            while (it9.hasNext()) {
                ((DrawRecord) it9.next()).render(renderEngine, renderTarget, fMin);
            }
            ArrayList arrayList14 = new ArrayList();
            for (Object obj13 : arrayList) {
                if (obj13 instanceof ShapeInfo) {
                    arrayList14.add(obj13);
                }
            }
            ArrayList arrayList15 = new ArrayList();
            for (Object obj14 : arrayList14) {
                ShapeInfo shapeInfo = (ShapeInfo) obj14;
                if (shapeInfo.getBlendMode() == 13 || shapeInfo.getBlendMode() == 16) {
                    arrayList15.add(obj14);
                }
            }
            Iterator it10 = arrayList15.iterator();
            while (it10.hasNext()) {
                ((ShapeInfo) it10.next()).render(renderEngine, renderTarget, fMin);
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "drawPage: t5 = "), new Object[0]);
        if ((flag & 16) != 0) {
            ArrayList<QuoteInfo> arrayList16 = new ArrayList();
            for (Object obj15 : arrayList) {
                if (obj15 instanceof QuoteInfo) {
                    arrayList16.add(obj15);
                }
            }
            for (QuoteInfo quoteInfo : arrayList16) {
                quoteInfo.copy((16382 & 1) != 0 ? quoteInfo.id : null, (16382 & 2) != 0 ? quoteInfo.bgColor : 0, (16382 & 4) != 0 ? quoteInfo.underlineColor : 0, (16382 & 8) != 0 ? quoteInfo.labelRect : null, (16382 & 16) != 0 ? quoteInfo.type : 0, (16382 & 32) != 0 ? quoteInfo.rectList : null, (16382 & 64) != 0 ? quoteInfo.text : null, (16382 & 128) != 0 ? quoteInfo.linkCommentId : null, (16382 & 256) != 0 ? quoteInfo.layerId : null, (16382 & 512) != 0 ? quoteInfo.creationTime : 0L, (16382 & 1024) != 0 ? quoteInfo.annoItemIdList : null, (16382 & 2048) != 0 ? quoteInfo.iconBounds : null, (16382 & 4096) != 0 ? quoteInfo.isVerticalPdfText : false, (16382 & 8192) != 0 ? quoteInfo.isRtlOrBttPdfText : false).render(renderEngine, renderTarget, fMin);
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "drawPage: t6 = "), new Object[0]);
    }

    public static /* synthetic */ void drawDisplayItems$default(Page page, RectF rectF, o0O0oo00.OooO00o oooO00o, OooO0O0 oooO0O0, Context context, List list, int i, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            i = 255;
        }
        page.drawDisplayItems(rectF, oooO00o, oooO0O0, context, list, i);
    }

    public static /* synthetic */ void drawPage$default(Page page, o0O0oo00.OooO00o oooO00o, OooO0O0 oooO0O0, Context context, int i, Float f, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 255;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            f = null;
        }
        page.drawPage(oooO00o, oooO0O0, context, i3, f);
    }

    private final <T> void drawPaperTheme(RectF bounds, o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, Context context, int flag) {
        PaperTheme paperTheme;
        C34406OooO00o.f123390OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0O0(System.currentTimeMillis(), "drawPage: t0 = "), new Object[0]);
        boolean z = (flag & 64) != 0;
        boolean z2 = (flag & 128) != 0;
        if (z || z2) {
            C32443OooOOO<Float, Float> scale = getScale(renderTarget, bounds);
            float fFloatValue = scale.f116638OooOo0o.floatValue();
            float fFloatValue2 = scale.f116637OooOo.floatValue();
            float fMin = Math.min(fFloatValue, fFloatValue2);
            if (!hasValidPagePadding()) {
                if (!z || (paperTheme = this.paperTheme) == null) {
                    return;
                }
                paperTheme.render(renderEngine, renderTarget, fMin);
                return;
            }
            C32443OooOOO<Float, Float> offset = getOffset(renderTarget, bounds, fMin);
            if (z2) {
                C32443OooOOO<RectF, PaperTheme> c32443OooOOOGeneratePaddingRenderRegion = getEffectivePaddingStyle().generatePaddingRenderRegion(this);
                RectF rectF = c32443OooOOOGeneratePaddingRenderRegion.f116638OooOo0o;
                PaperTheme paperTheme2 = c32443OooOOOGeneratePaddingRenderRegion.f116637OooOo;
                rectF.offset(-rectF.left, -rectF.top);
                rectF.left = offset.f116638OooOo0o.floatValue() + (rectF.left * fFloatValue);
                float f = rectF.top * fFloatValue2;
                Float f2 = offset.f116637OooOo;
                rectF.top = f2.floatValue() + f;
                rectF.right = offset.f116638OooOo0o.floatValue() + (rectF.right * fFloatValue);
                rectF.bottom = f2.floatValue() + (rectF.bottom * fFloatValue2);
                paperTheme2.render(renderEngine, renderTarget, fMin, rectF);
            }
            if (z) {
                C32443OooOOO<Integer, Integer> unrotatedPageSize = getUnrotatedPageSize();
                int iIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
                int iIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
                Rect rect = this.paperPadding;
                RectF rectF2 = new RectF(new RectF(rect.left * 1.0f, rect.top * 1.0f, (iIntValue - rect.right) * 1.0f, (iIntValue2 - rect.bottom) * 1.0f));
                rectF2.left = offset.f116638OooOo0o.floatValue() + (rectF2.left * fFloatValue);
                float f3 = rectF2.top * fFloatValue2;
                Float f4 = offset.f116637OooOo;
                rectF2.top = f4.floatValue() + f3;
                rectF2.right = offset.f116638OooOo0o.floatValue() + (rectF2.right * fFloatValue);
                rectF2.bottom = f4.floatValue() + (rectF2.bottom * fFloatValue2);
                PaperTheme paperTheme3 = this.paperTheme;
                if (paperTheme3 != null) {
                    paperTheme3.render(renderEngine, renderTarget, fMin, rectF2);
                }
            }
        }
    }

    public static /* synthetic */ void drawPaperTheme$default(Page page, RectF rectF, o0O0oo00.OooO00o oooO00o, OooO0O0 oooO0O0, Context context, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 255;
        }
        page.drawPaperTheme(rectF, oooO00o, oooO0O0, context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> C32443OooOOO<Float, Float> getOffset(OooO0O0<T> renderTarget, RectF bounds, float scale) {
        if (!(renderTarget instanceof C26147OooO0O0) || this.unbounded) {
            C32443OooOOO<Float, Float> c32443OooOOO = new C32443OooOOO<>(Float.valueOf((-bounds.left) * scale), Float.valueOf((-bounds.top) * scale));
            C34406OooO00o.f123390OooO00o.OooO00o("getOffset: " + c32443OooOOO, new Object[0]);
            return c32443OooOOO;
        }
        C26147OooO0O0 c26147OooO0O0 = (C26147OooO0O0) renderTarget;
        PdfiumCore pdfiumCore = c26147OooO0O0.f89218OooO00o;
        PdfDocument pdfDocument = c26147OooO0O0.f89219OooO0O0;
        int i = c26147OooO0O0.f89220OooO0OO;
        SizeF pageOffset = pdfiumCore.getPageOffset(pdfDocument, i);
        int rotation = pdfiumCore.getRotation(pdfDocument, i);
        C32443OooOOO c32443OooOOO2 = rotation != 1 ? rotation != 2 ? rotation != 3 ? new C32443OooOOO(Float.valueOf(pageOffset.getWidth()), Float.valueOf(pageOffset.getHeight())) : new C32443OooOOO(Float.valueOf(-pageOffset.getHeight()), Float.valueOf(pageOffset.getWidth())) : new C32443OooOOO(Float.valueOf(-pageOffset.getWidth()), Float.valueOf(-pageOffset.getHeight())) : new C32443OooOOO(Float.valueOf(pageOffset.getHeight()), Float.valueOf(-pageOffset.getWidth()));
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PdfiumTarget");
        c20358OooO00o.OooO00o("getOffsetWithRotation: " + c32443OooOOO2, new Object[0]);
        return new C32443OooOOO<>(c32443OooOOO2.f116638OooOo0o, Float.valueOf(-((Number) c32443OooOOO2.f116637OooOo).floatValue()));
    }

    private final <T> C32443OooOOO<Float, Float> getScale(OooO0O0<T> renderTarget, RectF bounds) {
        Float fValueOf = Float.valueOf(bounds.width());
        Float fValueOf2 = Float.valueOf(bounds.height());
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        C32443OooOOO<Float, Float> size = renderTarget.getSize();
        return new C32443OooOOO<>(Float.valueOf(size.f116638OooOo0o.floatValue() / fFloatValue), Float.valueOf(size.f116637OooOo.floatValue() / fFloatValue2));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getSource() {
        return this.source;
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
    public final String getRecoverNoteId() {
        return this.recoverNoteId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRecoverNoteTitle() {
        return this.recoverNoteTitle;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getRecoverIndex() {
        return this.recoverIndex;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    public final List<String> component17() {
        return this.historyPageIdList;
    }

    public final List<LayeredDisplayItems> component18() {
        return this.displayItemsIfSet;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final RotationDirection getRotationDirection() {
        return this.rotationDirection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaperSpec getPaperSpec() {
        return this.paperSpec;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaperOrientation getPaperOrientation() {
        return this.paperOrientation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaperTheme getPaperTheme() {
        return this.paperTheme;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PagePaddingStyle getPaddingStyle() {
        return this.paddingStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTnPath() {
        return this.tnPath;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getUnbounded() {
        return this.unbounded;
    }

    public final Page copy(String id, String noteId, PaperSpec paperSpec, PaperOrientation paperOrientation, PaperTheme paperTheme, PagePaddingStyle paddingStyle, Rect paperPadding, String tnPath, boolean unbounded, int source, long creationTime, long lastModificationTime, String recoverNoteId, String recoverNoteTitle, int recoverIndex, boolean inTrashBin, List<String> historyPageIdList, List<LayeredDisplayItems> displayItemsIfSet, RotationDirection rotationDirection) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(paperSpec, "paperSpec");
        OooOOO0.OooO0oO(paperOrientation, "paperOrientation");
        OooOOO0.OooO0oO(paperPadding, "paperPadding");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(recoverNoteId, "recoverNoteId");
        OooOOO0.OooO0oO(recoverNoteTitle, "recoverNoteTitle");
        OooOOO0.OooO0oO(rotationDirection, "rotationDirection");
        return new Page(id, noteId, paperSpec, paperOrientation, paperTheme, paddingStyle, paperPadding, tnPath, unbounded, source, creationTime, lastModificationTime, recoverNoteId, recoverNoteTitle, recoverIndex, inTrashBin, historyPageIdList, displayItemsIfSet, rotationDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap createTnBitmap(Context context) {
        OooOOO0.OooO0oO(context, "context");
        C32443OooOOO<Integer, Integer> originTnSize = getOriginTnSize();
        int iIntValue = originTnSize.f116638OooOo0o.intValue();
        int iIntValue2 = originTnSize.f116637OooOo.intValue();
        C32443OooOOO c32443OooOOO = (iIntValue == 0 || iIntValue2 == 0) ? new C32443OooOOO(230, Integer.valueOf(StyleIdentifier.LIST_TABLE_4)) : new C32443OooOOO(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        int iIntValue3 = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        int iIntValue4 = ((Number) c32443OooOOO.f116637OooOo).intValue();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue3, iIntValue4, Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(new Canvas(bitmapCreateBitmap), context, iIntValue3 / this.paperSpec.getWidth(), iIntValue4 / this.paperSpec.getHeight());
        C26120OooO0Oo c26120OooO0Oo = new C26120OooO0Oo();
        c26120OooO0Oo.OooOo00(c26121OooO0o0);
        drawPage$default(this, c26120OooO0Oo, c26121OooO0o0, context, 0, (Float) null, 24, (Object) null);
        return bitmapCreateBitmap;
    }

    public final Bitmap createTnBitmapWithBounds(Context context, RectF bounds, float scale, int flag) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(bounds, "bounds");
        RectF rectF = new RectF(bounds);
        rectF.offsetTo(-rectF.left, -rectF.top);
        RectF rectFOooO0Oo = o00OO0O0.OooO0O0.OooO0Oo(rectF, 0.0f, 0.0f, scale);
        Float fValueOf = Float.valueOf(rectFOooO0Oo.left);
        Float fValueOf2 = Float.valueOf(rectFOooO0Oo.top);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        int iMax = Math.max(1, C21289OooO0o.OooO0O0(rectFOooO0Oo.width()));
        int iMax2 = Math.max(1, C21289OooO0o.OooO0O0(rectFOooO0Oo.height()));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(new Canvas(bitmapCreateBitmap), context, fFloatValue, fFloatValue2, 0);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sb = new StringBuilder("createTnBitmapByBounds: bounds=");
        sb.append(bounds);
        sb.append(", renderBounds=");
        sb.append(rectF);
        sb.append(", scaledRenderBounds=");
        sb.append(rectFOooO0Oo);
        sb.append(", offset=(");
        sb.append(fFloatValue);
        sb.append(", ");
        sb.append(fFloatValue2);
        sb.append("), size=(");
        sb.append(iMax);
        sb.append(", ");
        c20358OooO00o.OooO00o(C21023OooO0Oo.OooO0OO(")", iMax2, sb), new Object[0]);
        C26120OooO0Oo c26120OooO0Oo = new C26120OooO0Oo();
        c26120OooO0Oo.OooOo00(c26121OooO0o0);
        drawPage(bounds, c26120OooO0Oo, c26121OooO0o0, context, flag);
        return bitmapCreateBitmap;
    }

    public final <T> void drawPage(o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, Context context, int flag, Float padding) {
        RectF rectFOooO0O0;
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(context, "context");
        if (this.unbounded) {
            rectFOooO0O0 = C31192OooOOOo.OooO0O0(this, padding);
        } else {
            C32443OooOOO<Integer, Integer> unrotatedPageSize = getUnrotatedPageSize();
            rectFOooO0O0 = new RectF(0.0f, 0.0f, unrotatedPageSize.f116638OooOo0o.intValue(), unrotatedPageSize.f116637OooOo.intValue());
        }
        drawPage(rectFOooO0O0, renderEngine, renderTarget, context, flag);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void drawPagePaddingOnExport(o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget) {
        int i;
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        if (!hasValidPagePadding()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO00o("drawPagePaddingOnExport: no padding", new Object[0]);
            return;
        }
        C26147OooO0O0 c26147OooO0O0 = renderTarget instanceof C26147OooO0O0 ? (C26147OooO0O0) renderTarget : null;
        if (c26147OooO0O0 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0(TAG);
            c20358OooO00o2.OooOO0O("drawPagePaddingOnExport: not PdfiumTarget", new Object[0]);
            return;
        }
        C26146OooO00o c26146OooO00o = renderEngine instanceof C26146OooO00o ? (C26146OooO00o) renderEngine : null;
        if (c26146OooO00o == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0(TAG);
            c20358OooO00o3.OooOO0O("drawPagePaddingOnExport: not AndroidRenderEngine", new Object[0]);
            return;
        }
        C32443OooOOO<Integer, Integer> unrotatedPageSize = getUnrotatedPageSize();
        float fIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
        float fIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
        C32443OooOOO<Float, Float> scale = getScale(renderTarget, new RectF(0.0f, 0.0f, fIntValue, fIntValue2));
        float fMin = Math.min(scale.f116638OooOo0o.floatValue(), scale.f116637OooOo.floatValue());
        C32443OooOOO<Float, Float> offset = ((C26147OooO0O0) renderTarget).getOffset();
        if (this.unbounded) {
            i = 0;
        } else {
            int rotation = c26147OooO0O0.f89218OooO00o.getRotation(c26147OooO0O0.f89219OooO0O0, c26147OooO0O0.f89220OooO0OO);
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        Matrix matrixCreatePdfExportMatrix = createPdfExportMatrix(fIntValue, fIntValue2, fMin, i, offset);
        PagePaddingStyle effectivePaddingStyle = getEffectivePaddingStyle();
        Integer uniformColorIfApplicable = effectivePaddingStyle.getUniformColorIfApplicable();
        if (uniformColorIfApplicable != null) {
            List<RectF> listCreatePagePaddingRectList = createPagePaddingRectList(fIntValue, fIntValue2, new RectF(getUnrotatedPaperPadding()));
            Paint paint = new Paint();
            paint.setColor(uniformColorIfApplicable.intValue());
            for (RectF rectF : listCreatePagePaddingRectList) {
                matrixCreatePdfExportMatrix.mapRect(rectF);
                ((C26146OooO00o) renderEngine).OooO0o(rectF, paint);
            }
        }
        C32443OooOOO<RectF, PaperTheme> c32443OooOOOGeneratePaddingRenderRegion = effectivePaddingStyle.withColorVariant(0).generatePaddingRenderRegion(this);
        RectF rectF2 = c32443OooOOOGeneratePaddingRenderRegion.f116638OooOo0o;
        PaperTheme paperTheme = c32443OooOOOGeneratePaddingRenderRegion.f116637OooOo;
        RectF rectF3 = new RectF(rectF2);
        matrixCreatePdfExportMatrix.mapRect(rectF3);
        paperTheme.render(c26146OooO00o, c26147OooO0O0, fMin, rectF3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Page)) {
            return false;
        }
        Page page = (Page) other;
        return OooOOO0.OooO0O0(this.id, page.id) && OooOOO0.OooO0O0(this.noteId, page.noteId) && OooOOO0.OooO0O0(this.paperSpec, page.paperSpec) && this.paperOrientation == page.paperOrientation && OooOOO0.OooO0O0(this.paperTheme, page.paperTheme) && OooOOO0.OooO0O0(this.paddingStyle, page.paddingStyle) && OooOOO0.OooO0O0(this.paperPadding, page.paperPadding) && OooOOO0.OooO0O0(this.tnPath, page.tnPath) && this.unbounded == page.unbounded && this.source == page.source && this.creationTime == page.creationTime && this.lastModificationTime == page.lastModificationTime && OooOOO0.OooO0O0(this.recoverNoteId, page.recoverNoteId) && OooOOO0.OooO0O0(this.recoverNoteTitle, page.recoverNoteTitle) && this.recoverIndex == page.recoverIndex && this.inTrashBin == page.inTrashBin && OooOOO0.OooO0O0(this.historyPageIdList, page.historyPageIdList) && OooOOO0.OooO0O0(this.displayItemsIfSet, page.displayItemsIfSet) && this.rotationDirection == page.rotationDirection;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final List<LayeredDisplayItems> getDisplayItemsIfSet() {
        return this.displayItemsIfSet;
    }

    public final PagePaddingStyle getEffectivePaddingStyle() {
        PagePaddingStyle pagePaddingStyle = this.paddingStyle;
        return pagePaddingStyle == null ? PagePaddingStyle.INSTANCE.getDEFAULT() : pagePaddingStyle;
    }

    public final List<String> getHistoryPageIdList() {
        return this.historyPageIdList;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final PaperOrientation getOrientation() {
        return this.paperOrientation;
    }

    public final C32443OooOOO<Integer, Integer> getOriginTnSize() {
        if (this.unbounded) {
            int i = TN_LONG_SIDE;
            return new C32443OooOOO<>(Integer.valueOf(i), Integer.valueOf(i));
        }
        if (this.paperSpec.getWidth() == 0 || this.paperSpec.getHeight() == 0) {
            return new C32443OooOOO<>(0, 0);
        }
        float fMax = TN_LONG_SIDE / Math.max(this.paperSpec.getWidth(), this.paperSpec.getHeight());
        return this.paperOrientation == PaperOrientation.VERTICAL ? new C32443OooOOO<>(Integer.valueOf(oO0O00O.OooO00o.OooO0O0(this.paperSpec.getWidth() * fMax)), Integer.valueOf(oO0O00O.OooO00o.OooO0O0(this.paperSpec.getHeight() * fMax))) : new C32443OooOOO<>(Integer.valueOf(oO0O00O.OooO00o.OooO0O0(this.paperSpec.getHeight() * fMax)), Integer.valueOf(oO0O00O.OooO00o.OooO0O0(this.paperSpec.getWidth() * fMax)));
    }

    public final PagePaddingStyle getPaddingStyle() {
        return this.paddingStyle;
    }

    public final PaperOrientation getPaperOrientation() {
        return this.paperOrientation;
    }

    public final PaperSpec getPaperSpec() {
        return this.paperSpec;
    }

    public final PaperTheme getPaperTheme() {
        return this.paperTheme;
    }

    public final int getRecoverIndex() {
        return this.recoverIndex;
    }

    public final String getRecoverNoteId() {
        return this.recoverNoteId;
    }

    public final String getRecoverNoteTitle() {
        return this.recoverNoteTitle;
    }

    public final C32443OooOOO<Integer, Integer> getRotatedPageSize() {
        C32443OooOOO<Integer, Integer> unrotatedPageSize = getUnrotatedPageSize();
        int iIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
        int iIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
        int i = WhenMappings.$EnumSwitchMapping$0[this.rotationDirection.ordinal()];
        if (i == 1 || i == 2) {
            return new C32443OooOOO<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        if (i == 3 || i == 4) {
            return new C32443OooOOO<>(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
        }
        throw new C32442OooOO0o();
    }

    public final Rect getRotatedPaperPadding() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.rotationDirection.ordinal()];
        if (i == 1) {
            return new Rect(this.paperPadding);
        }
        if (i == 2) {
            Rect rect = this.paperPadding;
            return new Rect(rect.right, rect.bottom, rect.left, rect.top);
        }
        if (i == 3) {
            Rect rect2 = this.paperPadding;
            return new Rect(rect2.bottom, rect2.left, rect2.top, rect2.right);
        }
        if (i != 4) {
            throw new C32442OooOO0o();
        }
        Rect rect3 = this.paperPadding;
        return new Rect(rect3.top, rect3.right, rect3.bottom, rect3.left);
    }

    public final C32443OooOOO<Float, Float> getRotatedPrecisePageSize() {
        C32443OooOOO<Float, Float> unrotatedPrecisePageSize = getUnrotatedPrecisePageSize();
        if (unrotatedPrecisePageSize == null) {
            return null;
        }
        float fFloatValue = unrotatedPrecisePageSize.f116638OooOo0o.floatValue();
        float fFloatValue2 = unrotatedPrecisePageSize.f116637OooOo.floatValue();
        int i = WhenMappings.$EnumSwitchMapping$0[this.rotationDirection.ordinal()];
        if (i == 1 || i == 2) {
            return new C32443OooOOO<>(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
        }
        if (i == 3 || i == 4) {
            return new C32443OooOOO<>(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue));
        }
        throw new C32442OooOO0o();
    }

    public final RotationDirection getRotationDirection() {
        return this.rotationDirection;
    }

    public final int getSource() {
        return this.source;
    }

    public final String getTnNameForNavigator() {
        return OooO0O0.OooO00o.OooO0O0(this.noteId, C18115b5.CONNECTOR, this.id, "_navigator");
    }

    public final String getTnPath() {
        return this.tnPath;
    }

    public final String getTnPathForNavigator() {
        File parentFile = new File(this.tnPath).getParentFile();
        return parentFile == null ? "" : o0Oo0oo.OooO0Oo(parentFile.getAbsolutePath(), File.separator, getTnNameForNavigator());
    }

    public final C32443OooOOO<Integer, Integer> getTnSize() {
        C32443OooOOO<Integer, Integer> originTnSize = getOriginTnSize();
        int iIntValue = originTnSize.f116638OooOo0o.intValue();
        int iIntValue2 = originTnSize.f116637OooOo.intValue();
        int i = WhenMappings.$EnumSwitchMapping$0[this.rotationDirection.ordinal()];
        if (i == 1 || i == 2) {
            return new C32443OooOOO<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        if (i == 3 || i == 4) {
            return new C32443OooOOO<>(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
        }
        throw new C32442OooOO0o();
    }

    public final boolean getUnbounded() {
        return this.unbounded;
    }

    public final C32443OooOOO<Integer, Integer> getUnrotatedPageSize() {
        return this.paperOrientation == PaperOrientation.VERTICAL ? new C32443OooOOO<>(Integer.valueOf(this.paperSpec.getWidth()), Integer.valueOf(this.paperSpec.getHeight())) : new C32443OooOOO<>(Integer.valueOf(this.paperSpec.getHeight()), Integer.valueOf(this.paperSpec.getWidth()));
    }

    public final Rect getUnrotatedPaperPadding() {
        return new Rect(this.paperPadding);
    }

    public final C32443OooOOO<Float, Float> getUnrotatedPrecisePageSize() {
        Float preciseWidth = this.paperSpec.getPreciseWidth();
        Float preciseHeight = this.paperSpec.getPreciseHeight();
        if (preciseWidth == null || preciseHeight == null) {
            return null;
        }
        return this.paperOrientation == PaperOrientation.VERTICAL ? new C32443OooOOO<>(preciseWidth, preciseHeight) : new C32443OooOOO<>(preciseHeight, preciseWidth);
    }

    public final boolean hasValidPagePadding() {
        Rect rect = this.paperPadding;
        return rect.left > 0 || rect.top > 0 || rect.right > 0 || rect.bottom > 0;
    }

    public int hashCode() {
        int iHashCode = (this.paperOrientation.hashCode() + ((this.paperSpec.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId)) * 31)) * 31;
        PaperTheme paperTheme = this.paperTheme;
        int iHashCode2 = (iHashCode + (paperTheme == null ? 0 : paperTheme.hashCode())) * 31;
        PagePaddingStyle pagePaddingStyle = this.paddingStyle;
        int iOooO0O0 = o00000.OooO0O0(C20785Oooo00o.OooO00o(this.recoverIndex, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.source, o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.paperPadding.hashCode() + ((iHashCode2 + (pagePaddingStyle == null ? 0 : pagePaddingStyle.hashCode())) * 31)) * 31, 31, this.tnPath), 31, this.unbounded), 31), 31, this.creationTime), 31, this.lastModificationTime), 31, this.recoverNoteId), 31, this.recoverNoteTitle), 31), 31, this.inTrashBin);
        List<String> list = this.historyPageIdList;
        int iHashCode3 = (iOooO0O0 + (list == null ? 0 : list.hashCode())) * 31;
        List<LayeredDisplayItems> list2 = this.displayItemsIfSet;
        return this.rotationDirection.hashCode() + ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final RotationDirection inversePageRotationDirection() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.rotationDirection.ordinal()];
        if (i == 1) {
            return RotationDirection.ROTATION_0;
        }
        if (i == 2) {
            return RotationDirection.ROTATION_180;
        }
        if (i == 3) {
            return RotationDirection.CLOCKWISE_270;
        }
        if (i == 4) {
            return RotationDirection.CLOCKWISE_90;
        }
        throw new C32442OooOO0o();
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setDisplayItemsIfSet(List<LayeredDisplayItems> list) {
        this.displayItemsIfSet = list;
    }

    public final void setHistoryPageIdList(List<String> list) {
        this.historyPageIdList = list;
    }

    public final void setId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.id = str;
    }

    public final void setInTrashBin(boolean z) {
        this.inTrashBin = z;
    }

    public final void setLastModificationTime(long j) {
        this.lastModificationTime = j;
    }

    public final void setNoteId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.noteId = str;
    }

    public final void setOriginPaperPadding(Rect padding) {
        OooOOO0.OooO0oO(padding, "padding");
        this.paperPadding.set(padding.left, padding.top, padding.right, padding.bottom);
    }

    public final void setPaddingStyle(PagePaddingStyle pagePaddingStyle) {
        this.paddingStyle = pagePaddingStyle;
    }

    public final void setPaperOrientation(PaperOrientation paperOrientation) {
        OooOOO0.OooO0oO(paperOrientation, "<set-?>");
        this.paperOrientation = paperOrientation;
    }

    public final void setPaperSpec(PaperSpec paperSpec) {
        OooOOO0.OooO0oO(paperSpec, "<set-?>");
        this.paperSpec = paperSpec;
    }

    public final void setPaperTheme(PaperTheme paperTheme) {
        this.paperTheme = paperTheme;
    }

    public final void setRecoverIndex(int i) {
        this.recoverIndex = i;
    }

    public final void setRecoverNoteId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.recoverNoteId = str;
    }

    public final void setRecoverNoteTitle(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.recoverNoteTitle = str;
    }

    public final void setRotationDirection(RotationDirection rotationDirection) {
        OooOOO0.OooO0oO(rotationDirection, "<set-?>");
        this.rotationDirection = rotationDirection;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setTnPath(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.tnPath = str;
    }

    public final void setUnbounded(boolean z) {
        this.unbounded = z;
    }

    public String toString() {
        return this.id;
    }

    public Page(String id, String noteId, PaperSpec paperSpec, PaperOrientation paperOrientation, PaperTheme paperTheme, PagePaddingStyle pagePaddingStyle, Rect paperPadding, String tnPath, boolean z, int i, long j, long j2, String recoverNoteId, String recoverNoteTitle, int i2, boolean z2, List<String> list, List<LayeredDisplayItems> list2, RotationDirection rotationDirection) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(paperSpec, "paperSpec");
        OooOOO0.OooO0oO(paperOrientation, "paperOrientation");
        OooOOO0.OooO0oO(paperPadding, "paperPadding");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        OooOOO0.OooO0oO(recoverNoteId, "recoverNoteId");
        OooOOO0.OooO0oO(recoverNoteTitle, "recoverNoteTitle");
        OooOOO0.OooO0oO(rotationDirection, "rotationDirection");
        this.id = id;
        this.noteId = noteId;
        this.paperSpec = paperSpec;
        this.paperOrientation = paperOrientation;
        this.paperTheme = paperTheme;
        this.paddingStyle = pagePaddingStyle;
        this.paperPadding = paperPadding;
        this.tnPath = tnPath;
        this.unbounded = z;
        this.source = i;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.recoverNoteId = recoverNoteId;
        this.recoverNoteTitle = recoverNoteTitle;
        this.recoverIndex = i2;
        this.inTrashBin = z2;
        this.historyPageIdList = list;
        this.displayItemsIfSet = list2;
        this.rotationDirection = rotationDirection;
    }

    public static /* synthetic */ void drawPage$default(Page page, RectF rectF, o0O0oo00.OooO00o oooO00o, OooO0O0 oooO0O0, Context context, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 255;
        }
        page.drawPage(rectF, oooO00o, oooO0O0, context, i);
    }

    public final <T> void drawPage(RectF bounds, o0O0oo00.OooO00o<T> renderEngine, OooO0O0<T> renderTarget, Context context, int flag) {
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
        OooOOO0.OooO0oO(context, "context");
        renderTarget.clear();
        List<LayeredDisplayItems> list = this.displayItemsIfSet;
        if (list != null) {
            for (LayeredDisplayItems layeredDisplayItems : list) {
                PageLayer layer = layeredDisplayItems.getLayer();
                List<INoteinDisplayItem> items = layeredDisplayItems.getItems();
                if (OooOOO0.OooO0O0(layer.getId(), LayerInfo.PAPER_THEME_LAYER_ID)) {
                    drawPaperTheme(bounds, renderEngine, renderTarget, context, flag);
                } else {
                    drawDisplayItems(bounds, renderEngine, renderTarget, context, items, flag);
                }
            }
        }
    }

    public /* synthetic */ Page(String str, String str2, PaperSpec paperSpec, PaperOrientation paperOrientation, PaperTheme paperTheme, PagePaddingStyle pagePaddingStyle, Rect rect, String str3, boolean z, int i, long j, long j2, String str4, String str5, int i2, boolean z2, List list, List list2, RotationDirection rotationDirection, int i3, C24018OooO0oo c24018OooO0oo) {
        this((i3 & 1) != 0 ? UUID.randomUUID().toString() : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? PaperSpec.INSTANCE.getA4() : paperSpec, (i3 & 8) != 0 ? PaperOrientation.VERTICAL : paperOrientation, (i3 & 16) != 0 ? null : paperTheme, (i3 & 32) != 0 ? null : pagePaddingStyle, (i3 & 64) != 0 ? new Rect() : rect, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? 0 : i, (i3 & 1024) != 0 ? System.currentTimeMillis() : j, (i3 & 2048) != 0 ? System.currentTimeMillis() : j2, (i3 & 4096) != 0 ? "" : str4, (i3 & 8192) == 0 ? str5 : "", (i3 & 16384) != 0 ? -1 : i2, (i3 & 32768) != 0 ? false : z2, (i3 & 65536) != 0 ? null : list, (i3 & 131072) != 0 ? null : list2, (i3 & 262144) != 0 ? RotationDirection.ROTATION_0 : rotationDirection);
    }
}
