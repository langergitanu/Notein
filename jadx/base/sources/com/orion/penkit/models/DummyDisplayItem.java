package com.orion.penkit.models;

import android.graphics.PointF;
import android.graphics.RectF;
import com.huawei.agconnect.credential.obs.C17625c;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020!H\u0016¢\u0006\u0004\b\u0014\u0010\"J\u0017\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010'J'\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010)J\u001f\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010+J\u001d\u0010/\u001a\u00020!2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020!H\u0016¢\u0006\u0004\b1\u00102¨\u00064"}, m80612d2 = {"Lcom/orion/penkit/models/DummyDisplayItem;", "Lo0oo0o/OooO0O0;", "<init>", "()V", "", "getItemType", "()I", "", "getId", "()Ljava/lang/String;", "getLayerId", "", "getCreationTime", "()J", "T", "Lo0O0oo00/OooO00o;", "renderEngine", "Lo0O0oo00/OooO0O0;", "renderTarget", "", "scale", "LoO00ooO/OooOooO;", "render", "(Lo0O0oo00/OooO00o;Lo0O0oo00/OooO0O0;F)V", "penWidthScale", "Landroid/graphics/RectF;", "getBoundingBox", "(F)Landroid/graphics/RectF;", "dx", "dy", "offset", "(FF)V", "zoom", "", "(FZ)V", "id", "deepCopy", "(Ljava/lang/String;)Lo0oo0o/OooO0O0;", "layerId", "(Ljava/lang/String;Ljava/lang/String;)Lo0oo0o/OooO0O0;", C17625c.f52155b, "(Ljava/lang/String;Ljava/lang/String;J)Lo0oo0o/OooO0O0;", "bounds", "(Ljava/lang/String;Landroid/graphics/RectF;)Lo0oo0o/OooO0O0;", "", "Landroid/graphics/PointF;", "polygon", "onLassoEvent", "(Ljava/util/List;)Z", "doesSupportLayer", "()Z", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DummyDisplayItem implements InterfaceC31284OooO0O0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DummyDisplayItem instance = new DummyDisplayItem();

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/penkit/models/DummyDisplayItem$Companion;", "", "<init>", "()V", "instance", "Lcom/orion/penkit/models/DummyDisplayItem;", "getInstance", "()Lcom/orion/penkit/models/DummyDisplayItem;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final DummyDisplayItem getInstance() {
            return DummyDisplayItem.instance;
        }

        private Companion() {
        }
    }

    private DummyDisplayItem() {
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id) {
        OooOOO0.OooO0oO(id, "id");
        return this;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean doesSupportLayer() {
        return false;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBox(float penWidthScale) {
        return new RectF();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public RectF getBoundingBoxWithoutOffset(float f) {
        return getBoundingBox(f);
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public long getCreationTime() {
        return 0L;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getId() {
        return "";
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public int getItemType() {
        return -1;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public String getLayerId() {
        return "";
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void offset(float dx, float dy) {
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public C32443OooOOO<Set<InterfaceC31284OooO0O0>, Set<InterfaceC31284OooO0O0>> onEraserEvent(PointF downCenter, PointF preCenter, PointF center, float f, boolean z, float f2) {
        OooOOO0.OooO0oO(downCenter, "downCenter");
        OooOOO0.OooO0oO(preCenter, "preCenter");
        OooOOO0.OooO0oO(center, "center");
        throw new C32444OooOOO0();
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public boolean onLassoEvent(List<? extends PointF> polygon) {
        OooOOO0.OooO0oO(polygon, "polygon");
        return false;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public <T> void render(o0O0oo00.OooO00o<T> renderEngine, o0O0oo00.OooO0O0<T> renderTarget, float scale) {
        OooOOO0.OooO0oO(renderEngine, "renderEngine");
        OooOOO0.OooO0oO(renderTarget, "renderTarget");
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void rotate(float f, PointF center) {
        OooOOO0.OooO0oO(center, "center");
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public void scale(float zoom, boolean penWidthScale) {
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, RectF bounds) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(bounds, "bounds");
        return this;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return this;
    }

    @Override // o0oo0o.InterfaceC31284OooO0O0
    public InterfaceC31284OooO0O0 deepCopy(String id, String layerId, long creationTime) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(layerId, "layerId");
        return this;
    }
}
