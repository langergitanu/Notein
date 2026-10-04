package com.orion.notein.domain.models.switches;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/switches/BrandHzConfig;", "", "brand", "", "products", "", "Lcom/orion/notein/domain/models/switches/ProductHzConfig;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBrand", "()Ljava/lang/String;", "getProducts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class BrandHzConfig {
    private final String brand;
    private final List<ProductHzConfig> products;

    public BrandHzConfig(String brand, List<ProductHzConfig> products) {
        OooOOO0.OooO0oO(brand, "brand");
        OooOOO0.OooO0oO(products, "products");
        this.brand = brand;
        this.products = products;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrandHzConfig copy$default(BrandHzConfig brandHzConfig, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = brandHzConfig.brand;
        }
        if ((i & 2) != 0) {
            list = brandHzConfig.products;
        }
        return brandHzConfig.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    public final List<ProductHzConfig> component2() {
        return this.products;
    }

    public final BrandHzConfig copy(String brand, List<ProductHzConfig> products) {
        OooOOO0.OooO0oO(brand, "brand");
        OooOOO0.OooO0oO(products, "products");
        return new BrandHzConfig(brand, products);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandHzConfig)) {
            return false;
        }
        BrandHzConfig brandHzConfig = (BrandHzConfig) other;
        return OooOOO0.OooO0O0(this.brand, brandHzConfig.brand) && OooOOO0.OooO0O0(this.products, brandHzConfig.products);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final List<ProductHzConfig> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return this.products.hashCode() + (this.brand.hashCode() * 31);
    }

    public String toString() {
        return "BrandHzConfig(brand=" + this.brand + ", products=" + this.products + ")";
    }
}
