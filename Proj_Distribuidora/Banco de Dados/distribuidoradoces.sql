-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 04-Dez-2024 às 16:37
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `distribuidoradoces`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(10) NOT NULL,
  `nome_categoria` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nome_categoria`) VALUES
(1, 'Jujubas'),
(2, 'Chicletes'),
(3, 'Doces de Frutas'),
(4, 'Balas'),
(5, 'Pirulitos'),
(11, 'Chocolates');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(10) NOT NULL,
  `cpf_cliente` varchar(14) NOT NULL,
  `nome_cliente` varchar(50) NOT NULL,
  `telefone_cliente` varchar(15) NOT NULL,
  `endereco_cliente` varchar(150) NOT NULL,
  `data_nasc` date NOT NULL,
  `status_cliente` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `cpf_cliente`, `nome_cliente`, `telefone_cliente`, `endereco_cliente`, `data_nasc`, `status_cliente`, `senha`) VALUES
(1, '43175846870', 'José da Silva', '(11)97633-5478', 'Rua Cabo C, n° 6', '2003-07-23', 'Ótimo', '12345'),
(2, '512.890.123-88', 'Maria de Souza', '(11)98765-4321', 'Avenida Brasil, n° 45', '1995-10-12', 'Regular', ''),
(3, '213.456.789-00', 'Carlos Pereira', '(21)99887-6543', 'Rua das Flores, n° 22', '1980-04-17', 'Excelente', ''),
(4, '987.654.321-55', 'Ana Costa', '(31)98777-1234', 'Praça da Liberdade, n° 101', '1990-12-25', 'Bom', ''),
(5, '356.633.685-89', 'Fabrícia Oliveira', '(11)45634-5604', 'Rua Cabo B, 239', '2006-03-06', 'Ruim', 'Caramba'),
(13, '09876543212', 'Carlos', '11 987699008', 'Rus', '2006-07-28', 'Bom', 'Jesus'),
(14, '43175846890', 'Jucilei Almeida', '(11) 94349-4883', 'Rua Carlos', '2009-02-20', 'Ruim', 'Caju');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `id_fornecedor` int(10) NOT NULL,
  `nome_fornecedor` varchar(50) NOT NULL,
  `endereco_fornecedor` varchar(150) DEFAULT NULL,
  `telefone_fornecedor` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id_fornecedor`, `nome_fornecedor`, `endereco_fornecedor`, `telefone_fornecedor`) VALUES
(1, '', 'Rua das Flores, 123, Centro', '(11)91234-5678'),
(2, '', 'Avenida Brasil, 456, Jardim', '(11)93456-7890'),
(3, '', 'Rua da Paz, 789, Bairro Novo', '(21)99876-5432'),
(4, '', 'Praça da Liberdade, 10', '(31)98765-4321'),
(5, '', 'Estrada do Sol, 50', '(41)97654-3210');

-- --------------------------------------------------------

--
-- Estrutura da tabela `item_pedido`
--

