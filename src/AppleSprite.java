public class AppleSprite extends Sprite{
    public AppleSprite(String fileImage, int x, int y) {
        super(fileImage, x, y);
    }

    @Override
    public void move(int dx, int dy) {
        setX(dx);
        setY(dy);
    }
}
