package com.orion.notein.domain.models.switches;

import OooOo.C20485OooOoO;
import OooOooo.C20785Oooo00o;
import com.google.firebase.firestore.util.OooOOO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/notein/domain/models/switches/ProductHzConfig;", "", "product", "", "hz", "", "tools", "", "Lcom/orion/notein/domain/models/switches/ToolHzConfig;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getProduct", "()Ljava/lang/String;", "getHz", "()I", "getTools", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ProductHzConfig {
    private final int hz;
    private final String product;
    private final List<ToolHzConfig> tools;

    public ProductHzConfig(String product, int i, List<ToolHzConfig> list) {
        OooOOO0.OooO0oO(product, "product");
        this.product = product;
        this.hz = i;
        this.tools = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductHzConfig copy$default(ProductHzConfig productHzConfig, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = productHzConfig.product;
        }
        if ((i2 & 2) != 0) {
            i = productHzConfig.hz;
        }
        if ((i2 & 4) != 0) {
            list = productHzConfig.tools;
        }
        return productHzConfig.copy(str, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHz() {
        return this.hz;
    }

    public final List<ToolHzConfig> component3() {
        return this.tools;
    }

    public final ProductHzConfig copy(String product, int hz, List<ToolHzConfig> tools) {
        OooOOO0.OooO0oO(product, "product");
        return new ProductHzConfig(product, hz, tools);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductHzConfig)) {
            return false;
        }
        ProductHzConfig productHzConfig = (ProductHzConfig) other;
        return OooOOO0.OooO0O0(this.product, productHzConfig.product) && this.hz == productHzConfig.hz && OooOOO0.OooO0O0(this.tools, productHzConfig.tools);
    }

    public final int getHz() {
        return this.hz;
    }

    public final String getProduct() {
        return this.product;
    }

    public final List<ToolHzConfig> getTools() {
        return this.tools;
    }

    public int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.hz, this.product.hashCode() * 31, 31);
        List<ToolHzConfig> list = this.tools;
        return iOooO00o + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.product;
        int i = this.hz;
        return OooOOO.OooO0O0(")", C20485OooOoO.OooO0OO(i, "ProductHzConfig(product=", str, ", hz=", ", tools="), this.tools);
    }

    public /* synthetic */ ProductHzConfig(String str, int i, List list, int i2, C24018OooO0oo c24018OooO0oo) {
        this(str, i, (i2 & 4) != 0 ? null : list);
    }
}
