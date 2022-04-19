package spacegame.character;

import javax.swing.ImageIcon;

public class Bullet extends Character {

    public Bullet() {
    }

    public Bullet(int x, int y) {

        initBullet(x, y);
    }

    private void initBullet(int x, int y) {

        var bulletImg = "src/images/shot.png";
        var ii = new ImageIcon(bulletImg);
        setImage(ii.getImage());

        int H_SPACE = 6;
        setX(x + H_SPACE);

        int V_SPACE = 1;
        setY(y - V_SPACE);
    }
}
