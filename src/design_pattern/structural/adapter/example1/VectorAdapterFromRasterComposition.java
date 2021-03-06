package design_pattern.structural.adapter.example1;

public class VectorAdapterFromRasterComposition implements VectorGraphics {
    RasterGraphics graphics = new RasterGraphics();

    @Override
    public void drawLine() {
        graphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        graphics.drawRasterSquare();
    }
}
