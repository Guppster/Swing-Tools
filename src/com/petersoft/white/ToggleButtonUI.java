package com.petersoft.white;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToggleButtonUI;

public class ToggleButtonUI extends BasicToggleButtonUI {
	AbstractButton button;

	Image normalUpperLeft = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/normal/PButton_normal_upperLeft.png")).getImage();
	Image normalMiddleLeft = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/normal/PButton_normal_middleLeft.png")).getImage();
	Image normalLowerLeft = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/normal/PButton_normal_lowerLeft.png")).getImage();
	Image normalMiddleUpper = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/normal/PButton_normal_middleUpper.png")).getImage();
	Image normalMiddleLower = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/normal/PButton_normal_middleLower.png")).getImage();
	Image normalUpperRight = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/normal/PButton_normal_upperRight.png")).getImage();
	Image normalMiddleRight = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/normal/PButton_normal_middleRight.png")).getImage();
	Image normalLowerRight = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/normal/PButton_normal_lowerRight.png")).getImage();
	// ////////////////////////////////////////////////////////////////
	Image mouseOverUpperLeft = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/mouseOver/PButton_mouseOver_upperLeft.png")).getImage();
	Image mouseOverMiddleLeft = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/mouseOver/PButton_mouseOver_middleLeft.png")).getImage();
	Image mouseOverLowerLeft = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/mouseOver/PButton_mouseOver_lowerLeft.png")).getImage();
	Image mouseOverMiddleUpper = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/mouseOver/PButton_mouseOver_middleUpper.png")).getImage();
	Image mouseOverMiddleLower = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/mouseOver/PButton_mouseOver_middleLower.png")).getImage();
	Image mouseOverUpperRight = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/mouseOver/PButton_mouseOver_upperRight.png")).getImage();
	Image mouseOverMiddleRight = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/mouseOver/PButton_mouseOver_middleRight.png")).getImage();
	Image mouseOverLowerRight = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/mouseOver/PButton_mouseOver_lowerRight.png")).getImage();
	// ////////////////////////////////////////////////////////////////
	Image disableUpperLeft = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/disable/PButton_disable_upperLeft.png")).getImage();
	Image disableMiddleLeft = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/disable/PButton_disable_middleLeft.png")).getImage();
	Image disableLowerLeft = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/disable/PButton_disable_lowerLeft.png")).getImage();
	Image disableMiddleUpper = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/disable/PButton_disable_middleUpper.png")).getImage();
	Image disableMiddleLower = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/disable/PButton_disable_middleLower.png")).getImage();
	Image disableUpperRight = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/disable/PButton_disable_upperRight.png")).getImage();
	Image disableMiddleRight = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/disable/PButton_disable_middleRight.png")).getImage();
	Image disableLowerRight = new ImageIcon(ToggleButtonUI.class.getResource("images/PButton/disable/PButton_disable_lowerRight.png")).getImage();

	public static ComponentUI createUI(final JComponent c) {
		return new ToggleButtonUI();
	}

	public void installUI(JComponent c) {
		super.installUI(c);
		c.setBorder(new EmptyBorder(5, 5, 5, 5));
		c.setOpaque(false);
	}

	public void paint(Graphics g, JComponent c) {
		AbstractButton button = (AbstractButton) c;
		if (c.getParent() instanceof JToolBar) {
			if (button.getModel().isRollover()) {
				g.drawImage(mouseOverUpperLeft, 0, 0, 5, 5, null, null);
				g.drawImage(mouseOverMiddleLeft, 0, 5, 4, button.getHeight() - 10, null, null);
				g.drawImage(mouseOverLowerLeft, 0, button.getHeight() - 5, 5, 5, null, null);

				g.drawImage(mouseOverMiddleUpper, 5, 0, button.getWidth() - 11, 4, null, null);
				g.drawImage(mouseOverMiddleLower, 5, button.getHeight() - 4, button.getWidth() - 11, 4, null, null);

				g.drawImage(mouseOverUpperRight, button.getWidth() - 6, 0, 5, 5, null, null);
				g.drawImage(mouseOverMiddleRight, button.getWidth() - 5, 5, 4, button.getHeight() - 10, null, null);
				g.drawImage(mouseOverLowerRight, button.getWidth() - 6, button.getHeight() - 5, 5, 5, null, null);
			}
		} else {
			if (button.isSelected()) {
				g.setColor(new Color(200, 200, 200));
				g.fillRect(4, 4, button.getWidth() - 8, button.getHeight() - 8);
			}
			// g.setColor(internalBGColor);
			// g.fillRect(4, 4, button.getWidth() - 8, button.getHeight() - 8);
			// }
			// } else {
			// g.setColor(disabledInternalBGColor);
			// g.fillRect(4, 4, button.getWidth() - 8, button.getHeight() - 8);
			// }
			// if (button.isEnabled()) {
			if (button.getModel().isRollover()) {
				g.drawImage(mouseOverUpperLeft, 0, 0, 5, 5, null, null);
				g.drawImage(mouseOverMiddleLeft, 0, 5, 4, button.getHeight() - 10, null, null);
				g.drawImage(mouseOverLowerLeft, 0, button.getHeight() - 5, 5, 5, null, null);

				g.drawImage(mouseOverMiddleUpper, 5, 0, button.getWidth() - 11, 4, null, null);
				g.drawImage(mouseOverMiddleLower, 5, button.getHeight() - 4, button.getWidth() - 11, 4, null, null);

				g.drawImage(mouseOverUpperRight, button.getWidth() - 6, 0, 5, 5, null, null);
				g.drawImage(mouseOverMiddleRight, button.getWidth() - 5, 5, 4, button.getHeight() - 10, null, null);
				g.drawImage(mouseOverLowerRight, button.getWidth() - 6, button.getHeight() - 5, 5, 5, null, null);
			} else {
				g.drawImage(normalUpperLeft, 0, 0, 5, 5, null, null);
				g.drawImage(normalMiddleLeft, 0, 5, 4, button.getHeight() - 10, null, null);
				g.drawImage(normalLowerLeft, 0, button.getHeight() - 5, 5, 5, null, null);

				g.drawImage(normalMiddleUpper, 5, 0, button.getWidth() - 11, 4, null, null);
				g.drawImage(normalMiddleLower, 5, button.getHeight() - 4, button.getWidth() - 11, 4, null, null);

				g.drawImage(normalUpperRight, button.getWidth() - 6, 0, 5, 5, null, null);
				g.drawImage(normalMiddleRight, button.getWidth() - 5, 5, 4, button.getHeight() - 10, null, null);
				g.drawImage(normalLowerRight, button.getWidth() - 6, button.getHeight() - 5, 5, 5, null, null);
			}

		}

		super.paint(g, c);
	}
}