CREATE TABLE `item_pedido` (
  `id_prod_vendido` int(11) NOT NULL,
  `id_pedido` int(11) DEFAULT NULL,
  `nome_produto` varchar(255) DEFAULT NULL,
  `preco` decimal(10,2) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `total` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `item_pedido`
--

INSERT INTO `item_pedido` (`id_prod_vendido`, `id_pedido`, `nome_produto`, `preco`, `quantidade`, `total`) VALUES
(1, 1, 'Bala de Goma Gomets', '21.70', 2, '43.40'),
(2, 1, 'Blong - Pinta Lingua Azul', '10.19', 2, '20.38'),
(3, 1, 'Jujuba Delikuky Sortidas', '8.40', 2, '16.80'),
(4, 1, 'M&M Chocolate', '3.99', 3, '11.97'),
(5, 2, 'Jujuba Delikuky Sortidas', '8.40', 3, '25.20'),
(6, 2, 'Bala de Goma Gomets', '21.70', 3, '65.10'),
(7, 2, 'Pirulito Chiclete - Bolete', '13.20', 2, '26.40'),
(8, 1, 'Jujuba Delikuky Sortidas', '8.40', 3, '25.20'),
(9, 1, 'Bala de Goma Gomets', '21.70', 3, '65.10'),
(10, 1, 'Pirulito Chiclete - Bolete', '13.20', 2, '26.40'),
(11, 3, 'Bala de Goma Gomets', '21.70', 2, '43.40'),
(12, 1, 'Bala de Goma Gomets', '21.70', 2, '43.40'),
(13, 4, 'Bala de Goma Gomets', '21.70', 4, '86.80'),
(14, 1, 'Bala de Goma Gomets', '21.70', 4, '86.80'),
(15, 1, 'Bala de Goma Gomets', '21.70', 4, '86.80'),
(16, 6, 'Bala de Goma Gomets', '21.70', 3, '65.10'),
(17, 7, 'Bala de Goma Gomets', '21.70', 2, '43.40'),
(18, 7, 'Blong - Pinta Lingua Azul', '10.19', 2, '20.38'),
(19, 7, 'Bubbaloo - Banana', '16.71', 2, '33.42'),
(20, 7, 'Snickers', '62.00', 2, '124.00'),
(21, 8, 'Bala Fini Sabor Banana 100g', '63.99', 2, '127.98'),
(22, 9, 'Florestal - Flopito Cora??o', '13.99', 3, '41.97'),
(23, 9, 'Plutonita - Cabe?a de Abóbora', '14.99', 2, '29.98'),
(24, 9, 'Prestígio Chocloate ao Leite', '47.89', 2, '95.78'),
(25, 10, 'Bala de Goma Gomets', '21.70', 2, '43.40'),
(26, 17, 'Bala de Goma Gomets', '21.70', 1, '21.70'),
(27, 18, '7 Belo - Framboesa ', '15.00', 1, '15.00'),
(28, 19, 'Bala Azedinha - Morango', '11.20', 1, '11.20'),
(29, 20, '7 Belo - Framboesa ', '15.00', 1, '15.00'),
(30, 21, 'Jujuba Delikuky Sortidas', '8.40', 1, '8.40'),
(31, 22, 'Bala Azedinha - Morango', '11.20', 1, '11.20'),
(32, 23, 'Bala de Goma Gomets', '21.70', 1, '21.70'),
(33, 24, 'Bala Fini Sabor Banana 100g', '63.99', 1, '63.99'),
(34, 25, '7 Belo - Framboesa ', '15.00', 1, '15.00'),
(35, 26, '7 Belo - Framboesa ', '15.00', 1, '15.00'),
(36, 27, 'Bala Azedinha - Uva', '8.40', 1, '8.40'),
(37, 28, 'Pirulito BigBig - Tutti Frutti', '12.60', 1, '12.60'),
(38, 28, 'Florestal - Flopito Coração', '13.99', 1, '13.99'),
(39, 28, 'Pirulito Pop - Melancia', '9.99', 1, '9.99'),
(40, 28, 'Florestal - Pop Kiss Cereja', '16.71', 1, '16.71'),
(41, 28, 'Blong - Pinta Lingua Azul', '10.19', 2, '20.38'),
(42, 28, 'Pirulito Chiclete - Bolete', '13.20', 2, '26.40'),
(43, 28, 'Chiclete Spish - Sabor Tutti-Frutti', '13.99', 1, '13.99'),
(44, 29, 'Pirulito BigBig - Tutti Frutti', '12.60', 1, '12.60'),
(45, 29, 'Florestal - Flopito Coração', '13.99', 1, '13.99'),
(46, 29, 'Pirulito Pop - Melancia', '9.99', 1, '9.99'),
(47, 29, 'Florestal - Pop Kiss Cereja', '16.71', 1, '16.71'),
(48, 29, 'Blong - Pinta Lingua Azul', '10.19', 2, '20.38'),
(49, 29, 'Pirulito Chiclete - Bolete', '13.20', 2, '26.40'),
(50, 29, 'Chiclete Spish - Sabor Tutti-Frutti', '13.99', 1, '13.99'),
(51, 31, 'Bubbaloo - Menta', '10.29', 2, '20.58'),
(52, 32, 'Bubbaloo - Banana', '16.71', 1, '16.71'),
(53, 33, 'Bala Azedinha - Morango', '11.20', 1, '11.20'),
(54, 34, 'Jujuba Delikuky Sortidas', '8.40', 4, '33.60'),
(55, 35, 'Blong - Pinta Lingua Azul', '10.19', 1, '10.19'),
(56, 36, 'Pirulito Chiclete - Bolete', '13.20', 1, '13.20'),
(57, 37, 'Twix - Chocolate com Caramelo', '24.99', 1, '24.99'),
(58, 38, 'Bubbaloo - Menta', '10.29', 1, '10.29'),
(59, 39, 'Trident - Hortelã', '11.20', 1, '11.20');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(10) NOT NULL,
  `id_cliente` int(10) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `status_pedido` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `id_cliente`, `data`, `valor_total`, `status_pedido`) VALUES
