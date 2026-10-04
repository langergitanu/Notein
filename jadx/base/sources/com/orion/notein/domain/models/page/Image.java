package com.orion.notein.domain.models.page;

import OooOO0.OooO0OO;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.app.OooOOO;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.penkit.models.ImageInfo;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0.C28023OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u0000 W2\u00020\u0001:\u0001WBW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020 2\u0006\u0010#\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u0018J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u0018J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u0018J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u0018J\u0012\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u0010\u001aJ\u0010\u00106\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b6\u0010\u001aJ\u0010\u00107\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b7\u0010\u0016Jl\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010\u0018J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AJ/\u0010F\u001a\u00020E2\u0006\u0010)\u001a\u00020(2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020;2\u0006\u0010D\u001a\u00020;H\u0002¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\u00020E2\u0006\u0010)\u001a\u00020(2\u0006\u0010C\u001a\u00020;2\u0006\u0010D\u001a\u00020;H\u0002¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bK\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bL\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010M\u001a\u0004\bN\u00102\"\u0004\bO\u0010PR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010Q\u001a\u0004\bR\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010SR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010S\u001a\u0004\bT\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bV\u0010\u0016¨\u0006X"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/Image;", "Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "", "id", "pageId", "uri", "layerId", "Landroid/graphics/RectF;", "bounds", "", "rotation", "", C17625c.f52155b, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", "fixed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;FJJZ)V", "scale", "getBoundingBox", "(F)Landroid/graphics/RectF;", "isRegionLoadable", "()Z", "getLayerId", "()Ljava/lang/String;", "getCreationTime", "()J", "deepCopy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/page/INoteinDisplayItem;", "getId", "dx", "dy", "LoO00ooO/OooOooO;", "offset", "(FF)V", "r", "Landroid/graphics/PointF;", "center", "rotate", "(FLandroid/graphics/PointF;)V", "Landroid/content/Context;", "context", "Lo0oo0o/OooO0O0;", "toDisplayItem", "(Landroid/content/Context;)Lo0oo0o/OooO0O0;", "component1", "component2", "component3", "component4", "component5", "()Landroid/graphics/RectF;", "component6", "()F", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/RectF;FJJZ)Lcom/orion/notein/domain/models/page/Image;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "path", "width", "height", "Landroid/graphics/Bitmap;", "safeDecodeFilePathToImage", "(Landroid/content/Context;Ljava/lang/String;II)Landroid/graphics/Bitmap;", "getPlaceHolderDrawable", "(Landroid/content/Context;II)Landroid/graphics/Bitmap;", "Ljava/lang/String;", "getPageId", "getUri", "Landroid/graphics/RectF;", "getBounds", "setBounds", "(Landroid/graphics/RectF;)V", "F", "getRotation", "J", "getLastModificationTime", "Z", "getFixed", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Image implements INoteinDisplayItem {
    public static final int MAX_SIZE_OF_SVG = 2000;
    private RectF bounds;
    public final long creationTime;
    private final boolean fixed;
    public final String id;
    private final long lastModificationTime;
    public final String layerId;
    private final String pageId;
    private final float rotation;
    private final String uri;

    public Image(String id, String pageId, String uri, String layerId, RectF rectF, float f, long j, long j2, boolean z) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(uri, "uri");
        OooOOO0.OooO0oO(layerId, "layerId");
        this.id = id;
        this.pageId = pageId;
        this.uri = uri;
        this.layerId = layerId;
        this.bounds = rectF;
        this.rotation = f;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.fixed = z;
    }

    public static /* synthetic */ Image copy$default(Image image, String str, String str2, String str3, String str4, RectF rectF, float f, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = image.id;
        }
        if ((i & 2) != 0) {
            str2 = image.pageId;
        }
        if ((i & 4) != 0) {
            str3 = image.uri;
        }
        if ((i & 8) != 0) {
            str4 = image.layerId;
        }
        if ((i & 16) != 0) {
            rectF = image.bounds;
        }
        if ((i & 32) != 0) {
            f = image.rotation;
        }
        if ((i & 64) != 0) {
            j = image.creationTime;
        }
        if ((i & 128) != 0) {
            j2 = image.lastModificationTime;
        }
        if ((i & 256) != 0) {
            z = image.fixed;
        }
        boolean z2 = z;
        long j3 = j2;
        long j4 = j;
        RectF rectF2 = rectF;
        float f2 = f;
        return image.copy(str, str2, str3, str4, rectF2, f2, j4, j3, z2);
    }

    private final Bitmap getPlaceHolderDrawable(Context context, int width, int height) {
        if (width <= 0) {
            width = 100;
        }
        if (height <= 0) {
            height = 100;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmapCreateBitmap);
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.bg_deleted_image_placeholder);
        if (drawable != null) {
            drawable.setBounds(0, 0, width, height);
            drawable.draw(canvas);
        }
        Paint paint = new Paint();
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setAlpha(255);
        paint.setTextSize(o000000O.OooO0oo(14.0f));
        paint.setAntiAlias(true);
        paint.setUnderlineText(false);
        String string = context.getString(R.string.image_is_deleted);
        OooOOO0.OooO0o(string, "getString(...)");
        canvas.drawText(context.getString(R.string.image_is_deleted), (width - paint.measureText(string)) / 2.0f, height / 2.0f, paint);
        return bitmapCreateBitmap;
    }

    private final Bitmap safeDecodeFilePathToImage(Context context, String path, int width, int height) {
        Bitmap bitmapDecodeFile;
        if (C33595OooOOo.OooOOo0(path, ".svg", false)) {
            bitmapDecodeFile = C28023OooO00o.OooO00o(context, Uri.fromFile(new File(path)), width, height, Bitmap.Config.ARGB_8888);
        } else if (C33596OooOOo0.OooOOO0(path) != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            bitmapDecodeFile = BitmapFactory.decodeResource(context.getResources(), Integer.parseInt(path), options);
        } else {
            bitmapDecodeFile = BitmapFactory.decodeFile(path);
        }
        return bitmapDecodeFile == null ? getPlaceHolderDrawable(context, width, height) : bitmapDecodeFile;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLayerId() {
        return this.layerId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getFixed() {
        return this.fixed;
    }

    public final Image copy(String id, String pageId, String uri, String layerId, RectF bounds, float rotation, long creationTime, long lastModificationTime, boolean fixed) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(pageId, "pageId");
        OooOOO0.OooO0oO(uri, "uri");
        OooOOO0.OooO0oO(layerId, "layerId");
        return new Image(id, pageId, uri, layerId, bounds, rotation, creationTime, lastModificationTime, fixed);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public INoteinDisplayItem deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return copy$default(this, id, null, null, layerId, new RectF(this.bounds), 0.0f, creationTime, 0L, false, 422, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Image)) {
            return false;
        }
        Image image = (Image) other;
        return OooOOO0.OooO0O0(this.id, image.id) && OooOOO0.OooO0O0(this.pageId, image.pageId) && OooOOO0.OooO0O0(this.uri, image.uri) && OooOOO0.OooO0O0(this.layerId, image.layerId) && OooOOO0.OooO0O0(this.bounds, image.bounds) && Float.compare(this.rotation, image.rotation) == 0 && this.creationTime == image.creationTime && this.lastModificationTime == image.lastModificationTime && this.fixed == image.fixed;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public RectF getBoundingBox(float scale) {
        RectF rectF = this.bounds;
        return rectF != null ? new RectF(rectF) : new RectF();
    }

    public final RectF getBounds() {
        return this.bounds;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public long getCreationTime() {
        return this.creationTime;
    }

    public final boolean getFixed() {
        return this.fixed;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public String getLayerId() {
        return this.layerId;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.pageId), 31, this.uri), 31, this.layerId);
        RectF rectF = this.bounds;
        return Boolean.hashCode(this.fixed) + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20509OooO0oo.OooO0OO(this.rotation, (iOooO0O0 + (rectF == null ? 0 : rectF.hashCode())) * 31, 31), 31, this.creationTime), 31, this.lastModificationTime);
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public boolean isRegionLoadable() {
        return true;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void offset(float dx, float dy) {
        RectF rectF = this.bounds;
        if (rectF != null) {
            rectF.offset(dx, dy);
        }
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public void rotate(float r, PointF center) {
        OooOOO0.OooO0oO(center, "center");
        Matrix matrix = new Matrix();
        matrix.postRotate(r, center.x, center.y);
        RectF rectF = this.bounds;
        if (rectF != null) {
            matrix.mapRect(rectF);
        }
    }

    public final void setBounds(RectF rectF) {
        this.bounds = rectF;
    }

    @Override // com.orion.notein.domain.models.page.INoteinDisplayItem
    public InterfaceC31284OooO0O0 toDisplayItem(Context context) {
        OooOOO0.OooO0oO(context, "context");
        RectF rectF = this.bounds;
        if (rectF != null) {
            float fWidth = rectF.width();
            RectF rectF2 = this.bounds;
            if (rectF2 != null) {
                float fHeight = rectF2.height();
                return new ImageInfo(this.id, this.uri, new RectF(this.bounds), this.rotation, this.layerId, this.creationTime, safeDecodeFilePathToImage(context, this.uri, Math.max(1, (int) fWidth), Math.max(1, (int) fHeight)), this.fixed);
            }
        }
        return null;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.pageId;
        String str3 = this.uri;
        String str4 = this.layerId;
        RectF rectF = this.bounds;
        float f = this.rotation;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        boolean z = this.fixed;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Image(id=", str, ", pageId=", str2, ", uri=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", layerId=", str4, ", bounds=");
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", rotation=");
        sbOooO0O0.append(f);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", fixed=", sbOooO0O0);
        return OooOOO.OooO00o(sbOooO0O0, ")", z);
    }

    public /* synthetic */ Image(String str, String str2, String str3, String str4, RectF rectF, float f, long j, long j2, boolean z, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, str4, (i & 16) != 0 ? null : rectF, f, j, j2, (i & 256) != 0 ? false : z);
    }
}
