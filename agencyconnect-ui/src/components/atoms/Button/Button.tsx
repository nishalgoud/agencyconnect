"use client";
import React from 'react';
import { Button as MUIButton, ButtonProps as MUIButtonProps } from '@mui/material';
import { styled } from '@mui/system';

interface ButtonProps extends MUIButtonProps {
  /**
   * The content of the button.
   */
  label: string;
  /**
   * The variant of the button: text, contained, or outlined.
   */
  variant?: 'text' | 'contained' | 'outlined';
  /**
   * Additional classes for custom styling.
   */
  className?: string;
}

/**
 * Styled button for additional customizations.
 */
const StyledButton = styled(MUIButton)(({ theme }) => ({
  fontSize: '16px',
  textTransform: 'capitalize',
  fontFamily: theme?.typography?.fontFamily || 'Roboto, sans-serif', // Fallback if theme is undefined
  '&:disabled': {
    cursor: 'not-allowed',
    opacity: 0.6,
  },
}));

/**
 * Accessible and reusable Button component using Material UI.
 */
export const Button: React.FC<ButtonProps> = ({
  label,
  variant = 'contained',
  color = 'primary',
  className,
  disabled = false,
  onClick,
  ...rest
}) => {
  return (
    <StyledButton
      variant={variant}
      color={color}
      disabled={disabled}
      className={className}
      onClick={onClick}
      aria-label={label} // Accessibility: Screen reader support
      {...rest}
    >
      {label}
    </StyledButton>
  );
};