(1, 1, '2024-10-01', '200.50', 'Concluído'),
(2, 2, '2024-10-02', '350.00', 'Pendente'),
(3, 3, '2024-09-29', '150.99', 'Em processamento'),
(4, 4, '2024-10-03', '450.75', 'Concluído'),
(5, 1, '2024-10-01', '200.50', 'Concluído'),
(6, 14, '2024-11-24', '65.10', NULL),
(7, 14, '2024-11-24', '221.20', NULL),
(8, 14, '2024-11-26', '171.38', NULL),
(9, 14, '2024-11-26', '232.83', NULL),
(10, 1, '2024-11-27', '43.40', NULL),
(11, 1, '2024-12-04', '21.70', NULL),
(12, 1, '2024-12-04', '21.70', NULL),
(13, 1, '2024-12-04', '21.70', NULL),
(14, 1, '2024-12-04', '21.70', NULL),
(15, 1, '2024-12-04', '21.70', NULL),
(16, 1, '2024-12-04', '21.70', NULL),
(17, 1, '2024-12-04', '21.70', NULL),
(18, 1, '2024-12-04', '87.39', NULL),
(19, 1, '2024-12-04', '11.20', NULL),
(20, 1, '2024-12-04', '15.00', NULL),
(21, 1, '2024-12-04', '8.40', NULL),
(22, 1, '2024-12-04', '11.20', NULL),
(23, 1, '2024-12-04', '21.70', NULL),
(24, 1, '2024-12-04', '63.99', NULL),
(25, 1, '2024-12-04', '15.00', NULL),
(26, 1, '2024-12-04', '15.00', NULL),
(27, 1, '2024-12-04', '8.40', NULL),
(28, 1, '2024-12-04', '497.38', NULL),
(29, 1, '2024-12-04', '497.38', NULL),
(31, 1, '2024-12-04', '31.78', NULL),
(32, 1, '2024-12-04', '16.71', NULL),
(33, 1, '2024-12-04', '36.40', NULL),
(34, 1, '2024-12-04', '53.20', NULL),
(35, 1, '2024-12-04', '36.59', NULL),
(36, 1, '2024-12-04', '69.51', NULL),
(37, 1, '2024-12-04', '196.88', NULL),
(38, 1, '2024-12-04', '20.58', NULL),
(39, 1, '2024-12-04', '21.49', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id_produto` int(10) NOT NULL,
  `id_fornecedor` int(10) DEFAULT NULL,
  `id_categoria` int(10) DEFAULT NULL,
  `nome_produto` varchar(50) DEFAULT NULL,
  `valor_unitario` decimal(10,2) DEFAULT NULL,
  `quantidade_estoque` int(5) DEFAULT NULL,
  `quantidade_minima` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id_produto`, `id_fornecedor`, `id_categoria`, `nome_produto`, `valor_unitario`, `quantidade_estoque`, `quantidade_minima`) VALUES
(1, 1, 1, 'Jujuba Delikuky Sortidas', '30.00', 45, 10),
(2, 2, 2, 'Plutonita Baba de Bruxa', '1200.00', 150, 20),
(3, 3, 2, 'Plutonita Cérebro de Zumbi', '800.00', 30, 5),
(4, 1, 3, 'Doce de Abóbora', '950.00', 75, 15),
(5, 4, 4, 'Bala de Yogurt', '450.00', 20, 5),
(11, 1, 2, 'Chiclete Spish- Sabor Uva', '16.60', 25, 10),
(12, 2, 2, 'Chiclete Spish - Sabor Tutti-Frutti', '13.99', 23, 10),
(13, 2, 2, 'Plutonita- Cabeça de Abóbora', '14.99', 23, 15),
(14, 2, 2, 'Bubbaloo - Banana', '16.71', 26, 15),
(15, 3, 2, 'Trident - Hortelã', '10.29', 29, 20),
(16, 3, 2, 'Bubbaloo - Menta', '11.20', 21, 15),
(17, 4, 11, 'Trento Mini - Chocolate ao Leite', '24.90', 30, 20),
(18, 5, 11, 'M&M Amendoim ', '3.99', 30, 15),
(19, 5, 11, 'M&M Chocolate', '3.99', 22, 12),
(20, 5, 11, 'Prestígio Chocloate ao Leite', '47.89', 25, 15),
(21, 5, 11, 'Twix - Chocolate com Caramelo', '24.99', 24, 20),
(22, 5, 11, 'Snickers ', '62.00', 25, 15),
(23, 4, 5, 'Pirulito BigBig - Tutti Frutti', '12.60', 26, 15),
(24, 4, 5, 'Florestal - Flopito Coração', '13.99', 13, 10),
(25, 2, 5, 'Pirulito Pop - Melancia', '9.99', 19, 15),
(26, 2, 5, 'Florestal - Pop Kiss Cereja', '16.71', 23, 15),
(27, 3, 5, 'Pirulito Chiclete - Bolete', '22.99', 20, 15),
(28, 3, 5, 'Blong - Pinta Lingua Azul', '24.99', 29, 20),
(29, 3, 1, 'Bala de Goma Gomets', '21.70', 28, 20),
(30, 2, 4, 'Bala Fini Sabor Banana 100g', '63.99', 24, 15),
(31, 2, 4, '7 Belo - Framboesa ', '78.99', 26, 25),
(32, 3, 4, 'Bala Azedinha - Uva', '8.40', 24, 14),
(33, 2, 4, 'Bala Azedinha - Morango', '8.40', 22, 20);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `cpf` varchar(14) NOT NULL,
  `senha` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`cpf`, `senha`) VALUES
('123', '1234'),
('123456789', '12345');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices para tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Índices para tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  ADD PRIMARY KEY (`id_prod_vendido`),
  ADD KEY `id_pedido` (`id_pedido`);

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_produto`),
  ADD KEY `id_fornecedor` (`id_fornecedor`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id_fornecedor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  MODIFY `id_prod_vendido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_produto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `item_pedido`
--
ALTER TABLE `item_pedido`
  ADD CONSTRAINT `item_pedido_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`);

--
-- Limitadores para a tabela `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedor` (`id_fornecedor`),
  ADD CONSTRAINT `produto_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
